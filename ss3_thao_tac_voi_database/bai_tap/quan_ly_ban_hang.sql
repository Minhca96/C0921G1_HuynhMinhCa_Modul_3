create database ban_hang;
use ban_hang;
create table customer(
cName varchar(45),
cAge varchar(45),
cID int primary key
);
insert into customer
values ('Minh Quan',10,1),('Ngoc Oanh',20,2),('Hong Ha',50,3);
select * from customer;
create table oder(
oID int primary key,
cID int,
foreign key(cID) references customer(cID),
oDate date,
oTutalprice double
);
insert into oder
values(1,1,'2006-3-21',null),(2,2,'2006-3-26',null),(3,1,'2006-3-16',null);
select* from oder;
create table product(
pID int primary key,
pName varchar(45),
pPrice double
);
insert into product
values (1,'May Giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);
create table Oderdetail(
oID int ,
pID int,
oQty int,
 primary key(oID,pId),
 foreign key(oID) references oder(oID),
 foreign key(pID) references product(pID)
);
insert into  Oderdetail
values (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);
-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oder.oID,oder.oDate,oder.oTutalprice from oder;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
