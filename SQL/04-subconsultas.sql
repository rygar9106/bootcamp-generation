-- Selecciona todas las peliculas que tienen la categoria de drama
SELECT * FROM film_category WHERE category_id = 7;

-- Obtener los datos de las peliculas de una categoria
SELECT * FROM film WHERE film_id IN (SELECT film_id FROM film_category WHERE category_id = 7);

-- Obtener todas las películas en donde haya participado un actor
SELECT film_id FROM film_actor WHERE actor_id = 13;
SELECT * FROM film WHERE film_id IN (SELECT film_id FROM film_actor WHERE actor_id = 13);

-- Between nos permite seleccionar un rango de valores
SELECT * FROM actor WHERE actor_id BETWEEN 16 AND 35;
-- Conseguir peliculas por nombre de actor
SELECT * FROM film WHERE film_id = (SELECT film_id FROM film_actor WHERE actor_id IN (SELECT actor_id FROM actor WHERE first_name = 'RITA' AND last_name = 'REYNOLDS'));
