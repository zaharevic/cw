create schema animals;
use animals;

create table dog(
	id int primary key auto_increment,
    a_name char(30),
    commands text, 
    birthday date
); 

create table cat(
	id int primary key auto_increment,
    a_name char(30),
    commands text, 
    birthday date
); 

create table hamster(
	id int primary key auto_increment,
    a_name char(30),
    commands text, 
    birthday date
); 

create table horse(
	id int primary key auto_increment,
    a_name char(30),
    commands text, 
    birthday date
); 

create table camel(
	id int primary key auto_increment,
    a_name char(30),
    commands text, 
    birthday date
); 

create table donkey(
	id int primary key auto_increment,
    a_name char(30),
    commands text, 
    birthday date
); 

insert into dog (a_name, commands, birthday) values
	('dog1', 'gav', '2020-01-12'),
    ('dog2', 'gav', '2023-03-06'),
    ('dog3', 'gav', '2021-04-11'),
    ('dog4', 'gav', '2022-11-01'),
    ('dog5', 'gav', '2017-08-03');
    
insert into cat (a_name, commands, birthday) values
	('cat1', 'meow', '2018-02-01'),
    ('cat2', 'meow', '2023-06-06'),
    ('cat3', 'meow', '2022-05-12'),
    ('cat4', 'meow', '2023-01-04'),
    ('cat5', 'meow', '2015-03-02');
    
insert into hamster (a_name, commands, birthday) values
	('hamster1', 'pip', '2021-05-11'),
    ('hamster2', 'pip', '2020-07-12'),
    ('hamster3', 'pip', '2023-12-01'),
    ('hamster4', 'pip', '2015-10-06'),
    ('hamster5', 'pip', '2019-03-02');
    
insert into horse (a_name, commands, birthday) values
	('horse1', 'neigh', '2017-05-01'),
    ('horse2', 'neigh', '2019-02-11'),
    ('horse3', 'neigh', '2014-03-12'),
    ('horse4', 'neigh', '2015-01-11'),
    ('horse5', 'neigh', '2023-01-11');
    
insert into camel (a_name, commands, birthday) values
	('camel1', 'ooow', '2022-05-11'),
    ('camel2', 'ooow', '2017-05-11'),
    ('camel3', 'ooow', '2020-03-10'),
    ('camel4', 'ooow', '2019-11-03'),
    ('camel5', 'ooow', '2017-06-09');
    
insert into donkey (a_name, commands, birthday) values
	('donkey1', 'ihaw', '2020-01-12'),
    ('donkey2', 'ihaw', '2023-03-06'),
    ('donkey3', 'ihaw', '2021-04-11'),
    ('donkey4', 'ihaw', '2022-11-01'),
    ('donkey5', 'ihaw', '2017-08-03');
    
truncate camel;

insert into horse (a_name, commands, birthday)
select a_name, commands, birthday
from donkey;

drop table donkey;

rename table horse to horse_and_donkey;

create table young_animal(
	id int primary key auto_increment,
    a_name char(30),
    commands text, 
    birthday date,
    age text
);

DELIMITER //
create function age(b_date date) returns text
deterministic
begin
	declare curr_date date;
    declare age_years int;
    declare age_months int;
    
    set curr_date = curdate();
    set age_years = year(curr_date) - year(b_date);
    set age_months = month(curr_date) - month(b_date);
    
    if day(curr_date) < day(b_date) then
		set age_months = age_months - 1;
	end if;
    
    if age_months < 0 then
		set age_years = age_years - 1;
        set age_months = age_months + 12;
	end if;
    
    return concat(age_years, ' years ', age_months, 'months');
end //
DELIMITER ;

insert into young_animal(a_name, commands, birthday, age)
select a_name, commands, birthday, age(birthday)
from dog
where timestampdiff(year, birthday, curdate()) between 1 and 2
union all
select a_name, commands, birthday, age(birthday)
from cat
where timestampdiff(year, birthday, curdate()) between 1 and 2
union all
select a_name, commands, birthday, age(birthday)
from hamster
where timestampdiff(year, birthday, curdate()) between 1 and 2
union all
select a_name, commands, birthday, age(birthday)
from horse_and_donkey
where timestampdiff(year, birthday, curdate()) between 1 and 2;

set SQL_SAFE_UPDATES = 0;

delete from dog
where timestampdiff(year, birthday, curdate()) between 1 and 2;
delete from cat
where timestampdiff(year, birthday, curdate()) between 1 and 2;
delete from hamster
where timestampdiff(year, birthday, curdate()) between 1 and 2;
delete from horse_and_donkey
where timestampdiff(year, birthday, curdate()) between 1 and 2;

select * from young_animal