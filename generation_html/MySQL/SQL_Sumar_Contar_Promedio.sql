use sakila;
select * from payment;

-- COUNT() nos permite contar los elemtos o las celdas de una columna 
-- AS nos permite ponerle un alias temporal a la columna 
select count(*) as cantidad_filas from payment where staff_id=2;
select count( customer_id) from payment where staff_id=2; 

-- contar filas de la tabla world.country 
select count(*) from world.country;
select count(distinct customer_id) from payment;

-- SUM() realiza la suma de los valores de una columna 
select sum(amount) as total from payment where staff_id=2;

-- saber cual es el cliente que gasto mas en rentas 
-- GROUP BY agrupa filas que contengan el mismo valor 
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id order by total desc;

-- AVG() nos permite obtener un promedio de cantidades en una columna 
select avg(amount) as promedio from payment where customer_id=248;






