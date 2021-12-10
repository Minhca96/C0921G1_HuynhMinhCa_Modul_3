create database student;
use student;
create table student(
id int primary key,
`name` varchar(50),
age int,
country varchar(50)
);
alter table student
add mail varchar(50);
insert into student
values (1,'ca',12,'quang nam','cagmail'),(2,'long',13,'ca mau','longmao');
update student 
set mail= 'huynhmihca191@gmail.com'
where id=1;

update student 
set mail =' trankylong123@gmail.com'
where id=2;