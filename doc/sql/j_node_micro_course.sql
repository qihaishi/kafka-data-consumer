-- drop index IDX_J_NODE_MICRO_COURSE_COURSE_ID on j_node_micro_course;
--
-- drop index IDX_J_NODE_MICRO_COURSE_NODE_ID on j_node_micro_course;
--
-- drop index IDX_J_NODE_MICRO_COURSE_GGS_TIME on j_node_micro_course;

drop table if exists j_node_micro_course;

/*==============================================================*/
/* Table: j_node_micro_course                                   */
/*==============================================================*/
create table j_node_micro_course
(
   ref                  bigint(18) not null auto_increment comment '自增主键',
   node_id              bigint(18) not null comment '节点id',
   course_id            bigint(18) not null comment '微课程id',
   sort_num             int(2) comment '排序号',
   c_user_id            bigint(18) comment '创建人',
   c_time               datetime comment '创建时间',
   m_user_id            bigint(18) comment '更新人',
   m_time               datetime comment '更新时间',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref)
);

alter table j_node_micro_course comment '节点和微课的关系表';

/*==============================================================*/
/* Index: IDX_J_NODE_MICRO_COURSE_GGS_TIME                      */
/*==============================================================*/
create index IDX_J_NODE_MICRO_COURSE_GGS_TIME on j_node_micro_course
(
   ggs_time
);

/*==============================================================*/
/* Index: IDX_J_NODE_MICRO_COURSE_NODE_ID                       */
/*==============================================================*/
create index IDX_J_NODE_MICRO_COURSE_NODE_ID on j_node_micro_course
(
   node_id
);

/*==============================================================*/
/* Index: IDX_J_NODE_MICRO_COURSE_COURSE_ID                     */
/*==============================================================*/
create index IDX_J_NODE_MICRO_COURSE_COURSE_ID on j_node_micro_course
(
   course_id
);
