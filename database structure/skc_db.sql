/*
SQLyog Community Edition- MySQL GUI v8.03 
MySQL - 5.1.32-community : Database - skc_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`skc_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `skc_db`;

/*Table structure for table `tbl_admin` */

DROP TABLE IF EXISTS `tbl_admin`;

CREATE TABLE `tbl_admin` (
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `logged_in` varchar(10) DEFAULT NULL,
  `last_login` varchar(50) DEFAULT NULL,
  `last_logout` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Table structure for table `tbl_food` */

DROP TABLE IF EXISTS `tbl_food`;

CREATE TABLE `tbl_food` (
  `food_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(30) DEFAULT NULL,
  `rice_type` varchar(15) DEFAULT NULL,
  `injicurry` varchar(15) DEFAULT NULL,
  `lemon_pickle` varchar(15) DEFAULT NULL,
  `mango_pickle` varchar(15) DEFAULT NULL,
  `pachadi` varchar(15) DEFAULT NULL,
  `oolan` varchar(15) DEFAULT NULL,
  `kichadi` varchar(15) DEFAULT NULL,
  `thoran` varchar(15) DEFAULT NULL,
  `kaalan` varchar(15) DEFAULT NULL,
  `aviyal` varchar(15) DEFAULT NULL,
  `masalacurry` varchar(15) DEFAULT NULL,
  `kootucurry` varchar(15) DEFAULT NULL,
  `kattiparipp` varchar(15) DEFAULT NULL,
  `saambar` varchar(15) DEFAULT NULL,
  `rasam` varchar(15) DEFAULT NULL,
  `sambaaram` varchar(15) DEFAULT NULL,
  `pappadam` varchar(15) DEFAULT NULL,
  `njalipoovan` varchar(15) DEFAULT NULL,
  `kaayavaruthath` varchar(15) DEFAULT NULL,
  `sarkkarapuratti` varchar(15) DEFAULT NULL,
  `paalada` varchar(15) DEFAULT NULL,
  `suchigothamb_paayasam` varchar(15) DEFAULT NULL,
  `paripp_payasam` varchar(15) DEFAULT NULL,
  `water` varchar(15) DEFAULT NULL,
  `vazhayila` varchar(15) DEFAULT NULL,
  `paper_roll` varchar(15) DEFAULT NULL,
  `paper_glass` varchar(15) DEFAULT NULL,
  `ellunda` varchar(15) DEFAULT NULL,
  `paripp_vada` varchar(15) DEFAULT NULL,
  `vilambu_paathrangal` varchar(15) DEFAULT NULL,
  UNIQUE KEY `food_id` (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Table structure for table `tbl_user` */

DROP TABLE IF EXISTS `tbl_user`;

CREATE TABLE `tbl_user` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `place` varchar(50) DEFAULT NULL,
  `order_date` varchar(100) DEFAULT NULL,
  `people_count` varchar(500) DEFAULT NULL,
  `delivery_time` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `phone1` varchar(15) DEFAULT NULL,
  `phone2` varchar(15) DEFAULT NULL,
  `phone3` varchar(15) DEFAULT NULL,
  `createdAt` varchar(50) DEFAULT NULL,
  `updatedAt` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
