CREATE TABLE `version_info` (
  `ref` int(11) NOT NULL AUTO_INCREMENT COMMENT '流水',
  `version_id` int(11) NOT NULL COMMENT '版本',
  `version_name` varchar(500) NOT NULL COMMENT '版本名称',
  `old_version_id` int(11) NULL COMMENT '旧版本Id',
  `cont_desc` varchar(500) DEFAULT NULL COMMENT '描述',
  `abbreviation` varchar(200) DEFAULT NULL COMMENT '版本简称',
  `is_only_for_primark` int(1) NOT NULL DEFAULT '0' COMMENT '是否只用于小学,0:否，1：是',
  `subject_id` int(11) NOT NULL COMMENT '学科',
  `section_id` int(11) DEFAULT NULL COMMENT '学段',
  `c_time` datetime NOT NULL,
  `c_user_id` int(11) DEFAULT NULL,
  `m_time` datetime DEFAULT NULL,
  `m_user_id` int(11) DEFAULT NULL,
  `active` int(1) NOT NULL DEFAULT '1' COMMENT '有效状态，1:有效 0:无效',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `idx_vid` (`version_id`),
  KEY `idx_subject_id` (`subject_id`),
  KEY `idx_old_vid` (`old_version_id`),
  KEY `idx_section_id` (`section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8