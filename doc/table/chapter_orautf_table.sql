/*
SQLyog Ultimate v11.42 (64 bit)
MySQL - 5.5.56 : Database - orautf
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
/*Table structure for table `dc_tp_course_info_new` */

CREATE TABLE `dc_tp_course_info_new` (
  `ref` bigint(19) NOT NULL,
  `course_id` bigint(19) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(200) NOT NULL,
  `res_pkg_id` bigint(19) DEFAULT NULL,
  `parent_id` bigint(19) DEFAULT NULL,
  `root_id` bigint(19) DEFAULT NULL,
  `route_id` varchar(1000) DEFAULT NULL,
  `route_name` varchar(1000) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `status` bigint(19) DEFAULT NULL,
  `c_user_id` int(11) DEFAULT NULL,
  `c_time` datetime DEFAULT NULL,
  `m_time` datetime DEFAULT NULL,
  `m_user_id` int(11) DEFAULT NULL,
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`course_id`),
  KEY `idx_course_id` (`course_id`),
  KEY `idx_node_id` (`res_pkg_id`),
  KEY `idx_root_id` (`root_id`),
  KEY `idx_parent_id` (`parent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000100001 DEFAULT CHARSET=utf8;

/*Table structure for table `j_ab_paper_question` */

CREATE TABLE `j_ab_paper_question` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `node_id` bigint(19) NOT NULL COMMENT '节点id',
  `paper_id` bigint(19) NOT NULL COMMENT '试卷id',
  `paper_type` char(1) NOT NULL COMMENT '试卷类型:A/B',
  `question_id` bigint(19) NOT NULL COMMENT '试题Id',
  `sort` bigint(2) DEFAULT NULL COMMENT '排序号',
  `is_direct` bigint(2) DEFAULT '0' COMMENT '是否直属,0:否1:是',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_AB_PAPER_QUESTION_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_AB_PAPER_QUESTION_PAPER_ID` (`paper_id`),
  KEY `IDX_J_AB_PAPER_QUESTION_NODE_ID` (`node_id`),
  KEY `IDX_J_AB_PAPER_QUESTION_QUES_ID` (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='节点,ab卷和试题关系表';

/*Table structure for table `j_ab_paper_question_del` */

CREATE TABLE `j_ab_paper_question_del` (
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
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='节点,ab卷和试题关系表';

/*Table structure for table `j_material_node_info` */

CREATE TABLE `j_material_node_info` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `list_id` bigint(19) NOT NULL COMMENT '教材Id',
  `dir_id` bigint(19) NOT NULL COMMENT '节点id',
  `list_dir_name` varchar(256) DEFAULT NULL COMMENT '节点名称',
  `order_id` int(5) DEFAULT NULL COMMENT '排序号',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_MATERIAL_NODE_INFO_GGS_TIME` (`ggs_time`),
  KEY `idx_list_id` (`list_id`),
  KEY `idx_dir_id` (`dir_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='教材和章节目录关系表';

/*Table structure for table `j_material_node_info_del` */

CREATE TABLE `j_material_node_info_del` (
   ref                  bigint(19) not null auto_increment comment '自增主键',
   list_id              bigint(19) not null comment '教材Id',
   dir_id               bigint(19) not null comment '节点id',
   list_dir_name        varchar(256) comment '节点名称',
   order_id             int(5) comment '排序号',
   ggs_time             timestamp not null default CURRENT_TIMESTAMP,
   primary key (ref),
   KEY `idx_list_id` (`list_id`),
   KEY `idx_dir_id` (`dir_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教材和章节目录关系表';

/*Table structure for table `j_micro_course_resource` */

CREATE TABLE `j_micro_course_resource` (
  `ref` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `module_id` bigint(18) NOT NULL COMMENT '微课程id',
  `resource_id` bigint(18) NOT NULL COMMENT '资源Id',
  `resource_type` int(3) NOT NULL COMMENT '资源类型',
  `sort_num` int(2) NOT NULL DEFAULT '1' COMMENT '排序号',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_MICRO_COURSE_RESOURCE_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_MICRO_COURSE_RESOURCE_MODULE_ID` (`module_id`),
  KEY `IDX_J_MICRO_COURSE_RESOURCE_RESOURCE_ID` (`resource_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='微课和资源关系表';

/*Table structure for table `j_micro_course_resource_del` */

CREATE TABLE `j_micro_course_resource_del` (
  `ref` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `module_id` bigint(18) NOT NULL COMMENT '微课程id',
  `resource_id` bigint(18) NOT NULL COMMENT '资源Id',
  `resource_type` int(3) NOT NULL COMMENT '资源类型',
  `sort_num` int(2) NOT NULL DEFAULT '1' COMMENT '排序号',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_MICRO_COURSE_RESOURCE_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_MICRO_COURSE_RESOURCE_MODULE_ID` (`module_id`),
  KEY `IDX_J_MICRO_COURSE_RESOURCE_RESOURCE_ID` (`resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微课和资源关系表';

/*Table structure for table `j_micro_course_rs_ques` */

CREATE TABLE `j_micro_course_rs_ques` (
  `ref` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `resource_id` bigint(18) NOT NULL COMMENT '资源id',
  `question_id` bigint(18) NOT NULL COMMENT '试题id',
  `paper_sort` int(1) NOT NULL DEFAULT '0' COMMENT '排序号',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_MICRO_COURSE_RS_QUES_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_MICRO_COURSE_RS_QUES_RESOURCE_ID` (`resource_id`),
  KEY `IDX_J_MICRO_COURSE_RS_QUES_QUESTION_ID` (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='微课程下微视频和试题的关系表';

/*Table structure for table `j_micro_course_rs_ques_del` */

CREATE TABLE `j_micro_course_rs_ques_del` (
  `ref` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `resource_id` bigint(18) NOT NULL COMMENT '资源id',
  `question_id` bigint(18) NOT NULL COMMENT '试题id',
  `paper_sort` int(1) NOT NULL DEFAULT '0' COMMENT '排序号',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_MICRO_COURSE_RS_QUES_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_MICRO_COURSE_RS_QUES_RESOURCE_ID` (`resource_id`),
  KEY `IDX_J_MICRO_COURSE_RS_QUES_QUESTION_ID` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微课程下微视频和试题的关系表';

/*Table structure for table `j_node_micro_course` */

CREATE TABLE `j_node_micro_course` (
  `ref` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `node_id` bigint(18) NOT NULL COMMENT '节点id',
  `course_id` bigint(18) NOT NULL COMMENT '微课程id',
  `sort_num` int(2) DEFAULT NULL COMMENT '排序号',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `m_user_id` bigint(18) DEFAULT NULL COMMENT '更新人',
  `m_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_NODE_MICRO_COURSE_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_NODE_MICRO_COURSE_NODE_ID` (`node_id`),
  KEY `IDX_J_NODE_MICRO_COURSE_COURSE_ID` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='节点和微课的关系表';

/*Table structure for table `j_node_micro_course_del` */

CREATE TABLE `j_node_micro_course_del` (
  `ref` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `node_id` bigint(18) NOT NULL COMMENT '节点id',
  `course_id` bigint(18) NOT NULL COMMENT '微课程id',
  `sort_num` int(2) DEFAULT NULL COMMENT '排序号',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `m_user_id` bigint(18) DEFAULT NULL COMMENT '更新人',
  `m_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_J_NODE_MICRO_COURSE_GGS_TIME` (`ggs_time`),
  KEY `IDX_J_NODE_MICRO_COURSE_NODE_ID` (`node_id`),
  KEY `IDX_J_NODE_MICRO_COURSE_COURSE_ID` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='节点和微课的关系表';

/*Table structure for table `j_node_question` */

CREATE TABLE `j_node_question` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `section_id` int(11) NOT NULL COMMENT '学段',
  `subject_id` int(11) NOT NULL COMMENT '学科',
  `version_id` int(11) NOT NULL COMMENT '版本ID',
  `node_id` bigint(19) NOT NULL COMMENT '节点ID',
  `node_level` int(5) NOT NULL COMMENT '知识点层级',
  `is_direct` int(1) NOT NULL DEFAULT '0' COMMENT '1:直属',
  `question_id` bigint(19) NOT NULL COMMENT '试题ID',
  `c_time` datetime NOT NULL COMMENT '创建时间',
  `c_user_id` bigint(19) DEFAULT NULL COMMENT '创建人',
  `m_time` datetime DEFAULT NULL COMMENT '修改时间',
  `m_user_id` bigint(19) DEFAULT NULL COMMENT '修改人',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '同步时间',
  PRIMARY KEY (`ref`),
  KEY `idx_ques_id` (`question_id`),
  KEY `idx_node_id` (`node_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='节点试题关系表';

/*Table structure for table `j_node_question_del` */

CREATE TABLE `j_node_question_del` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `section_id` int(11) NOT NULL COMMENT '学段',
  `subject_id` int(11) NOT NULL COMMENT '学科',
  `version_id` int(11) NOT NULL COMMENT '版本ID',
  `node_id` bigint(19) NOT NULL COMMENT '节点ID',
  `node_level` int(5) NOT NULL COMMENT '知识点层级',
  `is_direct` int(2) NOT NULL DEFAULT '0' COMMENT '直属',
  `question_id` bigint(19) NOT NULL COMMENT '试题ID',
  `c_time` datetime NOT NULL COMMENT '创建时间',
  `c_user_id` bigint(19) DEFAULT NULL COMMENT '创建人',
  `m_time` datetime DEFAULT NULL COMMENT '修改时间',
  `m_user_id` bigint(19) DEFAULT NULL COMMENT '修改人',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '同步时间',
  PRIMARY KEY (`ref`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='节点试题关系删除表';

/*Table structure for table `j_node_resources` */

CREATE TABLE `j_node_resources` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT,
  `resource_id` bigint(19) NOT NULL,
  `dir_id` bigint(19) NOT NULL,
  `item_id` int(5) DEFAULT NULL,
  `is_direct` int(1) NOT NULL DEFAULT '0',
  `resource_type` int(4) DEFAULT '0',
  `c_time` datetime NOT NULL,
  `m_time` datetime DEFAULT NULL,
  `c_user_id` bigint(19) DEFAULT NULL,
  `m_user_id` bigint(19) DEFAULT NULL,
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `idx_res_id` (`resource_id`),
  KEY `idx_dir_id` (`dir_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='节点和资源关系表';

/*Table structure for table `j_node_resources_del` */

CREATE TABLE `j_node_resources_del` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT,
  `resource_id` bigint(19) NOT NULL,
  `dir_id` bigint(19) NOT NULL,
  `item_id` int(5) DEFAULT NULL,
  `is_direct` int(1) NOT NULL DEFAULT '0',
  `resource_type` int(4) DEFAULT '0',
  `c_time` datetime NOT NULL,
  `m_time` datetime DEFAULT NULL,
  `c_user_id` bigint(19) DEFAULT NULL,
  `m_user_id` bigint(19) DEFAULT NULL,
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `idx_res_id` (`resource_id`),
  KEY `idx_dir_id` (`dir_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='节点和资源关系表';

/*Table structure for table `material_info` */

CREATE TABLE `material_info` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `id` bigint(19) NOT NULL COMMENT '教材ID',
  `name` varchar(2000) NOT NULL COMMENT '教材名称',
  `type_id` int(11) NOT NULL COMMENT '版本ID',
  `grade_id` int(11) NOT NULL COMMENT '年级',
  `subject_id` int(11) NOT NULL COMMENT '学科',
  `state_id` int(1) NOT NULL COMMENT '状态  1=开放',
  `school_id` int(11) NOT NULL COMMENT '所属分校 默认 0  总校',
  `show_order` int(5) NOT NULL COMMENT '顺序',
  `c_time` datetime NOT NULL COMMENT '创建时间',
  `c_user_id` bigint(19) DEFAULT NULL COMMENT '创建人',
  `m_time` datetime DEFAULT NULL COMMENT '修改时间',
  `m_user_id` bigint(19) DEFAULT NULL COMMENT '修改人',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '同步时间',
  PRIMARY KEY (`ref`),
  KEY `ak_material_id` (`id`),
  KEY `idx_material_id` (`id`),
  KEY `idx_material_version_id` (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='教材信息表';

/*Table structure for table `material_info_del` */

CREATE TABLE `material_info_del` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '流水号',
  `id` bigint(19) NOT NULL COMMENT '教材ID',
  `name` varchar(2000) NOT NULL COMMENT '教材名称',
  `type_id` int(11) NOT NULL COMMENT '版本ID',
  `grade_id` int(11) NOT NULL COMMENT '年级',
  `subject_id` int(11) NOT NULL COMMENT '学科',
  `state_id` int(1) NOT NULL COMMENT '状态  1=开放',
  `school_id` int(11) NOT NULL COMMENT '所属分校 默认 0  总校',
  `show_order` int(5) NOT NULL COMMENT '顺序',
  `c_time` datetime NOT NULL COMMENT '创建时间',
  `c_user_id` bigint(19) DEFAULT NULL COMMENT '创建人',
  `m_time` datetime DEFAULT NULL COMMENT '修改时间',
  `m_user_id` bigint(19) DEFAULT NULL COMMENT '修改人',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '同步时间',
  PRIMARY KEY (`ref`),
  KEY `ak_material_id` (`id`),
  KEY `idx_material_id` (`id`),
  KEY `idx_material_version_id` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教材信息表';

/*Table structure for table `micro_course_info` */

CREATE TABLE `micro_course_info` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `course_id` bigint(19) NOT NULL COMMENT '微课程Id',
  `course_name` varchar(100) NOT NULL COMMENT '微课程名称',
  `enable` int(1) NOT NULL DEFAULT '0' COMMENT '是否有效,0:无效,1:有效',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `m_user_id` bigint(18) DEFAULT NULL COMMENT '更新人',
  `m_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_MICRO_COURSE_INFO_GGS_TIME` (`ggs_time`),
  KEY `IDX_MICRO_COURSE_INFO_COURSE_ID` (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='微课程信息表';

/*Table structure for table `micro_course_info_del` */

CREATE TABLE `micro_course_info_del` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `course_id` bigint(19) NOT NULL COMMENT '微课程Id',
  `course_name` varchar(100) NOT NULL COMMENT '微课程名称',
  `enable` int(1) NOT NULL DEFAULT '0' COMMENT '是否有效,0:无效,1:有效',
  `c_user_id` bigint(18) DEFAULT NULL COMMENT '创建人',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `m_user_id` bigint(18) DEFAULT NULL COMMENT '更新人',
  `m_time` datetime DEFAULT NULL COMMENT '更新时间',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `IDX_MICRO_COURSE_INFO_GGS_TIME` (`ggs_time`),
  KEY `IDX_MICRO_COURSE_INFO_COURSE_ID` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='微课程信息表';

/*Table structure for table `node_info` */

CREATE TABLE `node_info` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `id` bigint(9) NOT NULL COMMENT '节点id',
  `name` varchar(256) DEFAULT NULL COMMENT '节点名称',
  `grade_id` int(2) DEFAULT NULL COMMENT '年级id',
  `subject_id` int(2) DEFAULT NULL COMMENT '学科id',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `m_time` datetime DEFAULT NULL COMMENT '修改时间',
  `c_user_id` bigint(19) DEFAULT NULL COMMENT '创建人',
  `m_user_id` bigint(19) DEFAULT NULL COMMENT '修改人',
  `enable` int(1) DEFAULT NULL COMMENT '是否有效 0:无效,1:有效',
  `parent_id` bigint(19) DEFAULT NULL COMMENT '父节点id',
  `root_id` bigint(19) DEFAULT NULL COMMENT '根节点id即章id',
  `route_id` varchar(1000) DEFAULT NULL COMMENT '节点路径id,按|分割',
  `route_name` varchar(1000) DEFAULT NULL COMMENT '节点路径名称,按|分割',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `level` int(2) DEFAULT NULL COMMENT '层级,1:章,2:节,3:知识点',
  PRIMARY KEY (`ref`),
  KEY `IDX_NODE_INFO_GGSTIME` (`ggs_time`),
  KEY `IDX_NODE_INFO_ID` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='节点信息表';

/*Table structure for table `node_info_del` */

CREATE TABLE `node_info_del` (
  `ref` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `id` bigint(9) NOT NULL COMMENT '节点id',
  `name` varchar(256) DEFAULT NULL COMMENT '节点名称',
  `grade_id` int(2) DEFAULT NULL COMMENT '年级id',
  `subject_id` int(2) DEFAULT NULL COMMENT '学科id',
  `c_time` datetime DEFAULT NULL COMMENT '创建时间',
  `m_time` datetime DEFAULT NULL COMMENT '修改时间',
  `c_user_id` bigint(19) DEFAULT NULL COMMENT '创建人',
  `m_user_id` bigint(19) DEFAULT NULL COMMENT '修改人',
  `enable` int(1) DEFAULT NULL COMMENT '是否有效 0:无效,1:有效',
  `parent_id` bigint(19) DEFAULT NULL COMMENT '父节点id',
  `root_id` bigint(19) DEFAULT NULL COMMENT '根节点id即章id',
  `route_id` varchar(1000) DEFAULT NULL COMMENT '节点路径id,按|分割',
  `route_name` varchar(1000) DEFAULT NULL COMMENT '节点路径名称,按|分割',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `level` int(2) DEFAULT NULL COMMENT '层级,1:章,2:节,3:知识点',
  PRIMARY KEY (`ref`),
  KEY `IDX_NODE_INFO_GGSTIME` (`ggs_time`),
  KEY `IDX_NODE_INFO_ID` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='节点信息表';

/*Table structure for table `version_info` */

CREATE TABLE `version_info` (
  `ref` int(11) NOT NULL AUTO_INCREMENT COMMENT '流水',
  `version_id` int(11) NOT NULL COMMENT '版本',
  `version_name` varchar(500) NOT NULL COMMENT '版本名称',
  `old_version_id` int(11) DEFAULT NULL COMMENT '旧版本Id',
  `cont_desc` varchar(500) DEFAULT NULL COMMENT '描述',
  `abbreviation` varchar(200) DEFAULT NULL COMMENT '版本简称',
  `is_only_for_primark` int(1) NOT NULL DEFAULT '0' COMMENT '是否只用于小学,0:否，1：是',
  `subject_id` int(11) NOT NULL COMMENT '学科',
  `section_id` int(11) DEFAULT NULL COMMENT '学段',
  `c_time` datetime NOT NULL,
  `c_user_id` int(11) DEFAULT NULL,
  `m_time` datetime DEFAULT NULL,
  `m_user_id` int(11) DEFAULT NULL,
  `active` int(1) NOT NULL DEFAULT '1' COMMENT '有效状态，1:有效 0:无效',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `idx_vid` (`version_id`),
  KEY `idx_subject_id` (`subject_id`),
  KEY `idx_old_vid` (`old_version_id`),
  KEY `idx_section_id` (`section_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*Table structure for table `version_info_del` */

CREATE TABLE `version_info_del` (
  `ref` int(11) NOT NULL AUTO_INCREMENT COMMENT '流水',
  `version_id` int(11) NOT NULL COMMENT '版本',
  `version_name` varchar(500) NOT NULL COMMENT '版本名称',
  `old_version_id` int(11) DEFAULT NULL COMMENT '旧版本Id',
  `cont_desc` varchar(500) DEFAULT NULL COMMENT '描述',
  `abbreviation` varchar(200) DEFAULT NULL COMMENT '版本简称',
  `is_only_for_primark` int(1) NOT NULL DEFAULT '0' COMMENT '是否只用于小学,0:否，1：是',
  `subject_id` int(11) NOT NULL COMMENT '学科',
  `section_id` int(11) DEFAULT NULL COMMENT '学段',
  `c_time` datetime NOT NULL,
  `c_user_id` int(11) DEFAULT NULL,
  `m_time` datetime DEFAULT NULL,
  `m_user_id` int(11) DEFAULT NULL,
  `active` int(1) NOT NULL DEFAULT '1' COMMENT '有效状态，1:有效 0:无效',
  `ggs_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ref`),
  KEY `idx_vid` (`version_id`),
  KEY `idx_subject_id` (`subject_id`),
  KEY `idx_old_vid` (`old_version_id`),
  KEY `idx_section_id` (`section_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
