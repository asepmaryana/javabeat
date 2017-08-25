drop table if exists employee;

create table employee
(
	id varchar(64) not null,
	name varchar(64) not null,
	city varchar(50) not null,
	primary key(id)
);