SELECT * FROM category, language;

SELECT city_id, city, country FROM city INNER JOIN country ON city.country_id = country.country_id order by city_id ASC;

SELECT * FROM country, city;

-- Seleccionar el nombre del pais, el nombre de la ciudad y la direccion

SELECT country, city, address FROM country
INNER JOIN city ON country.country_id = city.country_id
INNER JOIN address ON city.city_id = address.city_id;

-- Seleccionar el actor, las peliculas en las que ha estado y su descripción

SELECT title, description, concat(first_name, ' ', last_name) as 'Actor' FROM film_text
INNER JOIN film_actor ON film_text.film_id = film_actor.film_id
INNER JOIN actor ON actor.actor_id = film_actor.actor_id;