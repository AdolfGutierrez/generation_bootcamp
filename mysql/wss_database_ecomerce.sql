-- Creación de la BD, con uso básico de seguridad en BD Recomendaciones OWASP
DROP DATABASE IF EXISTS wss_ecommerce_262;
CREATE DATABASE wss_ecommerce_262;
USE wss_ecommerce_262;

-- Creación de tablas

-- Detalle cliente
CREATE TABLE detalle_cliente(
	id_detalle_cliente int not null auto_increment,
    direccion VARCHAR(255),
    phone varchar(255),
    email varchar(255) not null,
    numero_tarjeta VARCHAR(16) NOT NULL,
    titular_tarjeta VARCHAR(255) NOT NULL,
    fecha_expiracion CHAR(4) NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    PRIMARY KEY (id_Detalle_cliente)
);

-- Clientes
CREATE TABLE cliente (
	id_cliente int not null auto_increment,
    id_detalle_cliente int not null,
    nombre VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) not null,
    contrasena VARCHAR(255) not null,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    primary key (id_cliente),
    foreign key (id_detalle_cliente) references detalle_cliente(id_detalle_cliente)
);

CREATE TABLE categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT,
    nombre_categoria VARCHAR(100) NOT NULL,
    id_padre INT,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    primary key (id_categoria),
    foreign key (id_padre) REFERENCES categoria(id_categoria)
);

-- Create productos
CREATE TABLE producto (
	id_producto INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    codigo CHAR(10) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    id_categoria INT NOT NULL,
    precio BIGINT NOT NULL,
    stock_units INT NOT NULL,
    imagen_frontal VARCHAR(255),
    imagen_lateral VARCHAR(255),
    imagen_exra VARCHAR(255),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    PRIMARY KEY (id_producto),
    foreign key (id_categoria) REFERENCES categoria(id_categoria)
); 

-- Create categoria_producto
CREATE TABLE categoria_producto (
	id_categoria INT NOT NULL,
    id_producto INT NOT NULL,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);
 
 -- Catalogo metodos de pago
CREATE TABLE catalogo_metodo_pago(
	id_metodo_pago INT NOT NULL AUTO_INCREMENT,
    nombre_metodo_pago VARCHAR(30) NOT NULL,
    codigo_metodo_pago CHAR(3) NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    PRIMARY KEY (id_metodo_pago)
);
 
 -- Create pago
 DROP TABLE IF EXISTS fila_compra;
 CREATE TABLE fila_compra (
	id_fila_compra INT NOT NULL AUTO_INCREMENT,
    id_producto INT NOT NULL,
    unidades int NOT NULL,
    total BIGINT NOT NULL,
    mensage_salida VARCHAR(255) NOT NULL,
    nombre_tarjeta VARCHAR(255),
    PRIMARY KEY (id_fila_compra),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
 );

-- Nivel de stock
CREATE TABLE nivel_stock (
	id_stock INT NOT NULL AUTO_INCREMENT,
    id_producto INT NOT NULL,
    stock_security INT NOT NULL,
    stock_maximium INT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    PRIMARY KEY (id_stock),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

-- Create compra
CREATE TABLE compra(
	id_compra int NOT NULL auto_increment,
	id_fila_compra int NOT NULL,
    id_metodo_pago INT NOT NULL,
	unidades int,
	precio BIGINT NOT NULL,
	created_at TIMESTAMP NOT NULL,
	updated_at TIMESTAMP NOT NULL,
	PRIMARY KEY(id_compra),
	FOREIGN KEY(id_fila_compra) REFERENCES fila_compra(id_fila_compra),
	FOREIGN KEY(id_metodo_pago) REFERENCES catalogo_metodo_pago(id_metodo_pago)
 );

-- Create recibo_pago
CREATE TABLE recibo_pago(
	id_recibo int NOT NULL auto_increment,
    id_compra int NOT NULL,
	texto text,
	id_cliente int NOT NULL,
	created_at TIMESTAMP NOT NULL,
    updatesd_at TIMESTAMP NOT NULL,
	PRIMARY KEY (id_recibo),
    FOREIGN KEY (id_compra) REFERENCES compra(id_compra),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
 );


-- INSERTS

INSERT INTO categoria(
	id_categoria, nombre_categoria, id_padre, created_at, updated_at
) VALUES (null, "Recámaras", 1, NOW(), NOW());

SELECT * FROM categoria;

-- Creación de procedimientos almacenados
-- Categorias INSERTS
DROP PROCEDURE IF EXISTS InsertCategories; 
DELIMITER //

CREATE PROCEDURE InsertCategories(
	IN categoryName VARCHAR(255),
    IN categoryContainerID INT
)
BEGIN
	INSERT INTO categoria(
		id_categoria, nombre_categoria, id_padre, created_at, updated_at
		) VALUES (null, categoryName, categoryContainerID, NOW(), NOW());
END //

DELIMITER ;
-- Llamado INSERTS procedure
CALL InsertCategorias("Salas", 2);

-- Categoria SELECT
DROP PROCEDURE IF EXISTS ShowAllCategories; 
DELIMITER //

CREATE PROCEDURE ShowAllCategories()
BEGIN
	SELECT * FROM categoria;
END //

DELIMITER ;

CALL ShowAllCategories();

-- Productos
DROP PROCEDURE IF EXISTS GetAllProducts; 
DELIMITER //

CREATE PROCEDURE GetAllProducts()
BEGIN
	SELECT * FROM producto;
END //

DELIMITER ;
 
CALL GetAllProducts();