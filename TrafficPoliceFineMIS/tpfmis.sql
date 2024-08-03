-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 07, 2023 at 05:47 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tpfmis`
--

-- --------------------------------------------------------

--
-- Table structure for table `admindetails`
--

CREATE TABLE `admindetails` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `fname` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `lastname` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `tazkira` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `photo` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `district` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `user_type_id_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `admindetails`
--

INSERT INTO `admindetails` (`id`, `name`, `fname`, `lastname`, `email`, `tazkira`, `password`, `photo`, `district`, `user_type_id_fk`) VALUES
(7, 'مریم', 'صمد', 'شریفی', NULL, '332553', '123', NULL, '17', 2);

-- --------------------------------------------------------

--
-- Table structure for table `bankadmindetails`
--

CREATE TABLE `bankadmindetails` (
  `id` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `fname` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `lastname` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `tazkira` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `photo` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `district` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `user_type_id_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `bankadmindetails`
--

INSERT INTO `bankadmindetails` (`id`, `name`, `fname`, `lastname`, `email`, `tazkira`, `password`, `photo`, `district`, `user_type_id_fk`) VALUES
(2, 'سمیرا', 'نواب', 'سخی زاده', NULL, '34333332', '333', NULL, '11', 4);

-- --------------------------------------------------------

--
-- Table structure for table `fineamount`
--

CREATE TABLE `fineamount` (
  `id` int(11) NOT NULL,
  `fine_type` varchar(20) COLLATE utf8_persian_ci DEFAULT NULL,
  `amount` double NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `fineamount`
--

INSERT INTO `fineamount` (`id`, `fine_type`, `amount`) VALUES
(1, 'اضافه بار', 100),
(2, 'توقف بیجا', 200),
(3, 'خلاف قوانین', 1000),
(4, 'عبور اشاره', 500);

-- --------------------------------------------------------

--
-- Table structure for table `finepayments`
--

CREATE TABLE `finepayments` (
  `id` int(11) NOT NULL,
  `fined_veh_id` int(11) DEFAULT NULL,
  `date_` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `vehicle_type_id_fk` int(11) DEFAULT NULL,
  `color` varchar(20) COLLATE utf8_persian_ci DEFAULT NULL,
  `vin` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `regNr` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `driver_name` varchar(50) COLLATE utf8_persian_ci DEFAULT NULL,
  `fine_amount_id_fk` int(11) DEFAULT NULL,
  `fine_type_id_fk` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `finepayments`
--

INSERT INTO `finepayments` (`id`, `fined_veh_id`, `date_`, `vehicle_type_id_fk`, `color`, `vin`, `regNr`, `driver_name`, `fine_amount_id_fk`, `fine_type_id_fk`) VALUES
(31, 34, '15-2-2023', 7, 'زرد', 'dfo919881gh111222', '9933', 'dfo919881gh111222', 2, 2),
(32, 34, '15-2-2023', 7, 'زرد', 'dfo919881gh111222', '9933', 'امیر', 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `fine_execution`
--

CREATE TABLE `fine_execution` (
  `id` int(11) NOT NULL,
  `date_` varchar(50) COLLATE utf8_persian_ci NOT NULL DEFAULT '',
  `vehicleType_id_fk` int(11) NOT NULL,
  `color` varchar(50) COLLATE utf8_persian_ci NOT NULL DEFAULT '',
  `makeyear_id_fk` int(11) NOT NULL,
  `vin` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `engine` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `province_id_fk` int(11) NOT NULL,
  `plate_nr` varchar(50) COLLATE utf8_persian_ci NOT NULL DEFAULT '',
  `fine_amount_id_fk` int(11) NOT NULL,
  `fine_type_id_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `fine_execution`
--

INSERT INTO `fine_execution` (`id`, `date_`, `vehicleType_id_fk`, `color`, `makeyear_id_fk`, `vin`, `engine`, `province_id_fk`, `plate_nr`, `fine_amount_id_fk`, `fine_type_id_fk`) VALUES
(35, '2023-02-14 22:08:40', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 1, 1),
(36, '2023-02-14 22:10:43', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 1, 1),
(37, '2023/02/14 22:32:55', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 1, 1),
(38, '2023/02/17 11:07:38', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 4, 4),
(40, '2023/02/17 11:17:56', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 3, 3),
(41, '2023/02/22 20:49:04', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 2, 3),
(42, '2023/02/22 20:55:34', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 1, 1),
(43, '2023/02/23 22:04:54', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 3, 2),
(44, '2023/02/25 17:24:55', 7, 'زرد', 1, 'dfo919881gh111222', 'abc9292kj22i111', 1, '9933', 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `fine_type`
--

CREATE TABLE `fine_type` (
  `id` int(11) NOT NULL,
  `type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fine_type`
--

INSERT INTO `fine_type` (`id`, `type`) VALUES
(1, 'اضافه بار'),
(2, 'توقف بیجا'),
(3, 'خلاف قوانین'),
(4, 'عبور اشاره');

-- --------------------------------------------------------

--
-- Table structure for table `makeyear`
--

CREATE TABLE `makeyear` (
  `id` int(11) NOT NULL,
  `year` varchar(30) COLLATE utf8_persian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `makeyear`
--

INSERT INTO `makeyear` (`id`, `year`) VALUES
(1, '1997'),
(2, '1998'),
(3, '2000'),
(4, '2003'),
(5, '2004'),
(6, '2006'),
(7, '2009'),
(8, '2010'),
(9, '2011'),
(10, '2012'),
(11, '2013'),
(12, '2014'),
(13, '2015'),
(14, '2016'),
(15, '2017'),
(16, '2018'),
(17, '2019'),
(18, '2020');

-- --------------------------------------------------------

--
-- Table structure for table `make_country`
--

CREATE TABLE `make_country` (
  `id` int(11) NOT NULL,
  `country_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `make_country`
--

INSERT INTO `make_country` (`id`, `country_name`) VALUES
(1, 'جرمنی'),
(2, 'کانادا'),
(3, 'ایران'),
(4, 'جاپان');

-- --------------------------------------------------------

--
-- Table structure for table `owner_details`
--

CREATE TABLE `owner_details` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `fname` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) DEFAULT NULL,
  `tazkiraNr` varchar(50) DEFAULT NULL,
  `license_nr` int(11) DEFAULT NULL,
  `issue_date` varchar(50) DEFAULT NULL,
  `expire_date` varchar(50) DEFAULT NULL,
  `contact_nr` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `owner_details`
--

INSERT INTO `owner_details` (`id`, `name`, `fname`, `password`, `lastname`, `tazkiraNr`, `license_nr`, `issue_date`, `expire_date`, `contact_nr`) VALUES
(1, 'میرویس', 'شاه', '123', 'رسولی', '324322', 2322322, '13-2-2023', '13-2-2025', '07882288228');

-- --------------------------------------------------------

--
-- Table structure for table `province`
--

CREATE TABLE `province` (
  `id` int(11) NOT NULL,
  `provinceName` varchar(20) COLLATE utf8_persian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci COMMENT='لیست ولایات';

--
-- Dumping data for table `province`
--

INSERT INTO `province` (`id`, `provinceName`) VALUES
(1, 'کابل'),
(2, 'لغمان'),
(3, 'جلال اباد'),
(4, 'هرات');

-- --------------------------------------------------------

--
-- Table structure for table `usertype`
--

CREATE TABLE `usertype` (
  `id` int(11) NOT NULL,
  `user` varchar(20) COLLATE utf8_persian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `usertype`
--

INSERT INTO `usertype` (`id`, `user`) VALUES
(2, 'مدیر سیستم'),
(4, 'مامور بانک');

-- --------------------------------------------------------

--
-- Table structure for table `vehiclesdetails`
--

CREATE TABLE `vehiclesdetails` (
  `id` int(50) NOT NULL,
  `veh_type_id_fk` int(11) NOT NULL,
  `make_id_fk` int(11) NOT NULL,
  `regNr` varchar(20) COLLATE utf8_persian_ci NOT NULL,
  `vin` varchar(20) COLLATE utf8_persian_ci NOT NULL,
  `engNr` varchar(20) COLLATE utf8_persian_ci NOT NULL,
  `color` varchar(20) COLLATE utf8_persian_ci NOT NULL,
  `prv_id_fk` int(11) NOT NULL,
  `owner` varchar(50) COLLATE utf8_persian_ci NOT NULL,
  `country_made_id_fk` int(11) NOT NULL,
  `veh_brand_id_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci COMMENT='مشخصات وسایط';

--
-- Dumping data for table `vehiclesdetails`
--

INSERT INTO `vehiclesdetails` (`id`, `veh_type_id_fk`, `make_id_fk`, `regNr`, `vin`, `engNr`, `color`, `prv_id_fk`, `owner`, `country_made_id_fk`, `veh_brand_id_fk`) VALUES
(7, 7, 1, '9933', 'dfo919881gh111222', 'abc9292kj22i111', 'زرد', 1, 'احمد', 4, 1),
(11, 1, 8, '12331', 'mkosw9929222', 'mkosw9929222', 'آبی', 1, 'علی', 4, 1),
(12, 2, 6, '43221', 'gh087678ggf99', 'gh087678ggf99', 'سفید', 1, 'گلدل', 4, 1),
(14, 1, 8, '14229', 'hoki557sth01', 'hoki557sth01', 'سفید', 4, 'اسد', 4, 1),
(15, 1, 1, '333', 'aaa', 'aaa', 'aaa', 1, 'aaa', 1, 1),
(16, 1, 1, '223', '21xx', '21xx', 'ccc', 1, 'xxx', 1, 1),
(17, 1, 1, '444', 'ss2222', 'ss2222', 'fff', 1, 'fff', 1, 1),
(18, 1, 1, '555', 'ae5555', 'ae5555', 'tttaat', 1, 'atatta', 1, 1),
(19, 1, 1, '435', 'v3q444', 'vqc545345', 'vva', 1, 'vav', 1, 1),
(22, 1, 1, '', '', '', '', 1, '', 1, 1),
(38, 3, 6, '12144', 'adsd3323', 'asdd34awa', 'زرد', 1, 'خلیل', 1, 5);

-- --------------------------------------------------------

--
-- Stand-in structure for view `vehicles_view_table`
-- (See below for the actual view)
--
CREATE TABLE `vehicles_view_table` (
`id` int(50)
,`vehType` varchar(20)
,`year` varchar(30)
,`regNr` varchar(20)
,`vin` varchar(20)
,`engNr` varchar(20)
,`color` varchar(20)
,`provinceName` varchar(20)
,`owner` varchar(50)
,`country_name` varchar(20)
,`brand_name` varchar(20)
);

-- --------------------------------------------------------

--
-- Table structure for table `vehicletype`
--

CREATE TABLE `vehicletype` (
  `id` int(11) NOT NULL,
  `vehType` varchar(20) COLLATE utf8_persian_ci NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_persian_ci;

--
-- Dumping data for table `vehicletype`
--

INSERT INTO `vehicletype` (`id`, `vehType`) VALUES
(1, 'هایلکس'),
(2, 'کرولا'),
(3, 'کرن'),
(4, 'تخته فرش'),
(5, 'تیلر'),
(6, 'موترسایکل'),
(7, 'تکسی');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle_brand`
--

CREATE TABLE `vehicle_brand` (
  `id` int(11) NOT NULL,
  `brand_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vehicle_brand`
--

INSERT INTO `vehicle_brand` (`id`, `brand_name`) VALUES
(1, 'تیوتا'),
(2, 'بنز'),
(3, 'ولکس واگون'),
(4, 'رنج روفر'),
(5, 'مازدا'),
(6, 'پراید'),
(7, 'زرنج'),
(8, 'بموی');

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_paid_fines`
-- (See below for the actual view)
--
CREATE TABLE `view_paid_fines` (
`id` int(11)
,`fined_veh_id` int(11)
,`date_` varchar(50)
,`vehType` varchar(20)
,`color` varchar(20)
,`vin` varchar(50)
,`regNr` varchar(50)
,`driver_name` varchar(50)
,`amount` double
,`type` varchar(20)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `view_vehiclesfine`
-- (See below for the actual view)
--
CREATE TABLE `view_vehiclesfine` (
`id` int(11)
,`date_` varchar(50)
,`vehType` varchar(20)
,`color` varchar(50)
,`year` varchar(30)
,`vin` varchar(50)
,`engine` varchar(50)
,`provinceName` varchar(20)
,`plate_nr` varchar(50)
,`amount` double
,`fine_type` varchar(20)
);

-- --------------------------------------------------------

--
-- Structure for view `vehicles_view_table`
--
DROP TABLE IF EXISTS `vehicles_view_table`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vehicles_view_table`  AS SELECT `vehiclesdetails`.`id` AS `id`, `vehicletype`.`vehType` AS `vehType`, `makeyear`.`year` AS `year`, `vehiclesdetails`.`regNr` AS `regNr`, `vehiclesdetails`.`vin` AS `vin`, `vehiclesdetails`.`engNr` AS `engNr`, `vehiclesdetails`.`color` AS `color`, `province`.`provinceName` AS `provinceName`, `vehiclesdetails`.`owner` AS `owner`, `make_country`.`country_name` AS `country_name`, `vehicle_brand`.`brand_name` AS `brand_name` FROM (((((`vehiclesdetails` join `vehicletype` on(`vehiclesdetails`.`veh_type_id_fk` = `vehicletype`.`id`)) join `makeyear` on(`vehiclesdetails`.`make_id_fk` = `makeyear`.`id`)) join `make_country` on(`vehiclesdetails`.`country_made_id_fk` = `make_country`.`id`)) join `vehicle_brand` on(`vehiclesdetails`.`veh_brand_id_fk` = `vehicle_brand`.`id`)) join `province` on(`vehiclesdetails`.`prv_id_fk` = `province`.`id`))  ;

-- --------------------------------------------------------

--
-- Structure for view `view_paid_fines`
--
DROP TABLE IF EXISTS `view_paid_fines`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_paid_fines`  AS SELECT `finepayments`.`id` AS `id`, `finepayments`.`fined_veh_id` AS `fined_veh_id`, `finepayments`.`date_` AS `date_`, `vehicletype`.`vehType` AS `vehType`, `finepayments`.`color` AS `color`, `finepayments`.`vin` AS `vin`, `finepayments`.`regNr` AS `regNr`, `finepayments`.`driver_name` AS `driver_name`, `fineamount`.`amount` AS `amount`, `fine_type`.`type` AS `type` FROM (((`finepayments` join `vehicletype` on(`vehicletype`.`id` = `finepayments`.`vehicle_type_id_fk`)) join `fineamount` on(`fineamount`.`id` = `finepayments`.`fine_amount_id_fk`)) join `fine_type` on(`fine_type`.`id` = `finepayments`.`fine_type_id_fk`))  ;

-- --------------------------------------------------------

--
-- Structure for view `view_vehiclesfine`
--
DROP TABLE IF EXISTS `view_vehiclesfine`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_vehiclesfine`  AS SELECT `fine_execution`.`id` AS `id`, `fine_execution`.`date_` AS `date_`, `vehicletype`.`vehType` AS `vehType`, `fine_execution`.`color` AS `color`, `makeyear`.`year` AS `year`, `fine_execution`.`vin` AS `vin`, `fine_execution`.`engine` AS `engine`, `province`.`provinceName` AS `provinceName`, `fine_execution`.`plate_nr` AS `plate_nr`, `fineamount`.`amount` AS `amount`, `fineamount`.`fine_type` AS `fine_type` FROM (((((`fine_execution` join `vehicletype` on(`vehicletype`.`id` = `fine_execution`.`vehicleType_id_fk`)) join `makeyear` on(`makeyear`.`id` = `fine_execution`.`makeyear_id_fk`)) join `province` on(`province`.`id` = `fine_execution`.`province_id_fk`)) join `fineamount` on(`fineamount`.`id` = `fine_execution`.`fine_amount_id_fk`)) join `fine_type` on(`fine_type`.`id` = `fine_execution`.`fine_type_id_fk`))  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admindetails`
--
ALTER TABLE `admindetails`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_admindetails_usertype` (`user_type_id_fk`);

--
-- Indexes for table `bankadmindetails`
--
ALTER TABLE `bankadmindetails`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_bankadmindetails_usertype` (`user_type_id_fk`);

--
-- Indexes for table `fineamount`
--
ALTER TABLE `fineamount`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `finepayments`
--
ALTER TABLE `finepayments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_finepayments_finemount` (`fine_amount_id_fk`),
  ADD KEY `FK_finepayments_vehicletype` (`vehicle_type_id_fk`),
  ADD KEY `fine_type_id_fk` (`fine_type_id_fk`);

--
-- Indexes for table `fine_execution`
--
ALTER TABLE `fine_execution`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_fine_execution_finemount` (`fine_amount_id_fk`),
  ADD KEY `FK_fine_execution_province` (`province_id_fk`),
  ADD KEY `FK_fine_execution_makeyear` (`makeyear_id_fk`),
  ADD KEY `FK_fine_execution_vehicletype` (`vehicleType_id_fk`),
  ADD KEY `FK_fine_execution_fine_type` (`fine_type_id_fk`);

--
-- Indexes for table `fine_type`
--
ALTER TABLE `fine_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `makeyear`
--
ALTER TABLE `makeyear`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `make_country`
--
ALTER TABLE `make_country`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `owner_details`
--
ALTER TABLE `owner_details`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `province`
--
ALTER TABLE `province`
  ADD PRIMARY KEY (`id`) USING BTREE;

--
-- Indexes for table `usertype`
--
ALTER TABLE `usertype`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vehiclesdetails`
--
ALTER TABLE `vehiclesdetails`
  ADD PRIMARY KEY (`id`) USING BTREE,
  ADD UNIQUE KEY `engNr` (`engNr`),
  ADD UNIQUE KEY `regNr_vin` (`regNr`,`vin`),
  ADD KEY `FK_vehiclesdetails_province` (`prv_id_fk`),
  ADD KEY `FK_vehiclesdetails_vehicletype` (`veh_type_id_fk`),
  ADD KEY `FK_vehiclesdetails_makeyear` (`make_id_fk`),
  ADD KEY `FK_vehicleDetails_countryMade` (`country_made_id_fk`),
  ADD KEY `FK_vehicleDetails_veh_Brand` (`veh_brand_id_fk`);

--
-- Indexes for table `vehicletype`
--
ALTER TABLE `vehicletype`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vehicle_brand`
--
ALTER TABLE `vehicle_brand`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admindetails`
--
ALTER TABLE `admindetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `bankadmindetails`
--
ALTER TABLE `bankadmindetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `fineamount`
--
ALTER TABLE `fineamount`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `finepayments`
--
ALTER TABLE `finepayments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `fine_execution`
--
ALTER TABLE `fine_execution`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `fine_type`
--
ALTER TABLE `fine_type`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `makeyear`
--
ALTER TABLE `makeyear`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `make_country`
--
ALTER TABLE `make_country`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `owner_details`
--
ALTER TABLE `owner_details`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `province`
--
ALTER TABLE `province`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `usertype`
--
ALTER TABLE `usertype`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `vehiclesdetails`
--
ALTER TABLE `vehiclesdetails`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT for table `vehicletype`
--
ALTER TABLE `vehicletype`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `vehicle_brand`
--
ALTER TABLE `vehicle_brand`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admindetails`
--
ALTER TABLE `admindetails`
  ADD CONSTRAINT `FK_admindetails_usertype` FOREIGN KEY (`user_type_id_fk`) REFERENCES `usertype` (`id`);

--
-- Constraints for table `bankadmindetails`
--
ALTER TABLE `bankadmindetails`
  ADD CONSTRAINT `FK_bankadmindetails_usertype` FOREIGN KEY (`user_type_id_fk`) REFERENCES `usertype` (`id`);

--
-- Constraints for table `finepayments`
--
ALTER TABLE `finepayments`
  ADD CONSTRAINT `FK_finepayments_fine_type` FOREIGN KEY (`fine_type_id_fk`) REFERENCES `fine_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_finepayments_finemount` FOREIGN KEY (`fine_amount_id_fk`) REFERENCES `fineamount` (`id`),
  ADD CONSTRAINT `FK_finepayments_vehicletype` FOREIGN KEY (`vehicle_type_id_fk`) REFERENCES `vehicletype` (`id`);

--
-- Constraints for table `fine_execution`
--
ALTER TABLE `fine_execution`
  ADD CONSTRAINT `FK_fine_execution_fine_type` FOREIGN KEY (`fine_type_id_fk`) REFERENCES `fine_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_fine_execution_fineamount_` FOREIGN KEY (`fine_amount_id_fk`) REFERENCES `fineamount` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_fine_execution_makeyear` FOREIGN KEY (`makeyear_id_fk`) REFERENCES `makeyear` (`id`),
  ADD CONSTRAINT `FK_fine_execution_province` FOREIGN KEY (`province_id_fk`) REFERENCES `province` (`id`),
  ADD CONSTRAINT `FK_fine_execution_vehicletype` FOREIGN KEY (`vehicleType_id_fk`) REFERENCES `vehicletype` (`id`);

--
-- Constraints for table `vehiclesdetails`
--
ALTER TABLE `vehiclesdetails`
  ADD CONSTRAINT `FK_vehicleDetails_countryMade` FOREIGN KEY (`country_made_id_fk`) REFERENCES `make_country` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_vehicleDetails_veh_Brand` FOREIGN KEY (`veh_brand_id_fk`) REFERENCES `vehicle_brand` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_vehicles_details_vehType` FOREIGN KEY (`veh_type_id_fk`) REFERENCES `vehicletype` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_vehiclesdetails_makeyear` FOREIGN KEY (`make_id_fk`) REFERENCES `makeyear` (`id`),
  ADD CONSTRAINT `FK_vehiclesdetails_province` FOREIGN KEY (`prv_id_fk`) REFERENCES `province` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
