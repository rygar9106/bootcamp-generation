CREATE SCHEMA tienda;

-- CREATE DATABASE nombre;

USE tienda;

/*Comentario
Que usa lo mutilinea
*/

DROP SCHEMA nombre;

CREATE TABLE productos(id int not null auto_increment, primary key(id));

ALTER TABLE productos ADD COLUMN nombre varchar(120) not null;

ALTER TABLE productos ADD COLUMN precio int not null after id;

ALTER TABLE productos RENAME inventario;

SHOW TABLES;

CREATE TABLE productos (id INT NOT NULL AUTO_INCREMENT, PRIMARY KEY(id));

ALTER TABLE productos ADD COLUMN nombre VARCHAR(255) NOT NULL;

ALTER TABLE productos CHANGE COLUMN nombre precio INT NOT NULL;

ALTER TABLE productos DROP COLUMN precio;