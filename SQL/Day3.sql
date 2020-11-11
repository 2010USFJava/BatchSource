--Single line commment
/*
 * multi line comment
 */

create table pookiemans(
pid integer primary key,
pname varchar(30)
);

insert into pookiemans values (1,'bulbasaur');

select * from pookiemans;

insert into pookiemans (pid) values(2);

update pookiemans
set pname='ivysaur';

update pookiemans 
set pname='bulbasaur'
where pid=1;

insert into pookiemans (pid,pname) values
(3,'venusaur'),
(4,'chramander'),
(5, 'charmeleon');

delete from pookiemans
where pname='chramander';

commit;

delete from pookiemans;
select * from pookiemans;
rollback;

select "Name","ArtistId" 
from "Artist"
where "ArtistId" <50 and "ArtistId" >13;

select count("Country") countbycountry,"Country" 
from "Customer";