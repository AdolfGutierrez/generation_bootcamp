-- leer 

-- muestra los datos que tenemos
SHOW DATABASES;

-- seleccionar la base de datos a usar
USE sakila;

-- leer los datos de una tabla
SELECT * FROM actor;
SELECT * FROM city;

-- leer partes de una tabla
SELECT city_id, city FROM city;

-- limitar la cantidad de datos 
SELECT * FROM  actor LIMIT 10; 

-- ordenar los datos dependiendo de una columna de forma ascendente 
SELECT * FROM city  ORDER BY city ASC LIMIT 10; 

-- ordenar los datos dependiendo de una columna de forma descendente 
SELECT * FROM city ORDER BY country_id DESC LIMIT 10;

/* operadores de comparacion 
 Igual  = 
 !=
 <
 >
 =>
 =<
 LIKE
*/
SELECT * FROM city WHERE city = "Cuman";
SELECT * FROM actor WHERE first_name = "Penelope"; 
SELECT * FROM actor WHERE first_name !="Penelope"; 
SELECT * FROM actor WHERE actor_id >50;
SELECT * FROM actor WHERE actor_id <100;
SELECT * FROM actor WHERE actor_id >=50;
SELECT * FROM actor WHERE actor_id <=100;
SELECT * FROM actor WHERE first_name LIKE  "Penelope"; 

-- se utiliza para realizar busquedas
-- selecciona de la tabla a todas las personas que TERMINEN sus first_name con "an"
SELECT * FROM actor WHERE first_name LIKE '%an';

-- selecciona de la tabla a todas las personas que EMPIECEN sus first_name con "an"
SELECT * FROM actor WHERE first_name LIKE 'an%';

-- selecciona de la tabla a todas las personas que CONTENGAN en sus frst_name una "n"
SELECT * FROM actor WHERE first_name LIKE '%nn%';

-- selecciona un patron 
SELECT * FROM actor WHERE first_name LIKE '%a__e%';

-- uniendo todo
SELECT * FROM actor WHERE first_name LIKE '%nn%' ORDER BY last_name ASC LIMIT 5;

/* OPERADORES LOGICOS 

AND     debe cumplir ambas condiciones 
OR      debe cumplir una de ellas 

*/

SELECT * FROM actor WHERE actor_id >50 AND first_name LIKE '%n%';
SELECT * FROM actor WHERE first_name LIKE '%n%' OR first_name LIKE '%M%'; 