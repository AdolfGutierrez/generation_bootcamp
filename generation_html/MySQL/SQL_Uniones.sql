use tienda; 

-- JOINS nos permite combinar datos de diferentes tablas 

-- Inner Join 
-- omite los valores nulos 
select * from tienda.producto;

select 
c.nombre as categoria, 
p.nombre as producto
from producto p -- tabla secundaria
inner join categoria c on c.idCategoria = p.idCategoria ; -- tabla primaria 



---------------------------------- -- 
select * from sakila.address;

/* mostrar las direcciones de cada pais 
address-address / city_id
city-city_id / city / country_id
country-country / country_id
*/
select
country.country_id as clave_de_Pais,
country.country as Pais,
city.city_id as clave_de_Ciudad,
city.city as Ciudad,
address.address as Direccion
from country 
inner join city on city.country_id = country.country_id
inner join address on address.city_id = city.city_id 
order by clave_de_ciudad;

-- LEFT JOIN 
-- no omite les valores nulos 
use tienda;
select 
cliente.nombre as nombre,
factura.idFactura as factura
from cliente 
left join factura on cliente.idCliente=factura.idCliente
order by factura asc;

-- RIGHT JOIN 
select 
cliente.nombre as nombre,
factura.idFactura as factura
from cliente 
right join factura on cliente.idCliente=factura.idCliente
order by factura asc;
