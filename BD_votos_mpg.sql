-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.15-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura de base de datos para votos_mpg
CREATE DATABASE IF NOT EXISTS `votos_mpg` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `votos_mpg`;


-- Volcando estructura para tabla votos_mpg.ciudadanos
CREATE TABLE IF NOT EXISTS `ciudadanos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nif` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL,
  `voto` enum('Y','N'),
  PRIMARY KEY (`id`),
  UNIQUE KEY `nif` (`nif`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla votos_mpg.ciudadanos: ~0 rows (aproximadamente)
DELETE FROM `ciudadanos`;
/*!40000 ALTER TABLE `ciudadanos` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciudadanos` ENABLE KEYS */;


-- Volcando estructura para tabla votos_mpg.partidos
CREATE TABLE IF NOT EXISTS `partidos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `nvotos` int(11) DEFAULT '0',
  `logo` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla votos_mpg.partidos: ~4 rows (aproximadamente)
DELETE FROM `partidos`;
/*!40000 ALTER TABLE `partidos` DISABLE KEYS */;
INSERT INTO `partidos` (`id`, `nombre`, `nvotos`, `logo`) VALUES
	(1, 'Partido Popular (PP)', 1, 'http://www.algeciras.es/opencms/export/sites/algeciras/.galleries/estatico/pp_big.png_1440709980.png'),
	(2, 'Partido Socialista Obrero Español (PSOE)', 0, 'https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Logotipo_del_PSOE.svg/1200px-Logotipo_del_PSOE.svg.png'),
	(3, 'Podemos', 2, 'https://lh5.ggpht.com/MN0aysanj0qtYtCnkhXB4fGhSmIzusuWXDl-Rv53wyRXqiyL4fB4R0Qyu1QFj735hA=w300'),
	(4, 'Ciudadanos-Partido de la Ciudadanía (C\'s)', 0, 'http://enjoytorrevieja.com/wp-content/uploads/2017/02/ciudadanos-logo.jpg');
/*!40000 ALTER TABLE `partidos` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
