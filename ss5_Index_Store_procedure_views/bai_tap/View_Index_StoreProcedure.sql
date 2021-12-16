create database Product;
use Product;
create table Product1 (
Id int primary key,
productCode int,
productName varchar(45),
productPrice double,
productAmount int ,
productDescription varchar(45),
productStatus varchar(45)
);
insert into Product1
values (1,1,'kem_chuoi', 10000, 10,' ngot',' con_hang'),(2,2,'keo_me',15000,10,'ngot','con_hang'),
(3,3,'muc_gung',20000,10,'ngot','con_hang');
alter table Product1 add index idx_productName(productname);
explain select *from Product1 where productName='kem_chuoi' ;

create index productName
on product1(`kem_chuoi`);