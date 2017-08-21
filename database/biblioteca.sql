CREATE DATABASE  IF NOT EXISTS `biblioteca`;
USE `biblioteca`;

DROP TABLE IF EXISTS `libro`;

CREATE TABLE `libro` (
  `id_texto` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(250) NOT NULL,
  `autor` varchar(250) NOT NULL,
  `disponible` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_texto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `email` varchar(250) NOT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `prestamo`;

CREATE TABLE `prestamo` (
  `id_prestamo` int(11) NOT NULL AUTO_INCREMENT,
  `id_texto` int(11) NOT NULL,
  `id_persona` int(11) NOT NULL,
  PRIMARY KEY (`id_prestamo`),
  KEY `id_texto_idx` (`id_texto`),
  KEY `id_persona_idx` (`id_persona`),
  CONSTRAINT `id_persona` FOREIGN KEY (`id_persona`) REFERENCES `usuario` (`id_persona`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_texto` FOREIGN KEY (`id_texto`) REFERENCES `libro` (`id_texto`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
