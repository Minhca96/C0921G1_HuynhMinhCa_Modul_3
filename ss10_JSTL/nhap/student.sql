create database student1;
use student1;
create table student(
id  int primary key auto_increment,
name varchar(45),
age int
);
insert into student (name,age)
value ('ca',25),('tai',20),('huyen',30),('dat',25),('tien', 32)
