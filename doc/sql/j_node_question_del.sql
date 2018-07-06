create table j_node_question_del
(
   ref                  bigint(19) not null auto_increment comment '流水号',
   section_id           int(11) not null comment '学段',
   subject_id           int(11) not null comment '学科',
   version_id           int(11) not null comment '版本ID',
   node_id              bigint(19) not null comment '节点ID',
   node_level           int(5) not null comment '知识点层级',
   question_id          bigint(19) not null comment '试题ID',
   c_time               datetime not null comment '创建时间',
   c_user_id            bigint(19) comment '创建人',
   m_time               datetime comment '修改时间',
   m_user_id            bigint(19) comment '修改人',
   ggs_time             TIMESTAMP not null default  CURRENT_TIMESTAMP comment '同步时间',
   primary key (ref)
);

alter table j_node_question_del comment '节点试题关系删除表';