CREATE DATABASE IF NOT EXISTS cançons;
USE cançons;

CREATE table if not EXISTS cançons(
id MEDIUMINT NOT NULL AUTO_INCREMENT Primary KEY,
nom varchar(50) not null,
artista varchar(50) not null,
duracion varchar(50),
anyo INT not null
);

-- Insertar la primera canción
INSERT INTO cançons (nom, artista, duracion, anyo) VALUES ('Keonda', 'Saiko', '3:45', 2020);

-- Insertar la segunda canción
INSERT INTO cançons (nom, artista, duracion, anyo) VALUES ('Polaris', 'Saiko', '4:10', 2021);

-- Insertar la tercera canción
INSERT INTO cançons (nom, artista, duracion, anyo) VALUES ('Talking Shit', 'Glosito', '2:55', 2021);
