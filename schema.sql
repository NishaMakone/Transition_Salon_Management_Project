-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: salon1
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `app_service_tbl`
--

DROP TABLE IF EXISTS `app_service_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `app_service_tbl` (
  `As_Id` int NOT NULL AUTO_INCREMENT,
  `App_id` int NOT NULL,
  `Service_Id` int NOT NULL,
  PRIMARY KEY (`As_Id`),
  KEY `App_id` (`App_id`),
  KEY `Service_Id` (`Service_Id`),
  CONSTRAINT `app_service_tbl_ibfk_1` FOREIGN KEY (`App_id`) REFERENCES `appointment_tbl` (`App_id`),
  CONSTRAINT `app_service_tbl_ibfk_2` FOREIGN KEY (`Service_Id`) REFERENCES `srvice_tbl` (`Service_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `app_service_tbl`
--

LOCK TABLES `app_service_tbl` WRITE;
/*!40000 ALTER TABLE `app_service_tbl` DISABLE KEYS */;
INSERT INTO `app_service_tbl` VALUES (1,1,3),(2,1,1),(3,2,2),(4,3,4),(5,3,5),(6,3,6),(7,4,5),(8,4,6),(9,5,8),(10,5,9),(11,6,1),(12,6,2),(13,7,3),(14,8,4),(15,8,5),(16,9,4),(17,9,5),(18,9,6),(19,10,7),(20,11,3),(21,11,1),(22,11,2),(23,12,8);
/*!40000 ALTER TABLE `app_service_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointment_tbl`
--

DROP TABLE IF EXISTS `appointment_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment_tbl` (
  `App_id` int NOT NULL AUTO_INCREMENT,
  `Customer_Id` int NOT NULL,
  `Stylist_id` int NOT NULL,
  `Salon_id` int NOT NULL,
  `App_booking_date` date DEFAULT NULL,
  `App_date` date DEFAULT NULL,
  `App_start_time` time DEFAULT NULL,
  `Total_cost` float DEFAULT NULL,
  `app_status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`App_id`),
  KEY `Customer_Id` (`Customer_Id`),
  KEY `Stylist_id` (`Stylist_id`),
  KEY `Salon_id` (`Salon_id`),
  CONSTRAINT `appointment_tbl_ibfk_1` FOREIGN KEY (`Customer_Id`) REFERENCES `customer_tbl` (`Customer_Id`),
  CONSTRAINT `appointment_tbl_ibfk_2` FOREIGN KEY (`Stylist_id`) REFERENCES `stylist_tbl` (`Stylist_Id`),
  CONSTRAINT `appointment_tbl_ibfk_3` FOREIGN KEY (`Salon_id`) REFERENCES `salon_tbl` (`Salon_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment_tbl`
--

LOCK TABLES `appointment_tbl` WRITE;
/*!40000 ALTER TABLE `appointment_tbl` DISABLE KEYS */;
INSERT INTO `appointment_tbl` VALUES (1,1,1,1,'2022-02-24','2022-02-25','15:30:00',750,'confirm'),(2,2,2,1,'2022-02-23','2022-02-25','10:00:00',700,'confirm'),(3,3,4,2,'2022-02-25','2022-03-01','11:00:00',1150,'confirm'),(4,4,7,2,'2022-02-23','2022-02-27','14:30:00',400,'confirm'),(5,5,8,3,'2022-03-05','2022-03-08','15:00:00',1200,'confirm'),(6,6,3,1,'2022-03-25','2022-03-30','16:30:00',1200,'confirm'),(7,7,1,1,'2022-04-03','2022-04-05','12:30:00',250,'confirm'),(8,8,5,2,'2022-03-05','2022-03-07','11:00:00',950,'confirm'),(9,9,6,2,'2022-03-05','2022-03-07','17:00:00',1150,'confirm'),(10,10,9,3,'2022-03-01','2022-03-03','14:00:00',300,'confirm'),(11,12,2,1,'2022-03-02','2022-03-04','13:00:00',1450,'confirm'),(12,13,8,3,'2022-03-03','2022-03-03','17:00:00',500,'confirm');
/*!40000 ALTER TABLE `appointment_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_tbl`
--

DROP TABLE IF EXISTS `customer_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_tbl` (
  `Customer_Id` int NOT NULL AUTO_INCREMENT,
  `Customer_Name` varchar(500) DEFAULT NULL,
  `Customer_Phone` blob,
  `Customer_Gender` varchar(50) DEFAULT NULL,
  `Customer_City` varchar(500) DEFAULT NULL,
  `Customer_Email` varchar(500) DEFAULT NULL,
  `Customer_Username` varchar(500) DEFAULT NULL,
  `Customer_Password` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`Customer_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_tbl`
--

LOCK TABLES `customer_tbl` WRITE;
/*!40000 ALTER TABLE `customer_tbl` DISABLE KEYS */;
INSERT INTO `customer_tbl` VALUES (1,'John',_binary '125463274',' male','Pune','john@gmail.com','john@gmail.com','john123'),(2,'gary',_binary '215463274',' male','Pune','gary@gmail.com','gary@gmail.com','gary123'),(3,'harry',_binary '625463274',' male','munbai','harry@gmail.com','harry@gmail.com','harry123'),(4,'lisa',_binary '125463274',' female','Munmbai','lisa@gmail.com','lisa@gmail.com','lisa123'),(5,'sara',_binary '625463274',' female','panvel','sara@gmail.com','sara@gmail.com','sara123'),(6,'mita',_binary '125463274',' female','pune','mita@gmail.com','mita@gmail.com','mita123'),(7,'savitri',_binary '625463274',' female','pune','savitri@gmail.com','savitri@gmail.com','savitri123'),(8,'shawn',_binary '825463274',' male','mumbai','shawn@gmail.com','shawn@gmail.com','shawn123'),(9,'trevor',_binary '625463274',' male','mumbai','trevor@gmail.com','trevor@gmail.com','trevor123'),(10,'lara',_binary '225463274',' female','panvel','lara@gmail.com','lara@gmail.com','lara123'),(12,'carol',_binary '125463274',' female','pune','carol@gmail.com','carol@gmail.com','carol123'),(13,'royston',_binary '425463274',' male','panvel','royston@gmail.com','royston@gmail.com','royston123');
/*!40000 ALTER TABLE `customer_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_tbl`
--

DROP TABLE IF EXISTS `payment_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_tbl` (
  `Payment_Id` int NOT NULL AUTO_INCREMENT,
  `Customer_Id` int NOT NULL,
  `Salon_Id` int NOT NULL,
  `Payment_Total_Cost` float DEFAULT NULL,
  PRIMARY KEY (`Payment_Id`),
  KEY `Customer_Id` (`Customer_Id`),
  KEY `Salon_Id` (`Salon_Id`),
  CONSTRAINT `payment_tbl_ibfk_1` FOREIGN KEY (`Customer_Id`) REFERENCES `customer_tbl` (`Customer_Id`),
  CONSTRAINT `payment_tbl_ibfk_2` FOREIGN KEY (`Salon_Id`) REFERENCES `salon_tbl` (`Salon_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_tbl`
--

LOCK TABLES `payment_tbl` WRITE;
/*!40000 ALTER TABLE `payment_tbl` DISABLE KEYS */;
INSERT INTO `payment_tbl` VALUES (1,1,1,750),(2,2,1,700),(3,3,2,1150),(4,4,2,400),(5,5,3,1200),(6,6,1,1200),(7,7,1,250),(8,8,2,950),(9,9,2,1150),(10,10,3,300),(11,12,1,1450),(12,13,3,500);
/*!40000 ALTER TABLE `payment_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salon_tbl`
--

DROP TABLE IF EXISTS `salon_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salon_tbl` (
  `Salon_Id` int NOT NULL AUTO_INCREMENT,
  `Salon_Reg_Id` int DEFAULT NULL,
  `Salon_Name` varchar(500) DEFAULT NULL,
  `Salon_Phone` blob,
  `Salon_no_Of_Stylist` int DEFAULT NULL,
  `Salon_City` varchar(500) DEFAULT NULL,
  `Salon_Email` varchar(500) DEFAULT NULL,
  `Salon_Username` varchar(500) DEFAULT NULL,
  `Salon_Password` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`Salon_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salon_tbl`
--

LOCK TABLES `salon_tbl` WRITE;
/*!40000 ALTER TABLE `salon_tbl` DISABLE KEYS */;
INSERT INTO `salon_tbl` VALUES (1,4586,'salon1',_binary '125463274',3,'Pune','salon1@gmail.com','salon1@gmail.com','abc@123'),(2,4816,'salon2',_binary '256874496',4,'mumbai','salon2@gmail.com','salon2@gmail.com','xyz@123'),(3,4712,'salon3',_binary '364891722',2,'Panvel','salon3@gmail.com','salon3@gmail.com','pqr@123');
/*!40000 ALTER TABLE `salon_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `srvice_tbl`
--

DROP TABLE IF EXISTS `srvice_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `srvice_tbl` (
  `Service_Id` int NOT NULL AUTO_INCREMENT,
  `Salon_Id` int NOT NULL,
  `Service_Name` varchar(500) DEFAULT NULL,
  `Service_Cost` float DEFAULT NULL,
  `Service_Time` int DEFAULT NULL,
  PRIMARY KEY (`Service_Id`),
  KEY `Salon_Id` (`Salon_Id`),
  CONSTRAINT `srvice_tbl_ibfk_1` FOREIGN KEY (`Salon_Id`) REFERENCES `salon_tbl` (`Salon_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `srvice_tbl`
--

LOCK TABLES `srvice_tbl` WRITE;
/*!40000 ALTER TABLE `srvice_tbl` DISABLE KEYS */;
INSERT INTO `srvice_tbl` VALUES (1,1,'Pedicure',500,30),(2,1,'facial gold',700,60),(3,1,'Hair cut',250,30),(4,2,'Hair cut',200,30),(5,2,'manicure',200,40),(6,2,'friut facial ',750,95),(7,3,'Hair cut',300,40),(8,3,'Hair spa',500,45),(9,3,'diamond facial ',700,90);
/*!40000 ALTER TABLE `srvice_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stylist_tbl`
--

DROP TABLE IF EXISTS `stylist_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stylist_tbl` (
  `Stylist_Id` int NOT NULL AUTO_INCREMENT,
  `Salon_Id` int NOT NULL,
  `Stylist_Name` varchar(500) DEFAULT NULL,
  `Salon_Phone` blob,
  `Salon_no_Of_Stylist` int DEFAULT NULL,
  `Salon_Email` varchar(500) DEFAULT NULL,
  `Stylist_Image` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`Stylist_Id`),
  KEY `Salon_Id` (`Salon_Id`),
  CONSTRAINT `stylist_tbl_ibfk_1` FOREIGN KEY (`Salon_Id`) REFERENCES `salon_tbl` (`Salon_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stylist_tbl`
--

LOCK TABLES `stylist_tbl` WRITE;
/*!40000 ALTER TABLE `stylist_tbl` DISABLE KEYS */;
INSERT INTO `stylist_tbl` VALUES (1,1,'Dany',_binary '1452638',2,'dany@gmail.com','fdgsf'),(2,1,'Mita',_binary '2452638',3,'Mita@gmail.com','dihia'),(3,1,'Isha',_binary '4452638',3,'Isha@gmail.com','ddfaa'),(4,2,'Kiara',_binary '6452638',4,'Kiara@gmail.com','dvadag'),(5,2,'alex',_binary '1454838',4,'alex@gmail.com','adfaa'),(6,2,'mark',_binary '2422638',4,'mark@gmail.com','adsfa'),(7,2,'lara',_binary '4452638',4,'lara@gmail.com','artqt'),(8,3,'richa',_binary '2552638',2,'richa@gmail.com','rkfif'),(9,3,'rayen',_binary '3252638',2,'rayen@gmail.com','vatdu');
/*!40000 ALTER TABLE `stylist_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-01 14:53:04
