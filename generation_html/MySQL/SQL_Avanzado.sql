USE world;
SELECT 5+5;
-----------------------
-- selecciona la tabal country y la muestra
SELECT * FROM country;

-- selecciona el nombre de la columna population de country 
SELECT Name, population FROM country ORDER BY population DESC;

-- selecciona de la columna country el nombre mexico 
SELECT * FROM country WHERE name ="mexico";
SELECT * FROM country WHERE population >50000000 AND population < 70000000 ORDER BY population;

-- between: regresa datos dentro de un rango que nosotros especifiquemos 
SELECT * FROM  country  WHERE population not BETWEEN 50000000 and 70000000 order by population;

-- seleccionar de la tabla country los continentes "asia","north america" y "oceania" o oredenarlos de manera alfabetica
select * from country where continent= 'asia' or continent= 'north america' or continent="oceania" order by continent;

-- OR nos permite especifiar condiciones de manera explicita 
select * from country where continent= 'asia' or continent= 'north america' or continent="oceania" order by continent;
-- IN nos perminte especificar condiciones de manera factorizada a OR
select * from country where continent IN ('asia', 'north america', 'oceania') order by continent;

SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP FROM country WHERE continent IN ('North America', 'Asia', 'Oceania') OR region IN ('Caribean', 'Central America') ORDER BY GNP ASC;

-- like buscar un patron especifico
-- '_' especificamos un solo caracter
-- '%' busque cualquier cantidad de caracteres
select * from country where `Name` like '%and';
select * from country where `Name` like '%e__a';


