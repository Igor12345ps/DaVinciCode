CREATE DATABASE  IF NOT EXISTS `studentmanagementsys` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `studentmanagementsys`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: studentmanagementsys
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student_has_academic_unit`
--

DROP TABLE IF EXISTS `student_has_academic_unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_has_academic_unit` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `professor_id` int NOT NULL,
  `academic_unit_id` int NOT NULL,
  `semester_id` int NOT NULL,
  `grade` decimal(2,0) DEFAULT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_user_has_academic_unit_student` (`student_id`),
  KEY `fk_user_has_academic_unit_academic_unit` (`academic_unit_id`),
  KEY `fk_user_has_academic_unit_professor` (`professor_id`),
  KEY `fk_student_has_academic_unit_semester1` (`semester_id`),
  CONSTRAINT `fk_student_has_academic_unit_semester1` FOREIGN KEY (`semester_id`) REFERENCES `semester` (`id`),
  CONSTRAINT `fk_user_has_academic_unit_academic_unit` FOREIGN KEY (`academic_unit_id`) REFERENCES `academic_unit` (`id`),
  CONSTRAINT `fk_user_has_academic_unit_professor` FOREIGN KEY (`professor_id`) REFERENCES `user` (`id`),
  CONSTRAINT `fk_user_has_academic_unit_student` FOREIGN KEY (`student_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_has_academic_unit`
--

LOCK TABLES `student_has_academic_unit` WRITE;
/*!40000 ALTER TABLE `student_has_academic_unit` DISABLE KEYS */;
INSERT INTO `student_has_academic_unit` VALUES (1,21,20,1,3,10,'2024-06-16 18:36:08',NULL),(2,22,20,3,3,10,'2024-06-16 18:36:44',NULL),(3,24,23,3,4,10,'2024-06-16 20:17:16',NULL),(4,25,23,2,2,8,'2024-06-16 20:17:31',NULL),(5,21,23,3,3,NULL,'2024-06-16 20:20:54',NULL);
/*!40000 ALTER TABLE `student_has_academic_unit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-16 20:33:23
