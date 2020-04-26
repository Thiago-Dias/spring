DROP table if exists cliente;

CREATE table cliente (
        id_cliente BIGINT AUTO_INCREMENT NOT NULL,
        nome VARCHAR(255) NULL,
        renda DOUBLE NULL,
        PRIMARY KEY (id_cliente));