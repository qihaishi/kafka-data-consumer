CREATE TABLE `dc_tp_course_info_new` (
  `ref` bigint(19) NOT NULL,
  `course_id` bigint(19) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(200) NOT NULL,
  `res_pkg_id` bigint(19) DEFAULT NULL,
  `parent_id` bigint(19) DEFAULT NULL,
  `root_id` bigint(19) DEFAULT NULL,
  `route_id` varchar(1000) DEFAULT NULL,
  `route_name` varchar(1000) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `status` bigint(19) DEFAULT NULL,
  `c_user_id` int(11) DEFAULT NULL,
  `c_time` datetime DEFAULT NULL,
  `m_time` datetime DEFAULT NULL,
  `m_user_id` int(11) DEFAULT NULL,
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`course_id`),
  KEY `idx_course_id` (`course_id`),
  KEY `idx_node_id` (`res_pkg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000100001 DEFAULT CHARSET=utf8