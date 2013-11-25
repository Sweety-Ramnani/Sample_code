-- MySQL dump 10.13  Distrib 5.6.11, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.6.11

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `f_name` varchar(15) NOT NULL,
  `L_name` varchar(15) NOT NULL,
  `age` varchar(3) NOT NULL,
  `gender` varchar(6) NOT NULL,
  `mobile_no` varchar(11) NOT NULL,
  `card_no` varchar(15) NOT NULL,
  `cust_id` varchar(15) NOT NULL,
  `f_id` varchar(10) NOT NULL,
  `c_id` int(11) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('sweety','ramnani','20','female','23948234','eerdsdee','sweety','1',1,'2013-08-06'),('sweety','ramnani','22','female','453534534','serf3343','sweety','1',2,'2013-08-22'),('sweety','ramnani','20','female','9939432','343434erer','sweety','1',3,'2013-08-29'),('sweety','ramnani','19','female','2342323','df3e23r2','sweety','1',4,'2013-08-01'),('sweety','ramnani','22','female','8823434','4545453rer','sweety','1',5,'2013-08-31'),('sweety','ramnani','21','female','92434234234','eedf334234','sweety','1',7,'2013-08-02'),('sweety','ramnani','20','female','9530005226','1xx2334y4545','sweety','1',8,'0000-00-00'),('sweety','ramnani','23','female','9001929764','ers43534343r','sweety','1',9,'0000-00-00'),('sweety','ramnani','20','female','9001929764','2dss8dsd','sweety','1',10,'0000-00-00'),('sweety','ramnani','21','female','756475','sad573','sweety','3',11,'2013-08-12'),('sweets','ramnani','20','female','234134','sd34','sweets','3',12,'2013-08-12'),('chweet','ramnani','21','Female','55555','ashw62','chweets','3',13,'2013-08-12'),('asd','ld','0','f','67','dsf3','ashwin','3',14,'2013-08-12'),('sweet','ramnani','20','female','8058871132','erd24352','sweet','3',15,'2013-08-12'),('asdfv','asdf','12','f','123456','w2e2r12','sweets','3',16,'2013-08-12'),('zx12','sd33','12','f','87654','65432','sweets','3',17,'2013-08-12');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight` (
  `FLIGHT_ID` varchar(15) NOT NULL,
  `SOURCE` varchar(20) NOT NULL,
  `DESTINATION` varchar(20) NOT NULL,
  `ARRIVAL_TIME` time NOT NULL,
  `DEPARTURE_TIME` time NOT NULL,
  `PRICE` varchar(10) NOT NULL,
  PRIMARY KEY (`FLIGHT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES ('3','Delhi','Goa','08:00:00','12:00:00','12000');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight_avail`
--

DROP TABLE IF EXISTS `flight_avail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `flight_avail` (
  `FLIGHT_ID` varchar(15) NOT NULL,
  `DATE` date NOT NULL,
  `Availibility` varchar(3) NOT NULL,
  PRIMARY KEY (`FLIGHT_ID`,`DATE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight_avail`
--

LOCK TABLES `flight_avail` WRITE;
/*!40000 ALTER TABLE `flight_avail` DISABLE KEYS */;
INSERT INTO `flight_avail` VALUES ('3','2013-08-12','43'),('3','2013-08-13','43');
/*!40000 ALTER TABLE `flight_avail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `record` (
  `password` varchar(15) NOT NULL,
  `username` varchar(15) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES ('admin','admin'),('sweety','sweety'),('chweets','chweets');
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-08-06 11:51:05
