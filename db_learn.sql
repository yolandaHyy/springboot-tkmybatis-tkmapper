/*
Navicat MySQL Data Transfer

Source Server         : common
Source Server Version : 50722
Source Host           : 192.168.177.128:3306
Source Database       : db_learn

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-08-13 20:47:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Procedure structure for add_vote_memory
-- ----------------------------
DROP PROCEDURE IF EXISTS `add_vote_memory`;
DELIMITER ;;
CREATE DEFINER=`loger`@`%` PROCEDURE `add_vote_memory`(IN n int)
BEGIN  
  DECLARE i INT DEFAULT 1;
    WHILE (i <= n ) DO
      INSERT into vote_record_memory  (user_id,vote_id,group_id,create_time ) VALUEs (rand_string(20),FLOOR(RAND() * 1000),FLOOR(RAND() * 100) ,now() );
            set i=i+1;
    END WHILE;
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for proc1
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc1`;
DELIMITER ;;
CREATE DEFINER=`loger`@`%` PROCEDURE `proc1`()
BEGIN
DECLARE v_cnt DECIMAL (10)  DEFAULT 0 ;
dd:LOOP
          INSERT  INTO card (card_number) VALUES (UUID());
                  COMMIT;
                    SET v_cnt = v_cnt+1 ;
                           IF  v_cnt = 10000000 THEN LEAVE dd;
                          END IF;
         END LOOP dd ;
END
;;
DELIMITER ;

-- ----------------------------
-- Function structure for rand_string
-- ----------------------------
DROP FUNCTION IF EXISTS `rand_string`;
DELIMITER ;;
CREATE DEFINER=`loger`@`%` FUNCTION `rand_string`(n INT) RETURNS varchar(255) CHARSET latin1
BEGIN 
DECLARE chars_str varchar(100) DEFAULT 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'; 
DECLARE return_str varchar(255) DEFAULT '' ;
DECLARE i INT DEFAULT 0; 
WHILE i < n DO 
SET return_str = concat(return_str,substring(chars_str , FLOOR(1 + RAND()*62 ),1)); 
SET i = i +1; 
END WHILE; 
RETURN return_str; 
END
;;
DELIMITER ;
