/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.20-log : Database - hezq
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hezq` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `hezq`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `book_id` varchar(100) NOT NULL COMMENT '图书ID',
  `book_name` varchar(100) DEFAULT NULL COMMENT '图书名称',
  `number` int(11) DEFAULT NULL COMMENT '馆藏数量',
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图书表';

/*Data for the table `book` */

insert  into `book`(`book_id`,`book_name`,`number`) values ('1000','Java程序设计',10),('1001','数据结构',10),('1002','设计模式',10),('1003','编译原理',10);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(100) NOT NULL COMMENT '学生ID',
  `name` varchar(100) DEFAULT NULL COMMENT '学生名称',
  `sex` varchar(2) DEFAULT NULL COMMENT '学生性别',
  `address` varchar(100) DEFAULT NULL COMMENT '学生地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`sex`,`address`) values (1,'张三','男','江西吉安');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
