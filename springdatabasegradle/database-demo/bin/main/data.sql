/*
create table person 
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255) not null,
	birthDate timestamp,
	primary key(id)
	
);
*/

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());

-- Insert Into person (id, name, location, birthDate) values('10001',  'A', 'Dhaka', sysdate());
--Insert Into person (id, name, location, birthDate) values('10002',  'B', 'Barishal', sysdate());
--Insert Into person (id, name, location, birthDate) values('10003',  'C', 'Cumilla', sysdate());
--Insert Into person (id, name, location, birthDate) values('10004',  'D', 'Dinajpur', sysdate());