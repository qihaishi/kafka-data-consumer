/*
drop index IDX_NODE_INFO_ID on node_info_del;

drop index IDX_NODE_INFO_GGSTIME on node_info_del;

drop table if exists node_info_del;
*/

/*==============================================================*/
/* Table: node_info_del                                         */
/*==============================================================*/
create table node_info_del
(
   ref                  bigint(19) not null auto_increment comment '自增主键',
   id                   bigint(9) not null comment '节点id',
   name                 varchar(256) comment '节点名称',
   grade_id             int(2) comment '年级id',
   subject_id           int(2) comment '学科id',
   c_time               datetime comment '创建时间',
   m_time               datetime comment '修改时间',
   c_user_id            bigint(19) comment '创建人',
   m_user_id            bigint(19) comment '修改人',
   enable               int(1) comment '是否有效 0:无效,1:有效',
   parent_id            bigint(19) comment '父节点id',
   root_id              bigint(19) comment '根节点id即章id',
   route_id             varchar(1000) comment '节点路径id,按|分割',
   route_name           varchar(1000) comment '节点路径名称,按|分割',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   level                int(2) comment '层级,1:章,2:节,3:知识点',
   primary key (ref)
);

alter table node_info_del comment '节点信息表';

/*==============================================================*/
/* Index: IDX_NODE_INFO_GGSTIME                                 */
/*==============================================================*/
create index IDX_NODE_INFO_GGSTIME on node_info_del
(
   ggs_time
);

/*==============================================================*/
/* Index: IDX_NODE_INFO_ID                                      */
/*==============================================================*/
create index IDX_NODE_INFO_ID on node_info_del
(
   id
);
