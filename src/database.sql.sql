-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.4.3 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.8.0.6908
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for smile_clinc
CREATE DATABASE IF NOT EXISTS `smile_clinc` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `smile_clinc`;

-- Dumping structure for table smile_clinc.bills
CREATE TABLE IF NOT EXISTS `bills` (
  `id_bill` int NOT NULL AUTO_INCREMENT,
  `name_patient_B` varchar(50) DEFAULT NULL,
  `condition_t` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `date` date DEFAULT (curdate()),
  `cost` decimal(20,6) DEFAULT NULL,
  `pay` decimal(20,6) DEFAULT NULL,
  `id_patient_B` int unsigned DEFAULT NULL,
  PRIMARY KEY (`id_bill`),
  KEY `FK__patients` (`id_patient_B`),
  CONSTRAINT `FK__patients` FOREIGN KEY (`id_patient_B`) REFERENCES `patients` (`id_patient`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table smile_clinc.bills: ~11 rows (approximately)
INSERT INTO `bills` (`id_bill`, `name_patient_B`, `condition_t`, `date`, `cost`, `pay`, `id_patient_B`) VALUES
	(1, 'ron', 'teeth pull', '2026-01-24', 30000.000000, 30000.000000, NULL),
	(2, 'dan', 'test', '2026-01-24', 5000.000000, 5000.000000, NULL),
	(3, 'zak', 'filling', '2026-01-24', 300000.000000, 0.000000, NULL),
	(4, 'ronda', 'claen teeth', '2026-01-24', 40000.000000, 33000.000000, NULL),
	(6, 'fish', 'test', '2026-01-24', 10.000000, 7.000000, NULL),
	(7, 'ahmad', 'test', '2026-01-24', 5000.000000, 5000.000000, NULL),
	(8, 'ali', 'claen', '2026-01-25', 40000.000000, 4000.000000, NULL),
	(9, 'tt', 'ttt', '2026-01-29', 500.000000, 200.000000, NULL),
	(10, 'jaaaaaaaaaaaaaaa', 'teath filling', '2026-01-29', 3000.000000, 500.000000, NULL),
	(11, 'yyy', 'rrr', '2026-01-29', 700.000000, 100.000000, NULL),
	(12, 'tear', 'teath healing', '2026-03-10', 40000.000000, 40000.000000, NULL);

-- Dumping structure for table smile_clinc.employes
CREATE TABLE IF NOT EXISTS `employes` (
  `id_emp` int unsigned NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(50) DEFAULT NULL,
  `phone_emp` varchar(50) DEFAULT NULL,
  `major` varchar(50) DEFAULT NULL,
  `card_number` varchar(50) DEFAULT NULL,
  `salary` decimal(20,6) unsigned NOT NULL,
  PRIMARY KEY (`id_emp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table smile_clinc.employes: ~0 rows (approximately)

-- Dumping structure for table smile_clinc.patients
CREATE TABLE IF NOT EXISTS `patients` (
  `id_patient` int unsigned NOT NULL AUTO_INCREMENT,
  `name_patient` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `gender` enum('male','female') CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `age` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `condition_t` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `date` date DEFAULT (curdate()),
  `time` time DEFAULT (curtime()),
  PRIMARY KEY (`id_patient`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table smile_clinc.patients: ~7 rows (approximately)
INSERT INTO `patients` (`id_patient`, `name_patient`, `gender`, `age`, `phone`, `condition_t`, `date`, `time`) VALUES
	(1, 'ron', 'female', '19', '45353', 'teathfilling', '2026-01-23', '03:17:12'),
	(5, 'zak', 'male', '40', '6477733', 'teath pull', '2026-01-23', '03:28:31'),
	(6, 'dann', 'male', '19', '37383', 'pull tooth', '2026-01-23', '03:29:41'),
	(9, 'romo', 'female', '16', '44747', 'test tooth', '2026-01-23', '23:52:15'),
	(12, 'ali', 'male', '43', '2345678', 'clean', '2026-01-25', '22:21:47'),
	(14, 'sara', 'female', '54', '4678', 'theet', '2026-01-29', '12:48:08'),
	(16, 'tera', 'female', '22', '45679', 'taeth healing', '2026-03-10', '00:02:22');

-- Dumping structure for table smile_clinc.services
CREATE TABLE IF NOT EXISTS `services` (
  `id_service` int unsigned NOT NULL AUTO_INCREMENT,
  `name_service` varchar(50) DEFAULT NULL,
  `price_service` decimal(20,6) DEFAULT NULL,
  PRIMARY KEY (`id_service`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table smile_clinc.services: ~4 rows (approximately)
INSERT INTO `services` (`id_service`, `name_service`, `price_service`) VALUES
	(1, 'teath filling', 50000.000000),
	(2, 'test', 5000.000000),
	(3, 'clean tooth', 50000.000000),
	(5, 'eeee', 3333.000000),
	(6, 'teath healing', 40000.000000);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
