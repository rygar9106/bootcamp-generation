CREATE SCHEMA tienda_abarrotes;
USE tienda_abarrotes;

CREATE TABLE productos(id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(255) NOT NULL, precio SMALLINT UNSIGNED NOT NULL, existencia TINYINT UNSIGNED NOT NULL, marca VARCHAR(255), primary key(id));
CREATE TABLE clientes(id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(255) NOT NULL, direccion VARCHAR(255), telefono VARCHAR(20), ultimo_pedido TEXT, primary key(id));
CREATE TABLE provedores(id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(255) NOT NULL, marca VARCHAR(255), ultimo_pago TINYINT UNSIGNED,ultima_visita DATE, primary key(id));