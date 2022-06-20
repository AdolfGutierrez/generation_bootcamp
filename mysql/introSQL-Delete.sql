-- BORRAR 

SELECT * FROM digimons; 
DELETE FROM digimons WHERE mascota_id=12; 	

-- borrar una columna 
ALTER TABLE  digimons DROP COLUMN cumpleanios; 

-- borrar una tabla 
DROP TABLE digimons; 

-- borrar base de datos
DROP DATABASE familia; 
