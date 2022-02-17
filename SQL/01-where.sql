/*
Where nos permite obtener valores a traves de un campo en especifico
*/

-- Obtiene la informacion de la tabla actor
SELECT * FROM actor;

SELECT actor_id, first_name, last_name FROM actor;

/*
Operadores de comparación
OPERADORES DE COMPARACION:
Igual           =
Distinto        !=
Menor           <
Mayor           >
Menor o igual   <=
Mayor o igual   >=
Entre           between A and B
En              in
Es nulo         is null
No nulo         is not null
Como            like
No es como      not like
*/

-- Selecciona de la tabla actor todos los resultados que tiene penelope en first name
SELECT * FROM actor WHERE first_name = 'Penelope';

-- Selecciona de la tabla actor todos los resultados que no tiene penelope en first name
SELECT * FROM actor WHERE first_name != 'Penelope';

-- Selecciona de la tabla film todos los resultados mayores al film_id 50
SELECT * FROM film WHERE film_id > 50;

-- Selecciona de la tabla film todos los resultados menores al film_id 50
SELECT * FROM film WHERE film_id < 50;

-- Selecciona de la tabla customer todos los resultados con customer_id sea par
SELECT * FROM customer WHERE customer_id % 2 = 0;

-- Selecciona de la tabla film todos los resultados con costo 2.99 y rating PG-13
SELECT * FROM film WHERE rental_rate = 2.99 and rating = 'PG-13';

-- Selecciona de la tabla actor, todos los resulados que first_name termine con E
SELECT * FROM actor WHERE first_name LIKE '%e';

-- Selecciona de la tabla actor, todos los resulados que first_name empiecen con AN
SELECT * FROM actor WHERE first_name LIKE 'an%';

-- Selecciona de la tabla actor, todos los resulados que last_name contengan N
SELECT * FROM actor WHERE first_name LIKE '%n%';

-- Selecciona de la tabla actor, todos los resultados de first_name y last_name que empiecen con B
SELECT * FROM actor WHERE first_name LIKE 'b%' OR last_name LIKE 'b%';

SELECT * FROM actor WHERE first_name LIKE '%k_r%';