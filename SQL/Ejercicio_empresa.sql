CREATE SCHEMA empresa;
USE empresa;
CREATE TABLE Worker(EMPLOYEE_ID INT AUTO_INCREMENT PRIMARY KEY, FIRST_NAME VARCHAR(255), LAST_NAME VARCHAR(255), SALARY INT, START_DATE DATE, DEPARTMENT VARCHAR (50));
CREATE TABLE Bonus(EMPLOYEE_REF_ID INT, BONUS_DATE DATE, BONUS_AMOUNT INT);
CREATE TABLE Title(EMPLOYEE_REF_ID INT, JOB_TITLE VARCHAR(50), AFFECTED_FROM INT);

INSERT INTO Worker(FIRST_NAME,LAST_NAME,SALARY,START_DATE,DEPARTMENT) VALUES
('Monika', 'Arora',100000,'2014-02-20','HR'),
('Santiago','Carrillo',80000,'2014-06-11','Admin'),
('Ian','Smith',300000,'2014-02-20','HR'),
('Boyd','Ndonga',500000,'2014-02-20','Admin'),
('Vivek','Bhati',500000,'2014-06-11','Admin'),
('Elise','Guimares',200000,'2014-06-11','Account'),
('Barrack','Obama',75000,'2014-01-20','Account'),
('Vivian','Muyu',90000,'2014-04-11','Admin');

INSERT INTO Bonus VALUES
(1,'2016-02-20',5000),
(2,'2016-06-11',3000),
(3,'2016-02-20',4000),
(1,'2016-02-20',4500),
(2,'2016-06-11',3500);

INSERT INTO Title VALUES
(1,'Manager',5000),
(2,'Executive',3000),
(8,'Executive',4000),
(5,'Manager',4500),
(4,'Ast. Manager',3500),
(7,'Exectuive',4000),
(6,'Lead',4500),
(3,'Lead',3500);
