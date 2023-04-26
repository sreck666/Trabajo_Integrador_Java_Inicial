--CREATE DATABASE Trabajo_Practico;

USE Trabajo_Practico;

-- DDL - Definición de datos
-- CREATE, ALTER y DROP

-- creacion de tablas
--CREATE TABLE Pronosticos(
--	id INT(11) NOT NULL AUTO_INCREMENT,
---	nombre VARCHAR(45),
--    equipo1 VARCHAR(45),
--    gana1 BOOLEAN,
--    empate BOOLEAN,
--    gana2 BOOLEAN,
--    equipo2 VARCHAR(45),
--    PRIMARY KEY (id)
--);
--

-- INSERT carga de información
INSERT INTO Pronosticos(nombre, equipo1, gana1, empate, gana2, equipo2)
VALUES ("Juan","Qatar",0,1,0,"Ecuador");
INSERT INTO Pronosticos(nombre, equipo1, gana1, empate, gana2, equipo2)
VALUES ("Juan","Senegal",1,0,0,"Paises Bajos");
INSERT INTO Pronosticos(nombre, equipo1, gana1, empate, gana2, equipo2)
VALUES ("Juan","Paises Bajos",1,0,0,"Ecuador");
INSERT INTO Pronosticos(nombre, equipo1, gana1, empate, gana2, equipo2)
VALUES ("Juan","Ecuador",0,0,1,"Qatar");
INSERT INTO Pronosticos(nombre, equipo1, gana1, empate, gana2, equipo2)
VALUES ("Juan","Paises Bajos",0,0,1,"Qatar");
