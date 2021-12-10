create database ban_hang;
use ban_hang;
create table customer(
cID int primary key,
cName varchar(45),
cAge varchar(45)
);
select * from customer;
create table oder(
oID int primary key,
cID int,
foreign key(cID) references customer(cID),
oDate date,
oTutalprice double
);
select* from oder;
create table product(
pID int primary key,
pName varchar(45),
pPrice double
);
create table Oderdetail(
oID int ,
pID int,
oQty int,
 primary key(oID,pId),
 foreign key(oID) references oder(oID),
 foreign key(pID) references product(pID)
);
select * from Oderdetail;