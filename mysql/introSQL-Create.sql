-- crear

-- crear una base de datos
CREATE DATABASE familia; 

-- seleccionar la base de datos (para crear tablas dentro de ella)
USE familia;

-- crear tabla de persona; es necesario poner minimo una columna
-- no es necesario el NOT NULL en la llave primaria (por que se procede de la base que es incrementada)
-- especificar en la tabla cual es la llave primaria 
-- para agregar valores unicos se utiliza UNIQUE

CREATE TABLE 
persona (persona_id int AUTO_INCREMENT ,
PRIMARY KEY (persona_id),
nombre VARCHAR (255) NOT NULL,
correo VARCHAR (255) NOT NULL,
CONSTRAINT correo_unico UNIQUE (correo),
edad int NOT NULL,
estado VARCHAR (255) DEFAULT "Desconocido", 
cumpleanios DATE
);

-- insertar datos en una tabla
-- tienen que ser en el orden indicados
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
('Mario','adolfo.rdz.gtz@gmail.com','28','feliz','1994-02-25'),
('Adolfo','cerbero@gmail.com','27','feliz','1994-12-13');

-- Error 1062: dato unico repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
('Sofia','adolfo.rdz.gtz@gmail.com','27','feliz','1993-05-06');

-- Error 1136: no llenar un dato NOT NULL
INSERT INTO persona(nombre,correo,edad,estado,cumpleanios) values
('sophie27@gmail.com','30','feliz','1993-05-06');

-- Ingresar datos opcionales(se quita cumpleanios por que no es un NOT NULL) y no afecta la tabla
INSERT INTO persona(nombre,correo,edad,estado) values
('Sofia','sophie27@gmail.com','30','feliz');

-- Ingresar dato con valor por defecto(se quita el estado) 
INSERT INTO persona(nombre,correo,edad,cumpleanios) values
('Gaby','gaby3@gmail.com','30','1984-10-10');

SELECT * FROM persona;

CREATE TABLE 
mascota (mascota_id INT AUTO_INCREMENT,
PRIMARY KEY (mascota_id),
nombre VARCHAR(255) NOT NULL,
edad INT NOT NULL, 
fk1_persona INT NOT NULL,
FOREIGN KEY(fk1_persona)REFERENCES persona(persona_id)
ON DELETE CASCADE
ON UPDATE CASCADE
);	

 SELECT * FROM digimons; 
 
 INSERT INTO mascota(nombre,edad,fk1_persona) values
 ('Tyron','21','1');
 INSERT INTO mascota(nombre,edad,fk1_persona) values
 ('Miller','20','2');
 INSERT INTO digimons(nombre,edadP,fk1_persona) values
 ('Denzel','18','5'),
 ('Moly','39','6');
 
 
 



