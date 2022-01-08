-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2018 at 01:43 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `do-nation`
--

-- --------------------------------------------------------

--
-- Table structure for table `blooddonation`
--

CREATE TABLE `blooddonation` (
  `donationPK` int(11) DEFAULT NULL,
  `InNeedInstitutionFK` int(11) DEFAULT NULL,
  `donorFK` int(11) DEFAULT NULL,
  `HospitalTechFK` int(11) DEFAULT NULL,
  `BodyWeight` double NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Height` double NOT NULL,
  `Age` int(11) NOT NULL,
  `Smoking_Condition` tinyint(1) DEFAULT NULL,
  `donationDateTime` int(11) DEFAULT NULL,
  `donationPurpose` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `deliveryservices`
--

CREATE TABLE `deliveryservices` (
  `DeliveryPK` int(11) DEFAULT NULL,
  `DeServiceNames` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deliveryservices`
--

INSERT INTO `deliveryservices` (`DeliveryPK`, `DeServiceNames`) VALUES
(701, 'Sicepat'),
(702, 'Tokopedia'),
(703, 'JNE');

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE `donor` (
  `DonorPK` int(11) DEFAULT NULL,
  `UserFK` int(11) DEFAULT NULL,
  `donName` varchar(30) DEFAULT NULL,
  `orgName` varchar(30) DEFAULT NULL,
  `donAddress` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`DonorPK`, `UserFK`, `donName`, `orgName`, `donAddress`) VALUES
(1, 601, 'Fery', 'Telkom', 'Bandung');

-- --------------------------------------------------------

--
-- Table structure for table `hospital_technician`
--

CREATE TABLE `hospital_technician` (
  `HospitalTechPK` int(11) DEFAULT NULL,
  `HospitalName` varchar(30) DEFAULT NULL,
  `CrewAmount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospital_technician`
--

INSERT INTO `hospital_technician` (`HospitalTechPK`, `HospitalName`, `CrewAmount`) VALUES
(801, 'HasanSadikin', 20),
(802, 'BayuAsih', 12),
(803, 'KemangiHost', 7);

-- --------------------------------------------------------

--
-- Table structure for table `inkinddonation`
--

CREATE TABLE `inkinddonation` (
  `donationPK` int(11) DEFAULT NULL,
  `InNeedInstitutionFK` int(11) DEFAULT NULL,
  `donorFK` int(11) DEFAULT NULL,
  `DeliveryFK` int(11) DEFAULT NULL,
  `ItemName` varchar(30) NOT NULL,
  `TotalWeight` double NOT NULL,
  `donationDateTime` int(11) DEFAULT NULL,
  `donationPurpose` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inkinddonation`
--

INSERT INTO `inkinddonation` (`donationPK`, `InNeedInstitutionFK`, `donorFK`, `DeliveryFK`, `ItemName`, `TotalWeight`, `donationDateTime`, `donationPurpose`) VALUES
(201, 302, 1, 302, 'Baju', 20, 2018, 'InKind Donation'),
(202, 302, 1, 302, 'Buku', 100, 2018, 'InKind Donation');

-- --------------------------------------------------------

--
-- Table structure for table `inneedinstitution`
--

CREATE TABLE `inneedinstitution` (
  `InNeedPK` int(11) DEFAULT NULL,
  `InstName` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `inneedinstitution`
--

INSERT INTO `inneedinstitution` (`InNeedPK`, `InstName`) VALUES
(302, 'BantuDonor'),
(302, 'InterPeduli'),
(302, 'KamiPeduli');

-- --------------------------------------------------------

--
-- Table structure for table `moneydonation`
--

CREATE TABLE `moneydonation` (
  `donationPK` int(11) DEFAULT NULL,
  `InNeedInstitutionFK` int(11) DEFAULT NULL,
  `donorFK` int(11) DEFAULT NULL,
  `AccountOwner` varchar(30) NOT NULL,
  `BankName` varchar(10) NOT NULL,
  `AccountNumber` varchar(30) NOT NULL,
  `DestinationBank` varchar(30) NOT NULL,
  `donationDateTime` int(11) DEFAULT NULL,
  `donationPurpose` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `moneydonation`
--

INSERT INTO `moneydonation` (`donationPK`, `InNeedInstitutionFK`, `donorFK`, `AccountOwner`, `BankName`, `AccountNumber`, `DestinationBank`, `donationDateTime`, `donationPurpose`) VALUES
(301, 302, 1, 'Asty', 'Mandiri', '1452', 'BNI', 2018, 'Money Donation'),
(302, 302, 1, 'FAE', 'InBank', '999', 'Mandiri', 2018, 'Money Donation');

-- --------------------------------------------------------

--
-- Table structure for table `user1`
--

CREATE TABLE `user1` (
  `UserPK` int(11) DEFAULT NULL,
  `Username` varchar(30) NOT NULL,
  `PASSWORD` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user1`
--

INSERT INTO `user1` (`UserPK`, `Username`, `PASSWORD`) VALUES
(601, 'FAE', 'TACTUS');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
