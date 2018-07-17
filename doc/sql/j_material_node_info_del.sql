-- drop index IDX_J_MATERIAL_NODE_INFO_GGS_TIME on j_material_node_info_del;

drop table if exists j_material_node_info_del;

/*==============================================================*/
/* Table: j_material_node_info_del                              */
/*==============================================================*/
create table j_material_node_info_del
(
   ref                  bigint(19) not null auto_increment comment '自增主键',
   list_id              bigint(19) not null comment '教材Id',
   dir_id               bigint(19) not null comment '节点id',
   list_dir_name        varchar(256) comment '节点名称',
   order_id             int(5) comment '排序号',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref),
   KEY `idx_list_id` (`list_id`),
   KEY `idx_dir_id` (`dir_id`)
);

alter table j_material_node_info_del comment '教材和章节目录关系表';

/*==============================================================*/
/* Index: IDX_J_MATERIAL_NODE_INFO_GGS_TIME                     */
/*==============================================================*/
create index IDX_J_MATERIAL_NODE_INFO_GGS_TIME on j_material_node_info_del
(
   ggs_time
);
