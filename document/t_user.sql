CREATE TABLE `t_user` (
  `id` varchar(64) NOT NULL COMMENT 'id',
  `name` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '登录密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';


INSERT INTO `t_user` VALUES ('1', 'test', '111111', '2017-4-19 17:21:31');
INSERT INTO `t_user` VALUES ('10', 'aaa1', '111111', '2017-4-19 17:21:31');
INSERT INTO `t_user` VALUES ('11', 'aaa2', '111111', '2017-5-19 17:21:31');
INSERT INTO `t_user` VALUES ('2', 'aaa3', '111111', '2017-5-19 17:21:31');
INSERT INTO `t_user` VALUES ('3', 'aaa4', '111111', '2017-5-19 17:21:31');
INSERT INTO `t_user` VALUES ('4', 'aaa5', '111111', '2017-5-19 17:21:31');
INSERT INTO `t_user` VALUES ('5', 'aaa6', '111111', '2017-6-19 17:21:31');
INSERT INTO `t_user` VALUES ('6', 'aaa7', '111111', '2017-7-19 17:21:31');
INSERT INTO `t_user` VALUES ('7', 'aaa8', '111111', '2017-7-19 17:21:31');
INSERT INTO `t_user` VALUES ('8', 'aaa9', '111111', '2017-8-19 17:21:31');
INSERT INTO `t_user` VALUES ('9', 'aaa0', '111111', '2017-9-19 17:21:31');
