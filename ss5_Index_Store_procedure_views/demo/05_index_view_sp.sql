select *
from student
where `name` = 'Mai';

create index idx_student_name
on student(`name`);

select *
from student
where `name` = 'Mai';

-- VIEW
create view v_student
as
select id, `name`, date_of_birth
from student;

select *
from v_student;

create view v_query_all
as
select s.id 'student_id'
		, s.`name` as 'student_name'
        , c.id 'class_id'
        , c.`name` 'class_name'
        , toc.id 'type_id'
        , toc.`name` 'type_name'
        , aj.`account`
        , i.id 'instructor_id'
        , i.`name` 'instructor_name'
from account_james aj
	inner join student s on aj.`account` = s.account_james_account
    inner join class c on s.class_id = c.id
    inner join type_of_class toc on c.type_of_class_id = toc.id
    inner join instructor_teach_class itc on c.id = itc.class_id
    inner join instructor i on i.id = itc.instructor_id
where c.`name` like 'C%';

select *
from v_query_all;

-- SP
-- Duong
delimiter //
create procedure sp_find_student (p_keyword varchar(10))
begin
	select *
    from student
    where `name` like concat('%', p_keyword, '%');
    -- ...
end;
// delimiter ;

call sp_find_student('e');

-- TRIGGER
-- Long 2
delimiter //
create trigger save_account_james	
before insert
on student for each row
begin
	insert into account_james
    values (lcase(new.email), '12345678');
    
    if new.account_james_account is null then
		set new.account_james_account = new.email;
    end if;
end;
// delimiter ;

insert into student (`name`, date_of_birth, email)
values ('Nguyễn Văn An', '2000-12-15', 'annguyen@gmail.com');

-- FUNCTIONS
-- Duong
delimiter //
create function sum2num (num1 int, num2 int)
returns int
deterministic
begin
	declare total int;
    set total = num1 + num2;
	return total;
end;
// delimiter ;

select sum2num(6, 9) 'abcxyz';




