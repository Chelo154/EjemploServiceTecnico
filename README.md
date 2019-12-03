# EjemploServiceTecnico
Un pequeño Ejemplo de alta de un Programa de Servicio Técnico, al ser un proyecto simple, las fechas se manejan con String
## Recomendaciones
* Este programa esta hecho en Java con el IDE de Netbeans,por ende para poder trabajr con el es recomendable el ide
* El JDK es 8 (creo)
* Deben tener una BD en Mysql para poder ejecutar el programa, a continuación dejo el script de sql para crear la BD y la tabla

A continuación dejo el Script para crear la tabla y la BD 

```mysql
create database ejemploService;

use ejemploService;

create table Comanda(
	id int primary key auto_increment,
    fecha varchar(10),
    dniCliente int,
    nombreCliente varchar(50),
    total double,
    sbackup bool,
    formateo bool,
    office bool,
    cantidadGB double 
);

```
