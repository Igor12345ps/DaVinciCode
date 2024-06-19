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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `email` varchar(75) NOT NULL,
  `password` varchar(110) NOT NULL,
  `tel` varchar(11) NOT NULL,
  `birth_date` date NOT NULL,
  `gender` enum('m','f') NOT NULL,
  `marital_status` enum('s','c') NOT NULL,
  `mother_name` varchar(45) NOT NULL,
  `father_name` varchar(45) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `tel` (`tel`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (19,'Admin','55959559559','admin@teste.com.br','5+Ei9KjTis6o195yxqZuYQ==','11111111111','2005-04-09','m','c','Mãe admin','Pai admin','2024-06-16 16:12:05',NULL),(20,'Erica','65748916876','erica@ulife.com.br','m8a62O6f6lPHrrdD8Psa6Q==','11849849749','1980-09-08','f','s','Pai da Erica','Mãe da Erica','2024-06-16 18:32:28',NULL),(21,'Igor Pereira dos Santos','46498468487','igor@ulife.com','uQN4115gZs3M2fvhM5rzrw==','11991128766','2005-04-09','m','s','Luciene','Denilson','2024-06-16 18:33:32',NULL),(22,'Guilherme Pontes Santos','56416874151','guilherme@ulife.com','2WpeA9aJmkqM2GDQk6sRoQ==','11984369841','2004-07-12','m','s','Ademilton','Fabiana','2024-06-16 18:34:19',NULL),(23,'Michael Douglas','49675809311','michael@ulife.com','+EpA9iI/Nd4q7g98ZRJE/w==','11987524063','2004-01-30','m','c','Douglas','Elizete','2024-06-16 20:12:50',NULL),(24,'Josefina Saulo de Almeida','54198848448','josefina@ulife.com','zGiLpzu++7qtnJ3MI6tHYw==','11991128763','2005-04-09','f','s','Josafá','Josefa','2024-06-16 20:15:10',NULL),(25,'José Alves','65694684448','jose@ulife.com','a9o6o/U3D1w4qHJd0nb+9w==','11991846486','2005-04-09','m','s','Felipe','Jo','2024-06-16 20:16:03',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
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
