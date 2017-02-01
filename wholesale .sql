-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 20, 2016 at 02:03 AM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `wholesale`
--

-- --------------------------------------------------------

--
-- Table structure for table `dealer`
--

CREATE TABLE IF NOT EXISTS `dealer` (
  `D_id` int(11) NOT NULL DEFAULT '0',
  `D_name` varchar(20) DEFAULT NULL,
  `D_contact` varchar(10) DEFAULT NULL,
  `D_email` varchar(40) DEFAULT NULL,
  `D_address` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`D_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dealer`
--

INSERT INTO `dealer` (`D_id`, `D_name`, `D_contact`, `D_email`, `D_address`) VALUES
(101, 'Divya', '9897435655', 'was', 'ghar'),
(102, 'deep ', '7878789878', 'has', 'ghar');

-- --------------------------------------------------------

--
-- Table structure for table `retailer`
--

CREATE TABLE IF NOT EXISTS `retailer` (
  `R_id` int(11) NOT NULL DEFAULT '0',
  `R_name` varchar(20) DEFAULT NULL,
  `R_contact` varchar(10) DEFAULT NULL,
  `R_email` varchar(40) DEFAULT NULL,
  `R_address` varchar(40) DEFAULT NULL,
  `R_AmountLeft` int(11) DEFAULT NULL,
  `R_AmountPaid` int(11) DEFAULT NULL,
  PRIMARY KEY (`R_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `retailer`
--

INSERT INTO `retailer` (`R_id`, `R_name`, `R_contact`, `R_email`, `R_address`, `R_AmountLeft`, `R_AmountPaid`) VALUES
(1, 'gaurav', '9783547290', 'fac', 'badowala', 290339, 2222),
(2, 'dipit ', '9557574988', 'xyz', 'badowala', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `shipped`
--

CREATE TABLE IF NOT EXISTS `shipped` (
  `Order_id` int(11) DEFAULT NULL,
  `Retailer_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  KEY `Retailer_id` (`Retailer_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shipped`
--

INSERT INTO `shipped` (`Order_id`, `Retailer_id`, `quantity`, `Price`) VALUES
(1001, 2, 23, 23459.8);

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE IF NOT EXISTS `stock` (
  `P_name` varchar(20) DEFAULT NULL,
  `PricePerItem` int(11) DEFAULT NULL,
  `Quantity` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`P_name`, `PricePerItem`, `Quantity`) VALUES
('hp compact 15s 103tx', 25000, 200),
('Apple_MacBook', 45000, 200),
('Vaio_Sonic_F15', 22000, 200),
('Lenovo_Yoga_Series', 60000, 200),
('Asus_VivoBook_S200E', 35000, 200);

-- --------------------------------------------------------

--
-- Table structure for table `unshipped`
--

CREATE TABLE IF NOT EXISTS `unshipped` (
  `Order_id` int(11) DEFAULT NULL,
  `Retailer_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  `DOD` varchar(20) DEFAULT NULL,
  KEY `Retailer_id` (`Retailer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `unshipped`
--

INSERT INTO `unshipped` (`Order_id`, `Retailer_id`, `quantity`, `Price`, `DOD`) VALUES
(1002, 2, 24, 189200, '2016/12/19'),
(1004, 1, 34, 123.8, '2016/3/12');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `unshipped`
--
ALTER TABLE `unshipped`
  ADD CONSTRAINT `unshipped_ibfk_1` FOREIGN KEY (`Retailer_id`) REFERENCES `retailer` (`R_id`);
