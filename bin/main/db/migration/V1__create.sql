DROP TABLE IF EXISTS `hr_server_config`;
CREATE TABLE `hr_server_config` (
  `id` bigint(20) unsigned NOT NULL,
  `url` varchar(64) NOT NULL DEFAULT '' COMMENT '服务路径',
  `name` varchar(255) NOT NULL COMMENT '服务名称',
  `module` varchar(64) NOT NULL DEFAULT '' COMMENT '模块名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='服务管理';

insert into `hr_server_config` (`id`, `url`, `name`, `module`) values('1040077121557397505','/api/funcRegister/list','节点列表','organization');
insert into `hr_server_config` (`id`, `url`, `name`, `module`) values('1040077227576819713','/api/funcRegister/save','节点保存','organization');
insert into `hr_server_config` (`id`, `url`, `name`, `module`) values('1040077362687934466','/api/menuitemReg/save','菜单保存','organization');
insert into `hr_server_config` (`id`, `url`, `name`, `module`) values('1040077391284699138','/api/menuitemReg/list','菜单列表','organization');


DROP TABLE IF EXISTS `hr_func_register`;
CREATE TABLE `hr_func_register` (
  `id` bigint(20) unsigned NOT NULL,
  `url` varchar(64) NOT NULL DEFAULT '' COMMENT '节点路径',
  `name` varchar(255) NOT NULL COMMENT '节点名称',
  `code` varchar(64) NOT NULL COMMENT '节点编码',
  `description` varchar(255) COMMENT '描述',
  `module` varchar(64) NOT NULL DEFAULT '' COMMENT '所属模块',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='节点注册';

DROP TABLE IF EXISTS `hr_menuitem_reg`;
CREATE TABLE `hr_menuitem_reg` (
  `id` BIGINT(20) UNSIGNED NOT NULL,
  `funcode` VARCHAR(64) COMMENT '节点编码',
  `name` VARCHAR(255) NOT NULL COMMENT '菜单名称',
  `code` VARCHAR(64) NOT NULL COMMENT '菜单编码',
  `description` VARCHAR(255) COMMENT '描述',
  `module` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '所属模块',
  `pid` BIGINT(20) NOT NULL COMMENT '父菜单主键',
  `iconUrl` VARCHAR(64) COMMENT '图标',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='菜单注册';