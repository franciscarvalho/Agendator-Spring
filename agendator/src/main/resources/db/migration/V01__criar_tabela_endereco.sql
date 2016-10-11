CREATE TABLE IF NOT EXISTS `agendator`.`endereco` (
  `id` INT NOT NULL,
  `logradouro` VARCHAR(120) NULL,
  `numero` VARCHAR(5) NULL,
  `cep` VARCHAR(8) NULL,
  `complemento` VARCHAR(120) NULL,
  `cidade` VARCHAR(100) NULL,
  `bairro` VARCHAR(100) NULL,
  `estado` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;