DELIMITER $$

CREATE DEFINER=`schu`@`%` EVENT `auto_generate_node_question_snap` ON SCHEDULE EVERY 1 DAY STARTS '2018-08-17 05:00:00' ON COMPLETION PRESERVE ENABLE DO BEGIN
		-- 总树资源管理AB卷检查试题超纲使用快照表
		BEGIN
			DECLARE tmp_section_id INT;
			DECLARE tmp_subject_id INT;
			DECLARE tmp_version_id INT;
			DECLARE tmp_node_id BIGINT(19);
			DECLARE tmp_node_level INT;-- 节点层级，区分章节、知识点
			DECLARE tmp_question_id BIGINT(19);
			DECLARE tmp_direct INT;-- 直属
			DECLARE tmp_subject_type INT;-- 文理

			DECLARE tmp_num INT;-- 数量

			DECLARE cursor_down INT DEFAULT 0;


			DECLARE update_node_questions CURSOR FOR
			SELECT section_id,subject_id,version_id,node_id,node_level,question_id,is_direct,subject_type FROM j_node_question WHERE ggs_time>NOW()-INTERVAL 24 HOUR;

			DECLARE del_node_questions CURSOR FOR
			SELECT section_id,subject_id,version_id,node_id,node_level,question_id,is_direct,subject_type FROM j_node_question_del WHERE ggs_time>NOW()-INTERVAL 24 HOUR;


			DECLARE CONTINUE HANDLER FOR NOT FOUND SET cursor_down = 1;

			-- 删除
			OPEN del_node_questions;
			_loop:LOOP
			FETCH del_node_questions INTO tmp_section_id,tmp_subject_id,tmp_version_id,tmp_node_id,tmp_node_level,tmp_question_id,tmp_direct,tmp_subject_type;
				IF cursor_down=1 THEN
					LEAVE _loop;
				END IF;

				DELETE FROM j_node_question_snap WHERE node_id=tmp_node_id AND question_id=tmp_question_id;
			END LOOP _loop;
			CLOSE del_node_questions;

			SET cursor_down = 0;

			-- 插入或更新
			OPEN update_node_questions;
			_loop:LOOP
			FETCH update_node_questions INTO tmp_section_id,tmp_subject_id,tmp_version_id,tmp_node_id,tmp_node_level,tmp_question_id,tmp_direct,tmp_subject_type;
				IF cursor_down=1 THEN
					LEAVE _loop;
				END IF;

				SELECT COUNT(*) INTO tmp_num FROM j_node_question_snap WHERE node_id=tmp_node_id AND question_id=tmp_question_id;

				IF tmp_num=0 THEN
					INSERT INTO j_node_question_snap(section_id,subject_id,version_id,node_id,node_level,question_id,is_direct,subject_type,c_time,ggs_time) VALUES
					(tmp_section_id,tmp_subject_id,tmp_version_id,tmp_node_id,tmp_node_level,tmp_question_id,tmp_direct,tmp_subject_type,NOW(),NOW());
				ELSE
					UPDATE j_node_question_snap
					SET section_id=tmp_section_id,subject_id=tmp_subject_id,version_id=tmp_version_id,is_Direct=tmp_direct,subject_type=tmp_subject_type,m_time=NOW(),ggs_time=NOW()
					WHERE node_id=tmp_node_id AND question_id=tmp_question_id;
				END IF;
			END LOOP _loop;
			CLOSE update_node_questions;
		END;

	END$$

DELIMITER ;