CREATE DATABASE generation_bootcamp;
Use generation_bootcamp;
CREATE TABLE cohorte12 (cohorte12_id INT NOT NULL AUTO_INCREMENT, alumnos_id INT NOT NULL, PRIMARY KEY(cohorte12_id));

-- este es un comentario de una linea
/*comentario 
de mas de una 
linea*/

/*INSERT INTO es un comando para añadir iformacion sobre las tablas
INSERT INTO `generation_bootcamp`.`cohorte12` (`alumnos_id`) VALUES ('35');
INSERT INTO `generation_bootcamp`.`cohorte12` (`alumnos_id`) VALUFK1_alumno_id_chohorte12FK1_alumno_id_chohorte12FK1_alumno_id_chohorte12FK1_alumno_id_chohorte12ES ('40');
*/

-- Aqui se altera y se agregan mas columnas que tenia al pricipio de crear la tabla
/*ALTER TABLE `generation_bootcamp`.`cohorte12` 
ADD COLUMN `instructor_id` INT NOT NULL AFTER `alumnos_id`,
ADD COLUMN `numero_alumnos` INT NOT NULL AFTER `instructor_id`,
ADD COLUMN `horario` CHAR(10) NOT NULL AFTER `numero_alumnos`,
ADD COLUMN `tipo_sesiones` VARCHAR(250) NOT NULL AFTER `horario`,
ADD COLUMN `ciudad` VARCHAR(250) CHARACTER SET 'ascii' NOT NULL AFTER `tipo_sesiones`;

