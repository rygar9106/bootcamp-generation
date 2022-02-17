/*
Consultas de agrupamiento
Las utilizamos para agrupar resultados que tengan el mismo valor
*/
-- Todo de la tabla inventory agrupado por store_id
SELECT * FROM inventory GROUP BY store_id;

-- Todo de la tabla rental agrupado por customer_id
SELECT * FROM rental GROUP BY customer_id;

-- La cantidad de ciudades con alias "Total de ciudades" por pais, agrupados por pais
SELECT country_id, count(city_id) AS 'Total de Ciudades' FROM city GROUP BY country_id;

SELECT * FROM city WHERE country_id= 6;

SELECT country_id, count(city_id) AS 'Total_de_Ciudades' FROM city GROUP BY country_id HAVING Total_de_Ciudades > 2;

SELECT country_id, count(city_id) AS 'Total_de_Ciudades' FROM city GROUP BY country_id ORDER BY Total_de_Ciudades DESC LIMIT 1;

SELECT * FROM film ORDER BY length DESC LIMIT 1;