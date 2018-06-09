-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 2018-06-09 13:35:52
-- 服务器版本： 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `doma_gen_db`
--

-- --------------------------------------------------------

--
-- 表的结构 `test_tbl`
--

CREATE TABLE IF NOT EXISTS `test_tbl` (
  `item_int` int(10) NOT NULL,
  `item_varchar` varchar(10) DEFAULT NULL,
  `item_text` text,
  `item_date` date DEFAULT NULL,
  `item_tinyint` tinyint(10) DEFAULT NULL,
  `item_smallint` smallint(10) DEFAULT NULL,
  `item_bigint` bigint(20) NOT NULL,
  `item_decimal` decimal(10,0) NOT NULL,
  `item_float` float NOT NULL,
  `item_double` double NOT NULL,
  `item_real` double NOT NULL,
  `item_bit` bit(10) NOT NULL,
  `item_boolean` tinyint(1) NOT NULL,
`item_serial` bigint(20) unsigned NOT NULL,
  `item_datetime` datetime NOT NULL,
  `item_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `item_time` time NOT NULL,
  `item_year` year(4) NOT NULL,
  `item_char` char(10) NOT NULL,
  `item_tinytext` tinytext NOT NULL,
  `item_mediumtext` mediumtext NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- 转存表中的数据 `test_tbl`
--

INSERT INTO `test_tbl` (`item_int`, `item_varchar`, `item_text`, `item_date`, `item_tinyint`, `item_smallint`, `item_bigint`, `item_decimal`, `item_float`, `item_double`, `item_real`, `item_bit`, `item_boolean`, `item_serial`, `item_datetime`, `item_timestamp`, `item_time`, `item_year`, `item_char`, `item_tinytext`, `item_mediumtext`) VALUES
(1, 'aaa', 'b', '0000-00-00', 127, 0, 0, '0', 0, 0, 0, b'0000000000', 0, 1, '0000-00-00 00:00:00', '2018-06-09 11:33:24', '00:00:00', 0000, '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `test_tbl`
--
ALTER TABLE `test_tbl`
 ADD PRIMARY KEY (`item_int`), ADD UNIQUE KEY `item_serial` (`item_serial`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `test_tbl`
--
ALTER TABLE `test_tbl`
MODIFY `item_serial` bigint(20) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
