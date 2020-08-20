/*
 Navicat Premium Data Transfer

 Source Server         : 阿里服务器
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : 60.205.247.46:3306
 Source Schema         : learn_db

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 21/08/2020 01:48:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ums_user
-- ----------------------------
DROP TABLE IF EXISTS `ums_user`;
CREATE TABLE `ums_user`  (
  `ums_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `ums_username` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `ums_nickname` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `ums_password` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `ums_phone` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户手机号',
  `ums_email` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户邮箱',
  `ums_role` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户角色',
  PRIMARY KEY (`ums_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ums_user
-- ----------------------------
INSERT INTO `ums_user` VALUES (1, 'admin1', '大毛', '123456', '198461130', '1624000875@qq.com', 'vip4');
INSERT INTO `ums_user` VALUES (2, 'admin2', '呆毛', '123456', '12341234123', '123@qq,com', 'vip5');
INSERT INTO `ums_user` VALUES (3, 'admin3', NULL, '', '', '', NULL);
INSERT INTO `ums_user` VALUES (4, 'admin4', NULL, '', '', '', NULL);
INSERT INTO `ums_user` VALUES (5, 'user5', NULL, '123', '123', '123', NULL);
INSERT INTO `ums_user` VALUES (6, 'user6', '123', '123', '123', '123', NULL);
INSERT INTO `ums_user` VALUES (7, 'user7', '123', '123', '123', '123', NULL);
INSERT INTO `ums_user` VALUES (8, 'user8', '123', '123', '123', '123', NULL);
INSERT INTO `ums_user` VALUES (9, '1239', '123', '123', '1231', '213', NULL);
INSERT INTO `ums_user` VALUES (10, '162475@qq.com10', '123', '123', '123', '123', NULL);
INSERT INTO `ums_user` VALUES (11, '162475@qq.com11', '123', '123', '123', '123', NULL);
INSERT INTO `ums_user` VALUES (12, 'lisi12', '23123', '12312', '312', '3123', NULL);
INSERT INTO `ums_user` VALUES (13, 'lisi13', '23123', '12312', '312', '3123', NULL);
INSERT INTO `ums_user` VALUES (14, 'superbaby14', 'asdf', 'da\'s', 'fdsa', 'dasfasd', 'vip3');
INSERT INTO `ums_user` VALUES (15, '16240875@qq.com15', 'fdas', 'fd', '321', '312', 'vip1');
INSERT INTO `ums_user` VALUES (16, '16240875@qq.com16', '231231', '12312', '23131', '23131', 'vip3');
INSERT INTO `ums_user` VALUES (17, '16240875@qq.com17', '31231', '123321', '3213131', '3123131', 'vip1');
INSERT INTO `ums_user` VALUES (18, '1624875@qq.com18', '12312', '123', '1231231', '3123213', 'vip4');
INSERT INTO `ums_user` VALUES (19, 'superbaby20', 'damao', 'admin', '12345678901', '123@qq.com', 'vip5');
INSERT INTO `ums_user` VALUES (20, 'superbaby21', 'damao', 'admin', '12345678901', '123@qq.com', 'vip5');
INSERT INTO `ums_user` VALUES (21, 'root22', '13', '123456', '170495', '1625@qq.com', 'vip4');
INSERT INTO `ums_user` VALUES (22, 'root23', '123', '123', '17760495', '162400875@qq.com', 'vip4');

SET FOREIGN_KEY_CHECKS = 1;
