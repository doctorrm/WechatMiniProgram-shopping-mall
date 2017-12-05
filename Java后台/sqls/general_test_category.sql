CREATE DATABASE  IF NOT EXISTS `general_test` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `general_test`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: general_test
-- ------------------------------------------------------
-- Server version	5.6.26-log

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category` (
  `cat_id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(255) DEFAULT NULL,
  `cat_type` varchar(255) DEFAULT NULL,
  `banner` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cat_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'T恤','tixu','http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/main.jpg'),(2,'毛衣','maoyi','http://127.0.0.1:8080/images/雪纺衫夏2017大码女装镂空荷叶边甜美上衣t恤衬衣加肥加大胖妹妹-淘宝网雪纺衫夏2017大码女装镂空荷叶边甜美上衣t恤衬衣加肥加大胖妹妹-淘宝网/main.jpg'),(3,'风衣','fengyi','http://127.0.0.1:8080/images/夏日带帽短袖T恤男装韩版原宿bf风2017新款潮流九分裤一套装 情侣-淘宝网/main.jpg'),(4,'西装','xizhuang','http://127.0.0.1:8080/images/夏季篮球运动健身马甲库里杜兰特男无袖背心坎肩卫衣薄款外套户外-淘宝网/main.jpg'),(5,'裤子','kuzi','http://127.0.0.1:8080/images/胖mm雪纺衫女夏装新款韩版宽松加肥加大码女装上衣短袖衬衫200斤-淘宝网/main.jpg'),(6,'裙子','qunzi','http://127.0.0.1:8080/images/欧洲站唯品会时尚潮流男衣服新款夏季青年男士短袖t恤休闲圆领棉-淘宝网/main.jpg');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-05 11:01:25
