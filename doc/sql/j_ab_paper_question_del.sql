-- drop index IDX_J_AB_PAPER_QUESTION_PAPER_ID on j_ab_paper_question_del;
--
-- drop index IDX_J_AB_PAPER_QUESTION_GGS_TIME on j_ab_paper_question_del;

drop table if exists j_ab_paper_question_del;

/*==============================================================*/
/* Table: j_ab_paper_question_del                               */
/*==============================================================*/
create table j_ab_paper_question_del
(
   ref                  bigint(19) not null auto_increment comment '自增主键',
   node_id              bigint(19) not null comment '节点id',
   paper_id             bigint(19) not null comment '节点id',
   paper_type           char(1) not null comment '试卷类型:A/B',
   question_id          bigint(19) not null comment '试题Id',
   sort                 bigint(2) comment '排序号',
   is_direct            bigint(2) default 0 comment '是否直属,0:否1:是',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref),
   KEY `IDX_J_AB_PAPER_QUESTION_GGS_TIME` (`ggs_time`),
   KEY `IDX_J_AB_PAPER_QUESTION_PAPER_ID` (`paper_id`),
   KEY `IDX_J_AB_PAPER_QUESTION_NODE_ID` (`node_id`),
   KEY `IDX_J_AB_PAPER_QUESTION_QUES_ID` (`question_id`)
) comment '节点,ab卷和试题关系表';
