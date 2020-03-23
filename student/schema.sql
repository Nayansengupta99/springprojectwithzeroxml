DROP DATABASE   IF     EXISTS students;
CREATE DATABASE IF NOT EXISTS students;
USE students;
CREATE TABLE student(
id int,
name varchar(20),
marks float);