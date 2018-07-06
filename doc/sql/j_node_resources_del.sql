
drop index idx_dir_id on oragbk.j_node_resources_del;

drop index idx_res_id on oragbk.j_node_resources_del;

drop table if exists oragbk.j_node_resources_del;

/*==============================================================*/
/* Table: j_node_resources_del                                  */
/*==============================================================*/
create table oragbk.j_node_resources_del
(
   ref                  bigint(19) not null auto_increment,
   resource_id          bigint(19) not null,
   dir_id               bigint(19) not null,
   item_id              int(5),
   is_direct            int(1) not null default 0,
   resource_type        int(4) default 0,
   c_time               datetime not null,
   m_time               datetime,
   c_user_id            bigint(19),
   m_user_id            bigint(19),
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref)
);

alter table oragbk.j_node_resources_del comment '节点和资源关系表';

/*==============================================================*/
/* Index: idx_res_id                                            */
/*==============================================================*/
create index idx_res_id on oragbk.j_node_resources_del
(
   resource_id
);

/*==============================================================*/
/* Index: idx_dir_id                                            */
/*==============================================================*/
create index idx_dir_id on oragbk.j_node_resources_del
(
   dir_id
);
