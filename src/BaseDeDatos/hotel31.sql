-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 01:34:54
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
(2, 1, 1),
(3, 1, 0),
(4, 2, 0),
(5, 2, 1),
(6, 2, 0),
(7, 1, 1),
(8, 1, 1),
(9, 1, 1),
(10, 1, 1),
(11, 1, 1),
(12, 1, 1),
(13, 1, 1),
(14, 1, 1),
(15, 1, 1),
(16, 1, 1),
(17, 1, 1),
(18, 1, 1),
(19, 1, 1),
(20, 1, 1),
(21, 1, 1),
(22, 1, 1),
(23, 1, 1),
(24, 1, 1),
(25, 1, 1),
(26, 1, 1),
(27, 1, 1),
(28, 1, 1),
(29, 1, 1),
(30, 1, 1),
(31, 1, 1),
(32, 1, 1),
(33, 1, 1),
(34, 1, 1),
(35, 2, 1),
(36, 2, 1),
(37, 2, 1),
(38, 2, 1),
(39, 2, 1),
(40, 2, 1),
(41, 2, 1),
(42, 2, 1),
(43, 2, 1),
(44, 2, 1),
(45, 2, 1),
(46, 2, 1),
(47, 2, 1),
(48, 2, 1),
(49, 2, 1),
(50, 2, 1),
(51, 2, 1),
(52, 2, 1),
(53, 2, 1),
(54, 2, 1),
(55, 2, 1),
(56, 2, 1),
(57, 2, 1),
(58, 2, 1),
(59, 2, 1),
(60, 2, 1),
(61, 2, 1),
(62, 3, 1),
(63, 3, 1),
(64, 3, 1),
(65, 3, 1),
(66, 3, 1),
(67, 3, 1),
(68, 3, 1),
(69, 3, 1),
(70, 3, 1),
(71, 3, 1),
(72, 3, 1),
(73, 3, 1),
(74, 3, 1),
(75, 3, 1),
(76, 3, 1),
(77, 3, 1),
(78, 3, 1),
(79, 3, 1),
(80, 3, 1),
(81, 3, 1),
(82, 3, 1),
(83, 3, 1),
(84, 3, 1),
(85, 3, 1),
(86, 3, 1),
(87, 3, 1),
(88, 3, 1),
(89, 3, 1),
(90, 3, 1),
(91, 3, 1),
(92, 4, 1),
(93, 4, 1),
(94, 4, 1),
(95, 4, 1),
(96, 4, 1),
(97, 4, 1),
(98, 4, 1),
(99, 4, 1),
(100, 4, 1),
(101, 4, 1),
(102, 4, 1),
(103, 4, 1),
(104, 4, 1),
(105, 4, 1),
(106, 4, 1),
(107, 4, 1),
(108, 4, 1),
(109, 4, 1),
(110, 4, 1),
(111, 4, 1),
(112, 4, 1),
(113, 4, 1),
(114, 4, 1),
(115, 4, 1),
(116, 4, 1),
(117, 4, 1),
(118, 4, 1),
(119, 4, 1),
(120, 4, 1),
(121, 4, 1),
(122, 5, 1),
(123, 5, 1),
(124, 5, 1),
(125, 5, 1),
(126, 5, 1),
(127, 5, 1),
(128, 5, 1),
(129, 5, 1),
(130, 5, 1),
(131, 5, 1),
(132, 5, 1),
(133, 5, 1),
(134, 5, 1),
(135, 5, 1),
(136, 5, 1),
(137, 5, 1),
(138, 5, 1),
(139, 5, 1),
(140, 5, 1),
(141, 5, 1),
(142, 5, 1),
(143, 5, 1),
(144, 5, 1),
(145, 5, 1),
(146, 5, 1),
(147, 5, 1),
(148, 5, 1),
(149, 5, 1),
(150, 5, 1),
(151, 5, 1),
(152, 6, 1),
(153, 6, 1),
(154, 6, 1),
(155, 6, 1),
(156, 6, 1),
(157, 6, 1),
(158, 6, 1),
(159, 6, 1),
(160, 6, 1),
(161, 6, 1),
(162, 6, 1),
(163, 6, 1),
(164, 6, 1),
(165, 6, 1),
(166, 6, 1),
(167, 6, 1),
(168, 6, 1),
(169, 6, 1),
(170, 6, 1),
(171, 6, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `celular` bigint(20) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `dni`, `domicilio`, `correo`, `celular`, `estado`) VALUES
(1, 'Kerlin Franco', 38018311, 'Coldaroli 949', 'Kerlin@gmail.com', 3454749769, 1),
(2, 'Iglesias Nicolas', 36452738, 'Beltran 1778', 'nico-igle@gmail.com', 2804354313, 1),
(3, 'Carrizo Matias', 35564662, 'Nanini 2965', 'maticarrizo@gmail.com', 3525306960, 1),
(4, 'Gleria Fabio', 31950827, 'Aleu 3619', 'fgleria@gmail.com', 1133441967, 1);

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
(2, 5, 1, 1, '2023-10-07', '2023-10-12', 50000, 1);

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
(1, 1, 1, 'simple', 10000, 'estandar'),
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
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=172;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
