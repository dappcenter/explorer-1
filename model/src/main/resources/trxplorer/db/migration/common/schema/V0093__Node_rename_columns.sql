ALTER TABLE `node` 
CHANGE COLUMN `address` `host` VARCHAR(40) NOT NULL ,
CHANGE COLUMN `host` `port` INT(11) NOT NULL ;
