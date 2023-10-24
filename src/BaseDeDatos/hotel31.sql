-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-10-2023 a las 00:11:50
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel31`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `idTipoHabitacion` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `idTipoHabitacion`, `estado`) VALUES
(1, 2, 0),
(2, 1, 0),
(3, 1, 0),
(4, 2, 1),
(5, 2, 0),
(6, 2, 0),
(7, 1, 0),
(8, 1, 0),
(9, 1, 0),
(10, 1, 0),
(11, 1, 0),
(12, 1, 0),
(13, 1, 0),
(14, 1, 0),
(15, 1, 0),
(16, 1, 0),
(17, 1, 0),
(18, 1, 0),
(19, 1, 0),
(20, 1, 0),
(21, 1, 0),
(22, 1, 0),
(23, 1, 0),
(24, 1, 0),
(25, 1, 0),
(26, 1, 0),
(27, 1, 0),
(28, 1, 0),
(29, 1, 0),
(30, 1, 0),
(31, 1, 0),
(32, 1, 0),
(33, 1, 0),
(34, 1, 0),
(35, 2, 0),
(36, 2, 0),
(37, 2, 0),
(38, 2, 0),
(39, 2, 0),
(40, 2, 0),
(41, 2, 0),
(42, 2, 0),
(43, 2, 0),
(44, 2, 0),
(45, 2, 0),
(46, 2, 0),
(47, 2, 0),
(48, 2, 0),
(49, 2, 0),
(50, 2, 0),
(51, 2, 0),
(52, 2, 0),
(53, 2, 0),
(54, 2, 0),
(55, 2, 0),
(56, 2, 0),
(57, 2, 0),
(58, 2, 0),
(59, 2, 0),
(60, 2, 0),
(61, 2, 0),
(62, 3, 0),
(63, 3, 0),
(64, 3, 0),
(65, 3, 0),
(66, 3, 0),
(67, 3, 0),
(68, 3, 0),
(69, 3, 0),
(70, 3, 0),
(71, 3, 0),
(72, 3, 0),
(73, 3, 0),
(74, 3, 0),
(75, 3, 0),
(76, 3, 0),
(77, 3, 0),
(78, 3, 0),
(79, 3, 0),
(80, 3, 0),
(81, 3, 0),
(82, 3, 0),
(83, 3, 0),
(84, 3, 0),
(85, 3, 0),
(86, 3, 0),
(87, 3, 0),
(88, 3, 0),
(89, 3, 0),
(90, 3, 0),
(91, 3, 0),
(92, 4, 0),
(93, 4, 0),
(94, 4, 0),
(95, 4, 0),
(96, 4, 0),
(97, 4, 0),
(98, 4, 0),
(99, 4, 0),
(100, 4, 0),
(101, 4, 0),
(102, 4, 0),
(103, 4, 0),
(104, 4, 0),
(105, 4, 0),
(106, 4, 0),
(107, 4, 0),
(108, 4, 0),
(109, 4, 0),
(110, 4, 0),
(111, 4, 0),
(112, 4, 0),
(113, 4, 0),
(114, 4, 0),
(115, 4, 0),
(116, 4, 0),
(117, 4, 0),
(118, 4, 0),
(119, 4, 0),
(120, 4, 0),
(121, 4, 0),
(122, 5, 0),
(123, 5, 0),
(124, 5, 0),
(125, 5, 0),
(126, 5, 0),
(127, 5, 0),
(128, 5, 0),
(129, 5, 0),
(130, 5, 0),
(131, 5, 0),
(132, 5, 0),
(133, 5, 0),
(134, 5, 0),
(135, 5, 0),
(136, 5, 0),
(137, 5, 0),
(138, 5, 0),
(139, 5, 0),
(140, 5, 0),
(141, 5, 0),
(142, 5, 0),
(143, 5, 0),
(144, 5, 0),
(145, 5, 0),
(146, 5, 0),
(147, 5, 0),
(148, 5, 0),
(149, 5, 0),
(150, 5, 0),
(151, 5, 0),
(152, 6, 0),
(153, 6, 0),
(154, 6, 0),
(155, 6, 0),
(156, 6, 0),
(157, 6, 0),
(158, 6, 0),
(159, 6, 0),
(160, 6, 0),
(161, 6, 0),
(162, 6, 0),
(163, 6, 0),
(164, 6, 0),
(165, 6, 0),
(166, 6, 0),
(167, 6, 0),
(168, 6, 0),
(169, 6, 0),
(170, 6, 0),
(171, 6, 0),
(180, 5, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `celular` bigint(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `apellido`, `dni`, `domicilio`, `correo`, `celular`, `estado`) VALUES
(1, 'Franco', 'Kerlin ', 38018311, 'Coldaroli 949', 'Kerlin@gmail.com', 3454749769, 0),
(2, 'Nicolas', 'Iglesias', 36452738, 'Beltran 1778', 'nico-igle@gmail.com', 2804354313, 1),
(3, 'Matias', 'Carrizo', 35564662, 'Nanini 2965', 'maticarrizo@gmail.com', 3525306960, 1),
(4, 'Fabio', 'Gleria', 31950827, 'Aleu 3619', 'fgleria@gmail.com', 1133441967, 1),
(5, 'Jose', 'Herling', 39000000, 'Mitre 321', 'Jorge@gmail.com', 3454786980, 1),
(6, 'Oscar', 'Iglesias', 36452737, 'Beltran 1778', 'Robb-igle@gmail.com', 2804274318, 1),
(7, 'Roberto', 'Iglesias', 36452734, 'Beltran 1778', 'Robb-igle@gmail.com', 2804274318, 0),
(8, 'Facundo', 'Iglesias', 36452732, 'Beltran 1778', 'facu-igle@gmail.com', 2804354322, 1),
(9, 'Federico', 'Lopez', 31458225, 'Calle Falsa 123', 'correo_generico@gmai.com', 1122578613, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `cantPersonas` int(11) NOT NULL,
  `fechaEntrada` date NOT NULL,
  `fechaSalida` date NOT NULL,
  `importeTotal` double NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHabitacion`, `idHuesped`, `cantPersonas`, `fechaEntrada`, `fechaSalida`, `importeTotal`, `estado`) VALUES
(1, 2, 2, 3, '2023-10-05', '2023-10-08', 150000, 0),
(2, 5, 1, 1, '2023-10-07', '2023-10-12', 50000, 0),
(3, 6, 2, 1, '2023-10-13', '2023-10-18', 80000, 0),
(4, 93, 2, 3, '2023-10-21', '2023-10-24', 60000, 0),
(5, 93, 2, 3, '2023-10-18', '2023-10-20', 40000, 0),
(6, 95, 2, 3, '2023-10-14', '2023-10-21', 140000, 0),
(7, 153, 2, 4, '2023-10-17', '2023-10-19', 900000, 0),
(8, 154, 2, 4, '2023-10-17', '2023-10-20', 300000, 0),
(9, 156, 2, 4, '2023-10-18', '2023-10-19', 100000, 0),
(10, 155, 2, 4, '2023-10-18', '2023-10-21', 300000, 0),
(11, 94, 6, 3, '2023-10-20', '2023-10-23', 60000, 1),
(12, 154, 6, 4, '2023-10-20', '2023-10-23', 300000, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodehabitacion`
--

CREATE TABLE `tipodehabitacion` (
  `idTipoHabitacion` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `cantCamas` int(11) NOT NULL,
  `tipoCamas` varchar(20) NOT NULL,
  `precioNoche` double NOT NULL,
  `nombreTipo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipodehabitacion`
--

INSERT INTO `tipodehabitacion` (`idTipoHabitacion`, `capacidad`, `cantCamas`, `tipoCamas`, `precioNoche`, `nombreTipo`) VALUES
(1, 1, 1, 'simple', 12000, 'estandar'),
(2, 2, 2, 'simples', 16000, 'doble 2 camas'),
(3, 2, 1, 'doble', 15000, 'doble 1 cama'),
(4, 3, 3, 'simples', 20000, 'triple 3 camas'),
(5, 3, 2, 'simple y doble', 22000, 'triple 2 camas'),
(6, 6, 4, '2 simples y 2 King', 100000, 'suite 4 camas');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `idTipoHabitacion` (`idTipoHabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- Indices de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  ADD PRIMARY KEY (`idTipoHabitacion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=181;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `tipodehabitacion`
--
ALTER TABLE `tipodehabitacion`
  MODIFY `idTipoHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idTipoHabitacion`) REFERENCES `tipodehabitacion` (`idTipoHabitacion`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
