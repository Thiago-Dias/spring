DROP table if exists pokemon;

CREATE table pokemon (
        id_pokemon BIGINT AUTO_INCREMENT NOT NULL,
        nome VARCHAR(255) NULL,
        tipo VARCHAR(255) NULL,
        habilidade VARCHAR(255) NULL,
        natureza VARCHAR(255) NULL,
        altura DOUBLE NULL,
        peso DOUBLE NULL,
        PRIMARY KEY (id_pokemon));