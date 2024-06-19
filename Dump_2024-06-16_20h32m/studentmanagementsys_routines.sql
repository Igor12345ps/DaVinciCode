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
-- Temporary view structure for view `vw_class`
--

DROP TABLE IF EXISTS `vw_class`;
/*!50001 DROP VIEW IF EXISTS `vw_class`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_class` AS SELECT 
 1 AS `id`,
 1 AS `student_id`,
 1 AS `student_name`,
 1 AS `student_cpf`,
 1 AS `student_email`,
 1 AS `student_tel`,
 1 AS `student_birth_date`,
 1 AS `student_gender`,
 1 AS `student_marital_status`,
 1 AS `student_mother_name`,
 1 AS `student_father_name`,
 1 AS `professor_id`,
 1 AS `professor_name`,
 1 AS `professor_cpf`,
 1 AS `professor_email`,
 1 AS `professor_tel`,
 1 AS `professor_birth_date`,
 1 AS `professor_gender`,
 1 AS `professor_marital_status`,
 1 AS `professor_mother_name`,
 1 AS `professor_father_name`,
 1 AS `academic_unit_id`,
 1 AS `academic_unit_name`,
 1 AS `semester_id`,
 1 AS `semester_name`,
 1 AS `grade`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vw_class`
--

/*!50001 DROP VIEW IF EXISTS `vw_class`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_class` AS select `suc`.`id` AS `id`,`st`.`id` AS `student_id`,`st`.`name` AS `student_name`,`st`.`cpf` AS `student_cpf`,`st`.`email` AS `student_email`,`st`.`tel` AS `student_tel`,`st`.`birth_date` AS `student_birth_date`,`st`.`gender` AS `student_gender`,`st`.`marital_status` AS `student_marital_status`,`st`.`mother_name` AS `student_mother_name`,`st`.`father_name` AS `student_father_name`,`pr`.`id` AS `professor_id`,`pr`.`name` AS `professor_name`,`pr`.`cpf` AS `professor_cpf`,`pr`.`email` AS `professor_email`,`pr`.`tel` AS `professor_tel`,`pr`.`birth_date` AS `professor_birth_date`,`pr`.`gender` AS `professor_gender`,`pr`.`marital_status` AS `professor_marital_status`,`pr`.`mother_name` AS `professor_mother_name`,`pr`.`father_name` AS `professor_father_name`,`uc`.`id` AS `academic_unit_id`,`uc`.`name` AS `academic_unit_name`,`sm`.`id` AS `semester_id`,`sm`.`name` AS `semester_name`,`suc`.`grade` AS `grade` from ((((`student_has_academic_unit` `suc` join `user` `st` on((`st`.`id` = `suc`.`student_id`))) join `user` `pr` on((`pr`.`id` = `suc`.`professor_id`))) join `academic_unit` `uc` on((`uc`.`id` = `suc`.`academic_unit_id`))) join `semester` `sm` on((`sm`.`id` = `suc`.`semester_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping events for database 'studentmanagementsys'
--

--
-- Dumping routines for database 'studentmanagementsys'
--
/*!50003 DROP PROCEDURE IF EXISTS `delete_user_and_user_role` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_user_and_user_role`(
    IN p_id int
)
BEGIN
	-- Delete user from user_role table
    DELETE FROM studentmanagementsys.user_role where user_id = p_id;
    
    -- Delete user from user table
    DELETE FROM studentmanagementsys.user where id = p_id;

END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insert_user_and_user_role` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_user_and_user_role`(
    IN p_name VARCHAR(45),
    IN p_cpf VARCHAR(11),
    IN p_email VARCHAR(75),
    IN p_password VARCHAR(110),
    IN p_tel VARCHAR(11),
    IN p_birth_date DATE,
    IN p_gender ENUM('m', 'f'),
    IN p_marital_status ENUM('s', 'c'),
    IN p_mother_name VARCHAR(45),
    IN p_father_name VARCHAR(45),
    IN p_role_slug VARCHAR(45)
)
BEGIN
    DECLARE user_id INT;

    -- Insert into the user table
    INSERT INTO studentmanagementsys.user (
        name, cpf, email, password, tel, birth_date, gender, marital_status, mother_name, father_name
    ) VALUES (
        p_name, p_cpf, p_email, p_password, p_tel, p_birth_date, p_gender, p_marital_status, p_mother_name, p_father_name
    );

    -- Get the last inserted user_id
    SET user_id = LAST_INSERT_ID();

    -- Insert into the user_role table
    INSERT INTO studentmanagementsys.user_role (user_id, role_slug) VALUES (user_id, p_role_slug);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `update_user_and_user_role` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_user_and_user_role`(
    IN p_id INT,
    IN p_name VARCHAR(45),
    IN p_cpf VARCHAR(11),
    IN p_email VARCHAR(75),
    IN p_password VARCHAR(110),
    IN p_tel VARCHAR(11),
    IN p_birth_date DATE,
    IN p_gender ENUM('m', 'f'),
    IN p_marital_status ENUM('s', 'c'),
    IN p_mother_name VARCHAR(45),
    IN p_father_name VARCHAR(45),
    IN p_old_role_slug VARCHAR(45),
    IN p_role_slug VARCHAR(45)
)
BEGIN
    -- Update user table
    UPDATE studentmanagementsys.user
    SET name = p_name,
        cpf = p_cpf,
        email = p_email,
        password = p_password,
        tel = p_tel,
        birth_date = p_birth_date,
        gender = p_gender,
        marital_status = p_marital_status,
        mother_name = p_mother_name,
        father_name = p_father_name
    WHERE id = p_id;


    -- Update user_role table
    UPDATE studentmanagementsys.user_role
    set role_slug = p_role_slug
    where user_id = p_id and role_slug = p_old_role_slug;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-16 20:33:24
