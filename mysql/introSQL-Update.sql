-- actualizar

-- agregar una columna 
ALTER TABLE  mascota ADD COLUMN especie VARCHAR(255) NOT NULL;

-- agregar una columna en una posicion especifica (ordenar las colunmas en la tabla) 
ALTER TABLE mascota ADD COLUMN cumpleanios DATE AFTER edad; 

-- modificar las caracteristicas de una columna 
ALTER TABLE digimons MODIFY especie VARCHAR(255);

-- no se puede cambiar el nombre a una columna 
ALTER TABLE mascota CHANGE COLUMN edad edadP INT NOT NULL; 

-- renombrar una tabla 
ALTER TABLE mascota RENAME digimons;

SELECT * FROM digimons;
SELECT * FROM persona;

-- ACTUALIZAR DATOS DE UNA FILA 
-- error 1175: no se actualiza si no seleccionamos la llave primaria 
UPDATE Digimons SET especie= "Dragon" WHERE nombre='Miller';

-- Forma correcta
UPDATE Digimons SET especie= "Dragon" WHERE mascota_id="1"; 
UPDATE digimons SET especie="Jaeger" WHERE mascota_id="2";
UPDATE digimons SET especie="Kaiju" WHERE mascota_id="11";

