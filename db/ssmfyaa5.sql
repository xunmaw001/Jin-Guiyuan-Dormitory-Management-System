-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmfyaa5
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmfyaa5`
--

/*!40000 DROP DATABASE IF EXISTS `ssmfyaa5`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmfyaa5` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmfyaa5`;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `louyuxinxi`
--

DROP TABLE IF EXISTS `louyuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `louyuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `louyumingcheng` varchar(200) DEFAULT NULL COMMENT '楼宇名称',
  `louyuweizhi` varchar(200) DEFAULT NULL COMMENT '楼宇位置',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='楼宇信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `louyuxinxi`
--

LOCK TABLES `louyuxinxi` WRITE;
/*!40000 ALTER TABLE `louyuxinxi` DISABLE KEYS */;
INSERT INTO `louyuxinxi` VALUES (31,'2023-03-22 10:50:34','楼宇名称1','楼宇位置1'),(32,'2023-03-22 10:50:34','楼宇名称2','楼宇位置2'),(33,'2023-03-22 10:50:34','楼宇名称3','楼宇位置3'),(34,'2023-03-22 10:50:34','楼宇名称4','楼宇位置4'),(35,'2023-03-22 10:50:34','楼宇名称5','楼宇位置5'),(36,'2023-03-22 10:50:34','楼宇名称6','楼宇位置6'),(37,'2023-03-22 10:50:34','楼宇名称7','楼宇位置7'),(38,'2023-03-22 10:50:34','楼宇名称8','楼宇位置8');
/*!40000 ALTER TABLE `louyuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suguan`
--

DROP TABLE IF EXISTS `suguan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suguan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `suguanzhanghao` varchar(200) NOT NULL COMMENT '宿管账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `suguanxingming` varchar(200) NOT NULL COMMENT '宿管姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `suguanzhanghao` (`suguanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='宿管';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suguan`
--

LOCK TABLES `suguan` WRITE;
/*!40000 ALTER TABLE `suguan` DISABLE KEYS */;
INSERT INTO `suguan` VALUES (21,'2023-03-22 10:50:34','宿管账号1','123456','宿管姓名1','男',1,'13823888881','upload/suguan_touxiang1.jpg'),(22,'2023-03-22 10:50:34','宿管账号2','123456','宿管姓名2','男',2,'13823888882','upload/suguan_touxiang2.jpg'),(23,'2023-03-22 10:50:34','宿管账号3','123456','宿管姓名3','男',3,'13823888883','upload/suguan_touxiang3.jpg'),(24,'2023-03-22 10:50:34','宿管账号4','123456','宿管姓名4','男',4,'13823888884','upload/suguan_touxiang4.jpg'),(25,'2023-03-22 10:50:34','宿管账号5','123456','宿管姓名5','男',5,'13823888885','upload/suguan_touxiang5.jpg'),(26,'2023-03-22 10:50:34','宿管账号6','123456','宿管姓名6','男',6,'13823888886','upload/suguan_touxiang6.jpg'),(27,'2023-03-22 10:50:34','宿管账号7','123456','宿管姓名7','男',7,'13823888887','upload/suguan_touxiang7.jpg'),(28,'2023-03-22 10:50:34','宿管账号8','123456','宿管姓名8','男',8,'13823888888','upload/suguan_touxiang8.jpg');
/*!40000 ALTER TABLE `suguan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushegenghuan`
--

DROP TABLE IF EXISTS `sushegenghuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushegenghuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `genghuanhousushe` varchar(200) DEFAULT NULL COMMENT '更换后宿舍',
  `genghuanshijian` datetime DEFAULT NULL COMMENT '更换时间',
  `genghuanyuanyin` longtext COMMENT '更换原因',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `suguanzhanghao` varchar(200) DEFAULT NULL COMMENT '宿管账号',
  `suguanxingming` varchar(200) DEFAULT NULL COMMENT '宿管姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='宿舍更换';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushegenghuan`
--

LOCK TABLES `sushegenghuan` WRITE;
/*!40000 ALTER TABLE `sushegenghuan` DISABLE KEYS */;
INSERT INTO `sushegenghuan` VALUES (61,'2023-03-22 10:50:34','宿舍号1','更换后宿舍1','2023-03-22 18:50:34','更换原因1','学号1','姓名1','宿管账号1','宿管姓名1'),(62,'2023-03-22 10:50:34','宿舍号2','更换后宿舍2','2023-03-22 18:50:34','更换原因2','学号2','姓名2','宿管账号2','宿管姓名2'),(63,'2023-03-22 10:50:34','宿舍号3','更换后宿舍3','2023-03-22 18:50:34','更换原因3','学号3','姓名3','宿管账号3','宿管姓名3'),(64,'2023-03-22 10:50:34','宿舍号4','更换后宿舍4','2023-03-22 18:50:34','更换原因4','学号4','姓名4','宿管账号4','宿管姓名4'),(65,'2023-03-22 10:50:34','宿舍号5','更换后宿舍5','2023-03-22 18:50:34','更换原因5','学号5','姓名5','宿管账号5','宿管姓名5'),(66,'2023-03-22 10:50:34','宿舍号6','更换后宿舍6','2023-03-22 18:50:34','更换原因6','学号6','姓名6','宿管账号6','宿管姓名6'),(67,'2023-03-22 10:50:34','宿舍号7','更换后宿舍7','2023-03-22 18:50:34','更换原因7','学号7','姓名7','宿管账号7','宿管姓名7'),(68,'2023-03-22 10:50:34','宿舍号8','更换后宿舍8','2023-03-22 18:50:34','更换原因8','学号8','姓名8','宿管账号8','宿管姓名8');
/*!40000 ALTER TABLE `sushegenghuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushexinxi`
--

DROP TABLE IF EXISTS `sushexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `suoshulouyu` varchar(200) DEFAULT NULL COMMENT '所属楼宇',
  `louceng` varchar(200) DEFAULT NULL COMMENT '楼层',
  `zuidaruzhurenshu` int(11) DEFAULT NULL COMMENT '最大入住人数',
  `yizhurenshu` int(11) DEFAULT NULL COMMENT '已住人数',
  `suguanzhanghao` varchar(200) DEFAULT NULL COMMENT '宿管账号',
  `suguanxingming` varchar(200) DEFAULT NULL COMMENT '宿管姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='宿舍信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushexinxi`
--

LOCK TABLES `sushexinxi` WRITE;
/*!40000 ALTER TABLE `sushexinxi` DISABLE KEYS */;
INSERT INTO `sushexinxi` VALUES (41,'2023-03-22 10:50:34','宿舍号1','所属楼宇1','楼层1',1,1,'宿管账号1','宿管姓名1'),(42,'2023-03-22 10:50:34','宿舍号2','所属楼宇2','楼层2',2,2,'宿管账号2','宿管姓名2'),(43,'2023-03-22 10:50:34','宿舍号3','所属楼宇3','楼层3',3,3,'宿管账号3','宿管姓名3'),(44,'2023-03-22 10:50:34','宿舍号4','所属楼宇4','楼层4',4,4,'宿管账号4','宿管姓名4'),(45,'2023-03-22 10:50:34','宿舍号5','所属楼宇5','楼层5',5,5,'宿管账号5','宿管姓名5'),(46,'2023-03-22 10:50:34','宿舍号6','所属楼宇6','楼层6',6,6,'宿管账号6','宿管姓名6'),(47,'2023-03-22 10:50:34','宿舍号7','所属楼宇7','楼层7',7,7,'宿管账号7','宿管姓名7'),(48,'2023-03-22 10:50:34','宿舍号8','所属楼宇8','楼层8',8,8,'宿管账号8','宿管姓名8');
/*!40000 ALTER TABLE `sushexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuisuxinxi`
--

DROP TABLE IF EXISTS `tuisuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuisuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `suoshulouyu` varchar(200) DEFAULT NULL COMMENT '所属楼宇',
  `louceng` varchar(200) DEFAULT NULL COMMENT '楼层',
  `tuisushijian` datetime DEFAULT NULL COMMENT '退宿时间',
  `tuisuyuanyin` longtext COMMENT '退宿原因',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `suguanzhanghao` varchar(200) DEFAULT NULL COMMENT '宿管账号',
  `suguanxingming` varchar(200) DEFAULT NULL COMMENT '宿管姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='退宿信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuisuxinxi`
--

LOCK TABLES `tuisuxinxi` WRITE;
/*!40000 ALTER TABLE `tuisuxinxi` DISABLE KEYS */;
INSERT INTO `tuisuxinxi` VALUES (71,'2023-03-22 10:50:34','宿舍号1','所属楼宇1','楼层1','2023-03-22 18:50:34','退宿原因1','学号1','姓名1','宿管账号1','宿管姓名1'),(72,'2023-03-22 10:50:34','宿舍号2','所属楼宇2','楼层2','2023-03-22 18:50:34','退宿原因2','学号2','姓名2','宿管账号2','宿管姓名2'),(73,'2023-03-22 10:50:34','宿舍号3','所属楼宇3','楼层3','2023-03-22 18:50:34','退宿原因3','学号3','姓名3','宿管账号3','宿管姓名3'),(74,'2023-03-22 10:50:34','宿舍号4','所属楼宇4','楼层4','2023-03-22 18:50:34','退宿原因4','学号4','姓名4','宿管账号4','宿管姓名4'),(75,'2023-03-22 10:50:34','宿舍号5','所属楼宇5','楼层5','2023-03-22 18:50:34','退宿原因5','学号5','姓名5','宿管账号5','宿管姓名5'),(76,'2023-03-22 10:50:34','宿舍号6','所属楼宇6','楼层6','2023-03-22 18:50:34','退宿原因6','学号6','姓名6','宿管账号6','宿管姓名6'),(77,'2023-03-22 10:50:34','宿舍号7','所属楼宇7','楼层7','2023-03-22 18:50:34','退宿原因7','学号7','姓名7','宿管账号7','宿管姓名7'),(78,'2023-03-22 10:50:34','宿舍号8','所属楼宇8','楼层8','2023-03-22 18:50:34','退宿原因8','学号8','姓名8','宿管账号8','宿管姓名8');
/*!40000 ALTER TABLE `tuisuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','管理员','2023-03-22 10:50:34');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xuehao` varchar(200) NOT NULL COMMENT '学号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `banji` varchar(200) DEFAULT NULL COMMENT '班级',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xuehao` (`xuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2023-03-22 10:50:34','学号1','123456','姓名1','男',1,'班级1','13823888881','upload/xuesheng_touxiang1.jpg'),(12,'2023-03-22 10:50:34','学号2','123456','姓名2','男',2,'班级2','13823888882','upload/xuesheng_touxiang2.jpg'),(13,'2023-03-22 10:50:34','学号3','123456','姓名3','男',3,'班级3','13823888883','upload/xuesheng_touxiang3.jpg'),(14,'2023-03-22 10:50:34','学号4','123456','姓名4','男',4,'班级4','13823888884','upload/xuesheng_touxiang4.jpg'),(15,'2023-03-22 10:50:34','学号5','123456','姓名5','男',5,'班级5','13823888885','upload/xuesheng_touxiang5.jpg'),(16,'2023-03-22 10:50:34','学号6','123456','姓名6','男',6,'班级6','13823888886','upload/xuesheng_touxiang6.jpg'),(17,'2023-03-22 10:50:34','学号7','123456','姓名7','男',7,'班级7','13823888887','upload/xuesheng_touxiang7.jpg'),(18,'2023-03-22 10:50:34','学号8','123456','姓名8','男',8,'班级8','13823888888','upload/xuesheng_touxiang8.jpg');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhusuxinxi`
--

DROP TABLE IF EXISTS `zhusuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhusuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `suoshulouyu` varchar(200) DEFAULT NULL COMMENT '所属楼宇',
  `louceng` varchar(200) DEFAULT NULL COMMENT '楼层',
  `ruzhushijian` datetime DEFAULT NULL COMMENT '入住时间',
  `xuehao` varchar(200) DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `suguanzhanghao` varchar(200) DEFAULT NULL COMMENT '宿管账号',
  `suguanxingming` varchar(200) DEFAULT NULL COMMENT '宿管姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='住宿信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhusuxinxi`
--

LOCK TABLES `zhusuxinxi` WRITE;
/*!40000 ALTER TABLE `zhusuxinxi` DISABLE KEYS */;
INSERT INTO `zhusuxinxi` VALUES (51,'2023-03-22 10:50:34','宿舍号1','所属楼宇1','楼层1','2023-03-22 18:50:34','学号1','姓名1','宿管账号1','宿管姓名1'),(52,'2023-03-22 10:50:34','宿舍号2','所属楼宇2','楼层2','2023-03-22 18:50:34','学号2','姓名2','宿管账号2','宿管姓名2'),(53,'2023-03-22 10:50:34','宿舍号3','所属楼宇3','楼层3','2023-03-22 18:50:34','学号3','姓名3','宿管账号3','宿管姓名3'),(54,'2023-03-22 10:50:34','宿舍号4','所属楼宇4','楼层4','2023-03-22 18:50:34','学号4','姓名4','宿管账号4','宿管姓名4'),(55,'2023-03-22 10:50:34','宿舍号5','所属楼宇5','楼层5','2023-03-22 18:50:34','学号5','姓名5','宿管账号5','宿管姓名5'),(56,'2023-03-22 10:50:34','宿舍号6','所属楼宇6','楼层6','2023-03-22 18:50:34','学号6','姓名6','宿管账号6','宿管姓名6'),(57,'2023-03-22 10:50:34','宿舍号7','所属楼宇7','楼层7','2023-03-22 18:50:34','学号7','姓名7','宿管账号7','宿管姓名7'),(58,'2023-03-22 10:50:34','宿舍号8','所属楼宇8','楼层8','2023-03-22 18:50:34','学号8','姓名8','宿管账号8','宿管姓名8');
/*!40000 ALTER TABLE `zhusuxinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-22 18:53:02
