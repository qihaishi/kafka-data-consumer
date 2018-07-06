-- drop index IDX_J_MICRO_COURSE_RESOURCE_RESOURCE_ID on j_micro_course_resource_del;
--
-- drop index IDX_J_MICRO_COURSE_RESOURCE_MODULE_ID on j_micro_course_resource_del;
--
-- drop index IDX_J_MICRO_COURSE_RESOURCE_GGS_TIME on j_micro_course_resource_del;

drop table if exists j_micro_course_resource_del;

/*==============================================================*/
/* Table: j_micro_course_resource_del                           */
/*==============================================================*/
create table j_micro_course_resource_del
(
   ref                  bigint(18) not null auto_increment comment '自增主键',
   module_id            bigint(18) not null comment '微课程id',
   resource_id          bigint(18) not null comment '资源Id',
   resource_type        int(3) not null comment '资源类型',
   sort_num             int(2) not null default 1 comment '排序号',
   c_user_id            bigint(18) comment '创建人',
   c_time               datetime comment '创建时间',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref)
);

alter table j_micro_course_resource_del comment '微课和资源关系表';

/*==============================================================*/
/* Index: IDX_J_MICRO_COURSE_RESOURCE_GGS_TIME                  */
/*==============================================================*/
create index IDX_J_MICRO_COURSE_RESOURCE_GGS_TIME on j_micro_course_resource_del
(
   ggs_time
);

/*==============================================================*/
/* Index: IDX_J_MICRO_COURSE_RESOURCE_MODULE_ID                 */
/*==============================================================*/
create index IDX_J_MICRO_COURSE_RESOURCE_MODULE_ID on j_micro_course_resource_del
(
   module_id
);

/*==============================================================*/
/* Index: IDX_J_MICRO_COURSE_RESOURCE_RESOURCE_ID               */
/*==============================================================*/
create index IDX_J_MICRO_COURSE_RESOURCE_RESOURCE_ID on j_micro_course_resource_del
(
   resource_id
);
