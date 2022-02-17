/*
MAX nos da el valor maximo 
MIN nos da el valor minimo 
AVG obtiene un promedio 
SUM suma los valores de una columna 
*/ 

SELECT MAX(length) FROM film; 

SELECT MAX(RENTAL_RATE) from film;  

SELECT MIN(length) FROM film; 

SELECT AVG(length) FROM film; 

SELECT SUM(replacement_cost) FROM film;  
