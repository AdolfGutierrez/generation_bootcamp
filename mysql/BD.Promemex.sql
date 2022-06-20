-- Creación de la BD, con uso básico de seguridad en BD Recomendaciones OWASP
DROP DATABASE IF EXISTS wss_ecommerce_262;
CREATE DATABASE wss_ecommerce_262;
USE wss_ecommerce_262;

-- Creación de tablas

-- Número de compra
CREATE TABLE numero_compra (
	id_num BIGINT not null auto_increment,
    pago BIGINT NOT NULL,
    primary key (id_num)
);

-- Detalle cliente
CREATE TABLE detalle_cliente(
	id_detalle_cliente int not null auto_increment,
    direccion VARCHAR(255),
    phone varchar(255),
    email varchar(255) not null, 
    PRIMARY KEY (id_Detalle_cliente)
);

-- Clientes
CREATE TABLE cliente (
	id_cliente int not null auto_increment,
    id_detalle_cliente int not null,
    nombre VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) not null,
    contrasena VARCHAR(255) not null,
    created_at DATETIME,
    updated_at DATETIME,
    primary key (id_cliente),
    foreign key (id_detalle_cliente) references detalle_cliente(id_detalle_cliente)
);

CREATE TABLE categoria (
	id_categoria INT NOT NULL AUTO_INCREMENT,
    nombre_categoria VARCHAR(60) NOT NULL,
    id_padre INT,
    created_at DATETIME,
    updated_at DATETIME,
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
    created_at datetime,
    updated_at datetime,
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

-- Create recibo_pago
CREATE TABLE recibo_pago(
	id_recibo int NOT NULL auto_increment,
	texto text,
	cliente int NOT NULL,
	created_at DATETIME,
	PRIMARY KEY (id_recibo)
 );
 
 -- Catalogo metodos de pago
CREATE TABLE catalogo_metodo_pago(
	id_metodo_pago INT NOT NULL AUTO_INCREMENT,
    nombre_metodo_pago VARCHAR(30) not null,
    codigo_metodo_pago ENUM('EFE', 'CRE', 'DEV', 'TRA') NOT NULL,
    created_at DATETIME,
    updated_at DATETIME,
    PRIMARY KEY (id_metodo_pago)
);
 
 -- Create pago
 CREATE TABLE pago (
	id_pago INT NOT NULL AUTO_INCREMENT,
    id_recibo INT NOT NULL,
    id_metodo_pago INT NOT NULL,
    total BIGINT NOT NULL,
    mensage_salida VARCHAR(255) NOT NULL,
    nombre_tarjeta VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_pago),
    FOREIGN KEY (id_recibo) REFERENCES recibo_pago(id_recibo),
    FOREIGN KEY (id_metodo_pago) REFERENCES catalogo_metodo_pago(id_metodo_pago)
 );

-- Nivel de stock
CREATE TABLE nivel_stock (
	id_stock INT NOT NULL AUTO_INCREMENT,
    id_producto INT NOT NULL,
    stock_security INT NOT NULL,
    stock_maximium INT NOT NULL,
    created_at DATETIME,
    updated_at DATETIME,
    PRIMARY KEY (id_stock),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

-- Create compra
CREATE TABLE compra(
	id_compra int NOT NULL auto_increment,
	id_pagos int NOT NULL,
	id_producto int NOT NULL,
	unidades int,
	precio BIGINT NOT NULL,
	created_at DATETIME NOT NULL,
	updated_at DATETIME NOT NULL,
	PRIMARY KEY(id_compra),
	FOREIGN KEY(id_pagos) REFERENCES pago(id_pago),
	FOREIGN KEY(id_producto) REFERENCES producto(id_producto)
 );