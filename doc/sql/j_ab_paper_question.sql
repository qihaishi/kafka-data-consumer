-- drop index IDX_J_AB_PAPER_QUESTION_PAPER_ID on j_ab_paper_question;
--
-- drop index IDX_J_AB_PAPER_QUESTION_GGS_TIME on j_ab_paper_question;

drop table if exists j_ab_paper_question;

/*==============================================================*/
/* Table: j_ab_paper_question                                   */
/*==============================================================*/
create table j_ab_paper_question
(
   ref                  bigint(19) not null auto_increment comment '自增主键',
   node_id              bigint(19) not null comment '节点id',
   paper_id             bigint(19) not null comment '试卷id',
   paper_type           char(1) not null comment '试卷类型:A/B',
   question_id          bigint(19) not null comment '试题Id',
   sort                 bigint(2) comment '排序号',
   is_direct            bigint(2) default 0 comment '是否直属,0:否1:是',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref)
);

alter table j_ab_paper_question comment '节点,ab卷和试题关系表';

/*==============================================================*/
/* Index: IDX_J_AB_PAPER_QUESTION_GGS_TIME                      */
/*==============================================================*/
create index IDX_J_AB_PAPER_QUESTION_GGS_TIME on j_ab_paper_question
(
   ggs_time
);

/*==============================================================*/
/* Index: IDX_J_AB_PAPER_QUESTION_PAPER_ID                      */
/*==============================================================*/
create index IDX_J_AB_PAPER_QUESTION_PAPER_ID on j_ab_paper_question
(
   paper_id
);
