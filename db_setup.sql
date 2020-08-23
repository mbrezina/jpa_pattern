login as root
CREATE USER  'student'@'localhost'   IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO   'student'@'%'   IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO   'student'@'localhost'   IDENTIFIED BY 'password';

mysql -u student -p

CREATE DATABASE db_example
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_czech_ci;

USE db_example;

drop table user;

CREATE TABLE user
(
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(30),
   email VARCHAR(30)
   );


INSERT INTO user (id, name, email) VALUES (1, "martiik", "ja@seznam.cz");
INSERT INTO user (id, name, email) VALUES (2, "stap", "stap@seznam.cz");
INSERT INTO user (id, name, email) VALUES (3, "vikuna", "vikuna@seznam.cz");
INSERT INTO user (id, name, email) VALUES (4, "milabu", "milabu@seznam.cz");
INSERT INTO user (id, name, email) VALUES (5, "adam", "booriss@seznam.cz");
INSERT INTO user (id, name, email) VALUES (6, "janiik", "janiik@seznam.cz");
