-- drop index IDX_J_AB_PAPER_QUESTION_PAPER_ID on j_ab_paper_question;
--
-- drop index IDX_J_AB_PAPER_QUESTION_GGS_TIME on j_ab_paper_question;

drop table if exists j_ab_paper_question;
CREATE TABLE `j_ab_paper_question` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `node_id` bigint(19) NOT NULL COMMENT '节点id',
  `paper_id` bigint(19) NOT NULL COMMENT '试卷id',
  `paper_type` char(1) NOT NULL COMMENT '试卷类型:A/B',
  `question_id` bigint(19) NOT NULL COMMENT '试题Id',
  `sort` bigint(2) DEFAULT NULL COMMENT '排序号',
  `is_direct` bigint(2) DEFAULT '0' COMMENT '是否直属,0:否1:是',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_AB_PAPER_QUESTION_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_AB_PAPER_QUESTION_PAPER_ID` (`paper_id`),
  KEY `IDX_J_AB_PAPER_QUESTION_NODE_ID` (`node_id`),
  KEY `IDX_J_AB_PAPER_QUESTION_QUES_ID` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='节点,ab卷和试题关系表'