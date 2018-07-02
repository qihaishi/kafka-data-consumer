-- drop index IDX_J_MICRO_COURSE_RS_QUES_QUESTION_ID on j_micro_course_rs_ques_del;
--
-- drop index IDX_J_MICRO_COURSE_RS_QUES_RESOURCE_ID on j_micro_course_rs_ques_del;
--
-- drop index IDX_J_MICRO_COURSE_RS_QUES_GGS_TIME on j_micro_course_rs_ques_del;

drop table if exists j_micro_course_rs_ques_del;

/*==============================================================*/
/* Table: j_micro_course_rs_ques_del                            */
/*==============================================================*/
create table j_micro_course_rs_ques_del
(
   ref                  bigint(18) not null auto_increment comment '自增主键',
   resource_id          bigint(18) not null comment '资源id',
   question_id          bigint(18) not null comment '试题id',
   paper_sort           int(1) not null default 0 comment '排序号',
   c_user_id            bigint(18) not null comment '创建人',
   c_time               datetime not null comment '创建时间',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref)
);

alter table j_micro_course_rs_ques_del comment '微课程下微视频和试题的关系表';

/*==============================================================*/
/* Index: IDX_J_MICRO_COURSE_RS_QUES_GGS_TIME                   */
/*==============================================================*/
create index IDX_J_MICRO_COURSE_RS_QUES_GGS_TIME on j_micro_course_rs_ques_del
(
   ggs_time
);

/*==============================================================*/
/* Index: IDX_J_MICRO_COURSE_RS_QUES_RESOURCE_ID                */
/*==============================================================*/
create index IDX_J_MICRO_COURSE_RS_QUES_RESOURCE_ID on j_micro_course_rs_ques_del
(
   resource_id
);

/*==============================================================*/
/* Index: IDX_J_MICRO_COURSE_RS_QUES_QUESTION_ID                */
/*==============================================================*/
create index IDX_J_MICRO_COURSE_RS_QUES_QUESTION_ID on j_micro_course_rs_ques_del
(
   question_id
);
