/*
MySQL Data Transfer
Source Host: localhost
Source Database: angularjs
Target Host: localhost
Target Database: angularjs
Date: 2014/9/24 22:05:42
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for t_mobile
-- ----------------------------
CREATE TABLE `t_mobile` (
  `id` int(11) NOT NULL auto_increment,
  `mobile` varchar(20) default NULL,
  `name` varchar(50) default NULL,
  `position` varchar(50) default NULL,
  `avart` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `t_mobile` VALUES ('31', '1324567734342', '胡承淞', 'CEO', '1.gif');
INSERT INTO `t_mobile` VALUES ('32', '18726534251', '天蓬元帅', null, '2.jpg');
INSERT INTO `t_mobile` VALUES ('33', '1873949563', '托尔斯泰', null, '2.jpg');
INSERT INTO `t_mobile` VALUES ('34', 'test', 'test', 'test', '2.jpg');
INSERT INTO `t_mobile` VALUES ('35', '123476382496', '沙僧', '三师弟', '3.jpg');
