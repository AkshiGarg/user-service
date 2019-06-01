--liquibase formatted sql

--changeset user:1
CREATE TABLE user (
id INT AUTO_INCREMENT primary key,
firstname varchar(50) not null,
lastname varchar(50) not null,
age int not null,
gender varchar(50) not null,
email varchar(50) not null,
phonenumber varchar(15) not null,
address varchar(100) not null
);