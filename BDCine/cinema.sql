-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-07-2023 a las 08:25:57
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
-- Base de datos: `cinema`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `id` int(200) NOT NULL,
  `imagen` longblob NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `precio` int(100) NOT NULL,
  `fecha` varchar(200) NOT NULL,
  `boleto` varchar(200) NOT NULL,
  `genero` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `peliculas`
--

INSERT INTO `peliculas` (`id`, `imagen`, `nombre`, `precio`, `fecha`, `boleto`, `genero`) VALUES
(1, 0x6a617661782e7377696e672e4a4c6162656c5b2c302c302c323730783338302c616c69676e6d656e74583d302e302c616c69676e6d656e74593d302e302c626f726465723d6a617661782e7377696e672e706c61662e73796e74682e53796e7468426f726465724035333239366231312c666c6167733d383338383630382c6d6178696d756d53697a653d2c6d696e696d756d53697a653d2c70726566657272656453697a653d2c64656661756c7449636f6e3d6a617661782e7377696e672e496d61676549636f6e4032373334643937652c64697361626c656449636f6e3d2c686f72697a6f6e74616c416c69676e6d656e743d4c454144494e472c686f72697a6f6e74616c54657874506f736974696f6e3d545241494c494e472c69636f6e546578744761703d342c6c6162656c466f723d2c746578743d2c766572746963616c416c69676e6d656e743d43454e5445522c766572746963616c54657874506f736974696f6e3d43454e5445525d, 'IRON MAN 3', 7000, 'Sun Jul 02 21:32:02 COT 2023', 'ADOLECENTE', 'ACCION');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `id` int(100) NOT NULL,
  `cedula_usuario` int(100) NOT NULL,
  `nom_usuario` varchar(100) NOT NULL,
  `nom_pelicula` varchar(100) NOT NULL,
  `hora` int(100) NOT NULL,
  `fecha` int(100) NOT NULL,
  `sala` int(100) NOT NULL,
  `puesto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `cedula` int(200) NOT NULL,
  `contra` int(200) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`cedula`, `contra`, `nombre`, `apellido`, `correo`, `telefono`) VALUES
(1010138856, 1010, 'Andres Felipe', 'Garcia Rodriguez', 'ag016498@gmail.com', 313579326);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
