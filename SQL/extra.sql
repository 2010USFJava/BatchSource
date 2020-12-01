


create schema if not exists kittenland  authorization kitten;

select * from public."Customer";



create schema if not exists pokemonland authorization kitten;

create table pokemonland.testme(
mycol integer  primary key);

drop table testme;
insert into testme values(1);
select * from testme;

select * from "Employee";

create table "Employee"(
mycol integer  primary key);

select * from kittenland."Employee";
--switch schema
set search_path to kittenland;

