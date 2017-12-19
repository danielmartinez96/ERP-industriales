-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 18-12-2017 a las 23:03:01
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `dbindustriales`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avisos`
--

CREATE TABLE IF NOT EXISTS `avisos` (
  `id_aviso` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(25) DEFAULT NULL,
  `tipo` varchar(25) DEFAULT NULL,
  `fecha_creacion` varchar(60) DEFAULT NULL,
  `descripcion` varchar(60) DEFAULT NULL,
  `cantidad_necesaria_reparacion` varchar(60) DEFAULT NULL,
  `sector_responsable` varchar(30) DEFAULT NULL,
  `prioridad` varchar(30) DEFAULT NULL,
  `id_parte_de_maquina` int(11) NOT NULL,
  `id_solicitante` varchar(11) NOT NULL,
  `maquina` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_aviso`),
  KEY `id_parte_de_maquina` (`id_parte_de_maquina`),
  KEY `id_solicitante` (`id_solicitante`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=55 ;

--
-- Volcado de datos para la tabla `avisos`
--

INSERT INTO `avisos` (`id_aviso`, `estado`, `tipo`, `fecha_creacion`, `descripcion`, `cantidad_necesaria_reparacion`, `sector_responsable`, `prioridad`, `id_parte_de_maquina`, `id_solicitante`, `maquina`) VALUES
(2, 'ABIERTO', 'Tarjeta_Blanca', '20/12/2017 05:00', 'sdasdasdas', '10', 'MECANICA', 'BAJA', 1, '1', 'SOLDADOR'),
(3, 'ABIERTO', 'Tarjeta_Blanca', '07/12/2017 05:13', 'sadsadasd', '10', 'MECANICA', 'BAJA', 1, '1', 'SOLDADOR'),
(4, 'ABIERTO', 'Tarjeta_Blanca', '14/12/2017 05:20', 'xxcxzcxzc', '10', 'MECANICA', 'BAJA', 1, '1', 'SOLDADOR'),
(5, 'ABIERTO', 'Tarjeta_Blanca', '13/12/2017 07:17', 'asdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(6, 'ABIERTO', 'Tarjeta_Blanca', '06/12/2017 07:17', 'sadsad', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(7, 'ABIERTO', 'Tarjeta_Blanca', '08/12/2017 07:17', 'asdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(8, 'ABIERTO', 'Tarjeta_Blanca', '21/12/2017 07:17', 'sadsad', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(9, 'ABIERTO', 'Tarjeta_Blanca', '28/12/2017 12:00', 'sadsadasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(10, 'ABIERTO', 'Tarjeta_Blanca', '21/12/2017 07:17', 'asdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(11, 'ABIERTO', 'Tarjeta_Blanca', '26/12/2017 07:17', 'asdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(12, 'ABIERTO', 'Tarjeta_Blanca', '20/12/2017 12:00', 'sadsadasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(13, 'ABIERTO', 'Tarjeta_Blanca', '20/12/2017 07:18', 'asdasdasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(14, 'ABIERTO', 'Tarjeta_Blanca', '21/12/2017 07:18', 'asdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(15, 'EN_TRATAMIENTO', 'Tarjeta_Blanca', '20/12/2017 07:18', 'asdasdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(16, 'ABIERTO', 'Tarjeta_Blanca', '13/12/2017 07:18', 'asdasdsad', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(17, 'ABIERTO', 'Tarjeta_Blanca', '12/12/2017 07:18', 'asdassadasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(18, 'ABIERTO', 'Tarjeta_Blanca', '13/12/2017 07:18', 'sadasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(19, 'ABIERTO', 'Tarjeta_Blanca', '27/12/2017 07:18', 'asdsadasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(20, 'ABIERTO', 'Tarjeta_Blanca', '13/12/2017 07:18', 'sadsadasdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(21, 'ABIERTO', 'Tarjeta_Blanca', '13/12/2017 07:19', 'asdasdsadasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(22, 'ABIERTO', 'Tarjeta_Blanca', '26/12/2017 07:19', 'asdsadasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(23, 'ABIERTO', 'Tarjeta_Blanca', '13/12/2017 07:19', 'asdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(24, 'ABIERTO', 'Tarjeta_Blanca', '07/12/2017 07:20', 'sadsadasdsa', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(25, 'ABIERTO', 'Tarjeta_Blanca', '15/12/2017 05:04', 'asdasdasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(26, 'ABIERTO', 'Tarjeta_Blanca', '15/12/2017 05:09', 'sDasa', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(27, 'ABIERTO', 'Tarjeta_Blanca', '07/12/2017 05:09', 'asasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(28, 'ABIERTO', 'Tarjeta_Blanca', '14/12/2017 05:09', 'asdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(29, 'ABIERTO', 'Tarjeta_Blanca', '28/12/2017 05:10', 'asdasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(30, 'ABIERTO', 'Tarjeta_Blanca', '08/12/2017 05:10', 'asasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(31, 'ABIERTO', 'Tarjeta_Blanca', '02/12/2017 05:10', 'asdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(32, 'ABIERTO', 'Tarjeta_Blanca', '07/12/2017 05:10', 'asdasdsa', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(33, 'ABIERTO', 'Tarjeta_Blanca', '01/12/2017 05:10', 'asdasdsad', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(34, 'ABIERTO', 'Tarjeta_Blanca', '14/12/2017 05:10', 'asdasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(35, 'ABIERTO', 'Tarjeta_Blanca', '18/12/2017 05:10', 'asdasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(36, 'ABIERTO', 'Tarjeta_Blanca', '13/12/2017 05:11', 'asdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(37, 'ABIERTO', 'Tarjeta_Blanca', '06/12/2017 05:11', 'asdasdasdsa', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(38, 'ABIERTO', 'Tarjeta_Blanca', '01/12/2017 05:11', 'asdasdasdsa', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(39, 'ABIERTO', 'Tarjeta_Blanca', '21/12/2017 05:11', 'asdasdsad', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(40, 'ABIERTO', 'Tarjeta_Blanca', '08/12/2017 05:11', 'asdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(41, 'ABIERTO', 'Tarjeta_Blanca', '18/12/2017 05:11', 'aasdasdasd', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(42, 'ABIERTO', 'Tarjeta_Blanca', '02/12/2017 12:00', 'saaSAsa', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(43, 'ABIERTO', 'Tarjeta_Blanca', '22/12/2017 05:13', 'SADDASDAS', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(44, 'ABIERTO', 'Tarjeta_Blanca', '21/12/2017 06:23', 'sadasdsad', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(45, 'ABIERTO', 'Tarjeta_Blanca', '07/12/2017 06:56', 'asdasdas', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(46, 'ABIERTO', 'Tarjeta_Blanca', '07/12/2017 06:59', '', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(47, 'ABIERTO', 'Tarjeta_Blanca', '07/12/2017 06:59', '', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(48, 'ABIERTO', 'Tarjeta_Blanca', '21/12/2017 07:32', 'sadsadasd', '10', 'MECANICA', 'MEDIA', 3, '1', 'REMACHADORA'),
(49, 'ABIERTO', 'Tarjeta_Blanca', '14/12/2017 07:32', 'asdsadsa', '10', 'MECANICA', 'ALTA', 3, '1', 'REMACHADORA'),
(50, 'ABIERTO', 'Tarjeta_Blanca', '15/12/2017 12:00', '		asdsadasd', '10', 'MECANICA', 'URGENTE', 3, '1', 'REMACHADORA'),
(51, 'ABIERTO', 'Tarjeta_Blanca', '31/12/2017 07:51', 'sad', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(52, 'ABIERTO', 'Tarjeta_Blanca', '31/12/2017 07:52', '', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(53, 'ABIERTO', 'Tarjeta_Blanca', '31/12/2017 19:58', 'wqe', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA'),
(54, 'ABIERTO', 'Tarjeta_Blanca', '17/12/2017 21:00', 'sadsadasds', '10', 'MECANICA', 'BAJA', 3, '1', 'REMACHADORA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estructuras`
--

CREATE TABLE IF NOT EXISTS `estructuras` (
  `id_estructura` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(25) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `material` varchar(25) DEFAULT NULL,
  `metrica` float DEFAULT NULL,
  PRIMARY KEY (`id_estructura`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fallo_maquina`
--

CREATE TABLE IF NOT EXISTS `fallo_maquina` (
  `id_fallo` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_creacion` varchar(30) DEFAULT NULL,
  `sintoma` varchar(30) DEFAULT NULL,
  `causa` varchar(30) DEFAULT NULL,
  `detalle` varchar(100) DEFAULT NULL,
  `id_parte_de_maquina` int(11) NOT NULL,
  `dias` int(5) NOT NULL,
  `tiempo_falla` varchar(60) NOT NULL,
  PRIMARY KEY (`id_fallo`),
  KEY `id_parte_de_maquina` (`id_parte_de_maquina`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `fallo_maquina`
--

INSERT INTO `fallo_maquina` (`id_fallo`, `fecha_creacion`, `sintoma`, `causa`, `detalle`, `id_parte_de_maquina`, `dias`, `tiempo_falla`) VALUES
(1, '18/12/2017 00:19', 'SINTOMA1', 'CausaFalla1', '', 3, 0, ''),
(2, '22/12/2017 19:20', 'SINTOMA1', 'CausaFalla1', '', 3, 0, '19:20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `items`
--

CREATE TABLE IF NOT EXISTS `items` (
  `id_items` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  `ubicacion` varchar(45) DEFAULT NULL,
  `lote` varchar(45) DEFAULT NULL,
  `stock_seguridad` int(11) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `lead_time` time DEFAULT NULL,
  `codigo` varchar(20) DEFAULT NULL,
  `metrica` float DEFAULT NULL,
  PRIMARY KEY (`id_items`),
  UNIQUE KEY `codigo` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquinas`
--

CREATE TABLE IF NOT EXISTS `maquinas` (
  `id_maquina` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(30) DEFAULT NULL,
  `descripcion` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_maquina`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `maquinas`
--

INSERT INTO `maquinas` (`id_maquina`, `tipo`, `descripcion`) VALUES
(1, 'ELECTRICA', 'SOLDADOR'),
(2, 'ELECTRICA', 'REMACHADORA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `operaciones`
--

CREATE TABLE IF NOT EXISTS `operaciones` (
  `id_operaciones` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(60) DEFAULT NULL,
  `id_parte_de_maquina` int(11) NOT NULL,
  PRIMARY KEY (`id_operaciones`),
  KEY `id_parte_de_maquina` (`id_parte_de_maquina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partes_de_maquina`
--

CREATE TABLE IF NOT EXISTS `partes_de_maquina` (
  `id_parte_de_maquina` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(60) DEFAULT NULL,
  `id_maquina` int(11) NOT NULL,
  PRIMARY KEY (`id_parte_de_maquina`),
  KEY `id_maquina` (`id_maquina`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `partes_de_maquina`
--

INSERT INTO `partes_de_maquina` (`id_parte_de_maquina`, `descripcion`, `id_maquina`) VALUES
(1, 'ELECTRODO', 1),
(2, 'RESISENCIA', 1),
(3, 'CABEZAL', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE IF NOT EXISTS `personal` (
  `id_personal` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `sector` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_personal`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`id_personal`, `nombre`, `apellido`, `sector`) VALUES
(1, 'EMANUEL', 'CASTRO', 'HIGIENE_Y_SEGURIDAD'),
(2, 'DANIEL', 'MARTINEZ', 'MECANICA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabla_ot`
--

CREATE TABLE IF NOT EXISTS `tabla_ot` (
  `id_ot` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(25) DEFAULT NULL,
  `fecha_inicio` varchar(30) DEFAULT NULL,
  `fecha_fin` varchar(30) DEFAULT NULL,
  `id_aviso` int(11) NOT NULL,
  `tipo_ot` varchar(20) NOT NULL,
  `responsable` varchar(100) DEFAULT NULL,
  `parte_maquina` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_ot`),
  KEY `id_aviso` (`id_aviso`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `tabla_ot`
--

INSERT INTO `tabla_ot` (`id_ot`, `estado`, `fecha_inicio`, `fecha_fin`, `id_aviso`, `tipo_ot`, `responsable`, `parte_maquina`) VALUES
(2, 'ABIERTO', '02/12/2017 19:28', '02/12/2017 19:28', 15, 'TIPO1', 'RESP1', 3);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `avisos`
--
ALTER TABLE `avisos`
  ADD CONSTRAINT `avisos_ibfk_1` FOREIGN KEY (`id_parte_de_maquina`) REFERENCES `partes_de_maquina` (`id_parte_de_maquina`);

--
-- Filtros para la tabla `operaciones`
--
ALTER TABLE `operaciones`
  ADD CONSTRAINT `operaciones_ibfk_1` FOREIGN KEY (`id_parte_de_maquina`) REFERENCES `partes_de_maquina` (`id_parte_de_maquina`);

--
-- Filtros para la tabla `partes_de_maquina`
--
ALTER TABLE `partes_de_maquina`
  ADD CONSTRAINT `partes_de_maquina_ibfk_1` FOREIGN KEY (`id_maquina`) REFERENCES `maquinas` (`id_maquina`);

--
-- Filtros para la tabla `tabla_ot`
--
ALTER TABLE `tabla_ot`
  ADD CONSTRAINT `tabla_ot_ibfk_1` FOREIGN KEY (`id_aviso`) REFERENCES `avisos` (`id_aviso`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
