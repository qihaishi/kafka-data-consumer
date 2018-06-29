/*==============================================================*/
/* Table: material_info                                         */
/*==============================================================*/
create table material_info
(
   ref                  bigint(19) not null auto_increment comment '流水号',
   id                   bigint(19) not null comment '教材ID',
   name                 varchar(2000) not null comment '教材名称',
   type_id              int(11) not null comment '版本ID',
   grade_id             int(11) not null comment '年级',
   subject_id           int(11) not null comment '学科',
   state_id             int(1) not null comment '状态  1=开放',
   school_id            int(11) not null comment '所属分校 默认 0  总校',
   show_order           int(5) not null comment '顺序',
   c_time               datetime not null comment '创建时间',
   c_user_id            bigint(19) comment '创建人',
   m_time               datetime comment '修改时间',
   m_user_id            bigint(19) comment '修改人',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP comment '同步时间',
   primary key (ref),
   key ak_material_id (id)
)ENGINE=InnoDB DEFAULT CHARSET=gbk;

alter table material_info comment '教材信息表';

/*==============================================================*/
/* Index: idx_material_id                                       */
/*==============================================================*/
create index idx_material_id on material_info
(
   id
);

/*==============================================================*/
/* Index: idx_material_version_id                               */
/*==============================================================*/
create index idx_material_version_id on material_info
(
   type_id
);