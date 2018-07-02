
CREATE TABLE oragbk.j_node_resources_del
(
   ref                  BIGINT(19) NOT NULL AUTO_INCREMENT,
   resource_id          BIGINT(19) NOT NULL,
   dir_id               BIGINT(19) NOT NULL,
   item_id              INT(5),
   resource_type        INT(4) DEFAULT 0,
   c_time               DATETIME NOT NULL,
   m_time               DATETIME,
   c_user_id            BIGINT(19),
   m_user_id            BIGINT(19),
   ggs_time             TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
   PRIMARY KEY (ref)
);

ALTER TABLE oragbk.j_node_resources_del COMMENT '节点和资源关系表';

/*==============================================================*/
/* Index: idx_res_id                                            */
/*==============================================================*/
CREATE INDEX idx_res_id ON oragbk.j_node_resources_del
(
   resource_id
);

/*==============================================================*/
/* Index: idx_dir_id                                            */
/*==============================================================*/
CREATE INDEX idx_dir_id ON oragbk.j_node_resources_del
(
   dir_id
);