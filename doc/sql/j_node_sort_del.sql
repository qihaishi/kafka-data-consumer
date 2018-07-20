/*==============================================================*/
/* Table: j_node_sort_del                                       */
/*==============================================================*/
CREATE TABLE j_node_sort_del
(
   ref                  BIGINT(19) NOT NULL AUTO_INCREMENT COMMENT '流水号',
   section_id           INT(11) NOT NULL COMMENT '学段',
   subject_id           INT(11) NOT NULL COMMENT '学科',
   version_id           INT(11) NOT NULL COMMENT '版本ID',
   grade_id             INT(11) NOT NULL COMMENT '年级',
   material_id          BIGINT(19) NOT NULL COMMENT '教材',
   node_id              BIGINT(19) NOT NULL COMMENT '节点ID',
   node_sort_num        INT(11) NOT NULL COMMENT '节点顺序',
   node_level           INT(5) NOT NULL COMMENT '节点层级',
   parent_id            BIGINT(19) NOT NULL COMMENT '节点父ID',
   root_id              BIGINT(19) NOT NULL COMMENT '节点根ID',
   node_path            VARCHAR(4000) NOT NULL COMMENT '节点路径',
   c_time               DATETIME NOT NULL COMMENT '创建时间',
   c_user_id            BIGINT(19) COMMENT '创建人',
   m_time               DATETIME COMMENT '修改时间',
   m_user_id            BIGINT(19) COMMENT '修改人',
   ggs_time             TIMESTAMP NOT NULL DEFAULT  CURRENT_TIMESTAMP COMMENT '同步时间',
   PRIMARY KEY (ref)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;;

ALTER TABLE j_node_sort_del COMMENT '版本树节点顺序删除表';