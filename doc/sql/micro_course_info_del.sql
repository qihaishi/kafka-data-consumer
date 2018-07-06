-- drop index IDX_MICRO_COURSE_INFO_COURSE_ID on micro_course_info_del;
--
-- drop index IDX_MICRO_COURSE_INFO_GGS_TIME on micro_course_info_del;
--
drop table if exists micro_course_info_del;

/*==============================================================*/
/* Table: micro_course_info_del                                 */
/*==============================================================*/
create table micro_course_info_del
(
   ref                  bigint(19) not null auto_increment comment '自增主键',
   course_id            bigint(19) not null comment '微课程Id',
   course_name          varchar(100) not null comment '微课程名称',
   enable               int(1) not null default 0 comment '是否有效,0:无效,1:有效',
   c_user_id            bigint(18) comment '创建人',
   c_time               datetime comment '创建时间',
   m_user_id            bigint(18) comment '更新人',
   m_time               datetime comment '更新时间',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref)
);

alter table micro_course_info_del comment '微课程信息表';

/*==============================================================*/
/* Index: IDX_MICRO_COURSE_INFO_GGS_TIME                        */
/*==============================================================*/
create index IDX_MICRO_COURSE_INFO_GGS_TIME on micro_course_info_del
(
   ggs_time
);

/*==============================================================*/
/* Index: IDX_MICRO_COURSE_INFO_COURSE_ID                       */
/*==============================================================*/
create index IDX_MICRO_COURSE_INFO_COURSE_ID on micro_course_info_del
(
   course_id
);
