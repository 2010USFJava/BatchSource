--Nested Queries- Select in a select
select * from "Album" where "AlbumId" in
(select "AlbumId" from "Track" where "Composer" ='AC/DC');

/*Joins!
*/
create table student (
s_id integer,
s_name varchar(20),
sch_id integer
);


create table school(
sch_id integer,
sch_name varchar(20)
);
INSERT INTO SCHOOL VALUES(1,'USF');
INSERT INTO SCHOOL VALUES(2,'FSU');
INSERT INTO SCHOOL VALUES(3,'UA');
INSERT INTO SCHOOL VALUES(4,'UGA');
INSERT INTO SCHOOL VALUES(5,'LSU');
INSERT INTO SCHOOL VALUES(6,'AU');

INSERT INTO STUDENT VALUES(1, 'Matt',3);
INSERT INTO STUDENT VALUES(2, 'Trevor',5);
INSERT INTO STUDENT VALUES(3, 'Gavin',1);
INSERT INTO STUDENT VALUES(4, 'Kirby',5);
INSERT INTO STUDENT VALUES(5, 'Bobby',4);
INSERT INTO STUDENT VALUES(6, 'Joe',2);
INSERT INTO STUDENT VALUES(7, 'Leslie',1);
INSERT INTO STUDENT VALUES(8, 'Roger Moore',3);
INSERT INTO STUDENT VALUES(9, 'Brad',2);
INSERT INTO STUDENT VALUES(10, 'Darth Vader',5);

select * from school;

select * from student;
--Inner
select * from student inner join school
on student.sch_id=school.sch_id;

--Right Join
select * from school right join student
on school.sch_id=student.sch_id;
--Left
select * from school left join student
on school.sch_id=student.sch_id;
--Outer Join - no "outer" keyword
select * from student full join school
on student.sch_id=school.sch_id;

--Self Join
create table student2(
id integer,
name varchar(20),
lab_partner integer
);

INSERT INTO STUDENT2 VALUES(1, 'MATT',6);
INSERT INTO STUDENT2 VALUES(2, 'BEN',5);
INSERT INTO STUDENT2 VALUES(3, 'REN',4);
INSERT INTO STUDENT2 VALUES(4, 'HANN',3);
INSERT INTO STUDENT2 VALUES(5, 'KEN',2);
INSERT INTO STUDENT2 VALUES(6, 'LEVI',1);

select *from student2;

select a.name as student, b.name as lab_partner
from student2 a join student2 b
on a.lab_partner =b.id;
--Set operations
--Union ALL and Union
select "FirstName", "LastName" from "Employee" -- <--notice no ; here!!
union all
select "FirstName", "LastName" from "Customer";

select "FirstName", "LastName" from "Employee"
union
select "LastName", "FirstName" from "Customer"; -- Same # of columns! takes column name from 1st query

--Intersect and Intersect ALL
select "City" from "Employee"
intersect
select "City" from "Customer";

select "Country" from "Employee"
intersect all
select "Country" from "Customer";

--Except and Except ALL
select "name" from "student2"
except
select "s_name" from "student";

--Sequence
create sequence mySeq
increment by -13
start with 1337
minvalue 975
maxvalue 4000;

select setval('mySeq',1977);
select nextval('mySeq');

insert into student values(nextval('mySeq'),'Morgen',1),(nextval('mySeq'),'Kimi',5);
select * from student;

--view
create view my_view
 as
 select "Artist"."Name", "Album"."Title"
 from "Album" inner join "Artist"
 on "Album"."ArtistId"= "Artist"."ArtistId";

select * from my_view;

select * from my_view
where "Name" like 'T%' or "Name" like 'B%';

create view gaby
as
select * from my_view
where "Name" like 'T%' or "Name" like 'B%';

select * from gaby;

--Cursors -Result Set saved to a variable
--Lots of clauses, lots of potential
BEGIN;
DECLARE test_cur CURSOR WITH HOLD FOR SELECT * FROM "Employee" ORDER BY "EmployeeId";
COMMIT;


fetch 1 from test_cur;-- gets first row (notice id)
fetch 4 from test_cur;-- gets the NEXT 4 rows (id started at 2)
fetch 2 from test_cur; --when there are no more rows, you dont get anything!
--Functions
/*out parameter define coulumn names and types
 * in parameters are used by function can can be referenced by $[index number]
 * $$ acts as a delimiter to separate logic
 * LANGUAGE specifys logic language
 */

CREATE or replace FUNCTION dup(out f1 int, out f2 text,in int)
    AS  $$ 
    SELECT $1, CAST($1 AS text) || ' is text' $$
    LANGUAGE SQL;

SELECT * FROM dup(93);

CREATE or replace FUNCTION dup2(out f1 text, out f2 int,in int, in text)
    AS $$ 
    SELECT $2,$1;$$
    LANGUAGE SQL;
    
  SELECT * FROM dup2(42,'roll tide');
   
   CREATE or replace FUNCTION dup3(out f1 text, out f2 int,in int, in text)
    AS $$ 
    select $2 ||'woo', $1+1;$$
    LANGUAGE SQL;
   
   SELECT * FROM dup3(42,'roll tide');
   
  CREATE TYPE dup4_result AS (f1 text, f2 int);
  
     CREATE or replace FUNCTION dup4(in int, in text)
    returns dup4_result 
   AS $$ 
    select $2 ||'woo', $1+1;$$
    LANGUAGE SQL;
   
    SELECT * FROM dup4(42,'roll tide');
    
   create or replace function employeeCount()
   returns integer as $$
   declare
   				total integer;
begin
	select count("EmployeeId") into total from "Employee";
		return total;
end;
$$ language plpgsql;

select employeeCount();

select * from dup(employeeCount());

SELECT * FROM dup3(employeeCount(),' roll tide');

--Triggers
create sequence emp_id_seq
start 9;

create or replace function emp_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."EmployeeId" = (select nextval('emp_id_seq'));
	end if;
	return new;
end;
$$ language plpgsql;
--Before trigger
create trigger employee_insert
before insert on "Employee"
for each row
execute function emp_insert();

insert into "Employee"("EmployeeId","FirstName","LastName")
values(-43,'matt','k');

delete from "Employee" where "LastName" = 'k';

insert into "Employee"("FirstName","LastName")
values('matt','k');
--After Trigger
create sequence cus_id_seq
start 65;

create or replace function cus_insert()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."LastName" = 'Smith';
	end if; 
	return new;
end;
$$ language plpgsql;

create trigger customer_insert
after insert on "Customer"
for each row
execute function cus_insert();

insert into "Customer" ("CustomerId","FirstName" ,"LastName","Email")
values (88,'Jim','bob','a@a');

insert into "Customer" ("CustomerId" , "FirstName" ,"LastName" , "Email" )
values (92,'tim','bob','a@s');

insert into "Customer" ("CustomerId" , "FirstName" , "LastName" , "Email" )
values (87,'sam', 'bob', 'a@a');


insert into "Customer" ("CustomerId" ,"FirstName" , "LastName","Email" ) 
values(88,'jim','bob','a@a');

insert into "Customer" ("CustomerId","FirstName" , "LastName","Email" ) 
values(93,'tim','bob','a@a');

select now();



create or replace function breakthis()
returns trigger as $$
begin
	if(TG_OP = 'INSERT') then
	new."LastName" = 'Smith';
	end if; 
	return new;
end;
$$ language sql;

  create or replace function breakme()
   returns integer as $$
   declare
   				total integer;
begin
	select count("EmployeeId") into total from "Employee";
		return total;
end;
$$ language plpgsql;

 CREATE or replace FUNCTION dup5(out f1 text, out f2 int,in int, in text)
    AS $$ 
    select $2 ||'woo', $1+1;$$
    LANGUAGE sql;