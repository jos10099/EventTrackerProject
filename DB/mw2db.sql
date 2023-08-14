-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mw2db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mw2db` ;

-- -----------------------------------------------------
-- Schema mw2db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mw2db` DEFAULT CHARACTER SET utf8 ;
USE `mw2db` ;

-- -----------------------------------------------------
-- Table `Starli`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Starli` ;

CREATE TABLE IF NOT EXISTS `Starli` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `weapon` VARCHAR(45) NULL,
  `favorite_perk` VARCHAR(45) NULL,
  `operator_skin` VARCHAR(45) NULL,
  `level` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS mw2user@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'mw2user'@'localhost' IDENTIFIED BY 'mw2user';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'mw2user'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `Starli`
-- -----------------------------------------------------
START TRANSACTION;
USE `mw2db`;
INSERT INTO `Starli` (`id`, `username`, `weapon`, `favorite_perk`, `operator_skin`, `level`) VALUES (1, 'WEEBMILK', 'TAQ-56', 'Double Time', 'Starlight', '292');

COMMIT;

