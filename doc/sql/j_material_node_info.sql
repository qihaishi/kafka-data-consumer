-- drop index IDX_J_MATERIAL_NODE_INFO_GGS_TIME on j_material_node_info;

drop table if exists j_material_node_info;
CREATE TABLE `j_material_node_info` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `list_id` bigint(19) NOT NULL COMMENT '教材Id',
  `dir_id` bigint(19) NOT NULL COMMENT '节点id',
  `list_dir_name` varchar(256) DEFAULT NULL COMMENT '节点名称',
  `order_id` int(5) DEFAULT NULL COMMENT '排序号',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_MATERIAL_NODE_INFO_GGS_TIME` (`ggs_time`),
  KEY `idx_list_id` (`list_id`),
  KEY `idx_dir_id` (`dir_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教材和章节目录关系表'