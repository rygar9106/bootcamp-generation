CREATE SCHEMA Generation;

USE Generation;

CREATE TABLE cohorte(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY);
ALTER TABLE cohorte ADD COLUMN nombre VARCHAR(255) NOT NULL;
ALTER TABLE cohorte ADD COLUMN edad INT NOT NULL;

INSERT INTO cohorte(nombre, edad) values
('Pedro',15),
('Ash', 12),
('Patricio',22);

SELECT * FROM cohorte;

SELECT * FROM world.city;

SELECT nombre FROM cohorte;


SELECT Countrycode, Population FROM world.city;

SELECT name AS 'Nombre de los paises' FROM world.city;

UPDATE cohorte SET nombre = 'Juan',
edad = 30
WHERE ID = 4;

DELETE FROM cohorte;

DELETE FROM cohorte where edad;

DELETE FROM cohorte WHERE id = 2;