/*==============================================================*/
/* Table: j_node_question_snap                                       */
/*==============================================================*/
CREATE TABLE `j_node_question_snap` (
  `ref` BIGINT(19) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `section_id` INT(11) NOT NULL COMMENT '学段',
  `subject_id` INT(11) NOT NULL COMMENT '学科',
  `version_id` INT(11) NOT NULL COMMENT '版本ID',
  `node_id` BIGINT(19) NOT NULL COMMENT '节点ID',
  `node_level` INT(5) NOT NULL COMMENT '知识点层级',
  `question_id` BIGINT(19) NOT NULL COMMENT '试题ID',
  `is_direct` INT(1) NOT NULL DEFAULT '0' COMMENT '1:直属',
  `subject_type` INT(5) COMMENT '文理标记 -1=文；1=理；0=通用',
  `c_time` DATETIME NOT NULL COMMENT '创建时间',
  `c_user_id` BIGINT(19) DEFAULT NULL COMMENT '创建人',
  `m_time` DATETIME DEFAULT NULL COMMENT '修改时间',
  `m_user_id` BIGINT(19) DEFAULT NULL COMMENT '修改人',
  `ggs_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '同步时间',
  PRIMARY KEY (`ref`),
  KEY `idx_ques_id` (`question_id`),
  KEY `idx_node_id` (`node_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='节点试题关系快照表';