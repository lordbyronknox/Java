/*
MySQL database

To run this script in MySQL, start the MySQL Command Line Client from the Start
menu and then use a source command that names the script, as in this example:
mysql> source c:\data\create.sql   (different path for my 'create.sql' file)



drop database if exists movies;                 //deletes database if it exists
                                                  Its common to start a script with this when creating a DB.
create database movies;                         //creates a database named 'movies'.

use movies;                                     //switches to the specified DB ('movies' in this case)

create table movie (                            //creates a table with specified columns, and their data type.
id int not null auto_increment,                   'auto-increment' generates an id, incrementing it every time
title varchar(50),                                 a new row is added.
year int, price decimal(8,2),                      Java doesnt have a 'decimal' data type so it converts to double.
primary key(id)                                    The id column is set as the primary key. (unique value for each row).
);

insert into movie (title, year, price)          //insert statement adds rows, first specifying the columns
values ("It's a Wonderful Life", 1946, 14.95);    then the values for those columns.
insert into movie (title, year, price)
values ("Young Frankenstein", 1974, 16.95);
insert into movie (title, year, price)
values ("Star Wars", 1977, 17.95);
insert into movie (title, year, price)
values ("The Princess Bride", 1987, 16.95);
insert into movie (title, year, price)
values ("Glory", 1989, 14.95);
insert into movie (title, year, price)
values("The Game",1997,14.95);
insert into movie (title, year, price)
values("Shakespeare in Love",1998,19.95);
insert into movie (title, year, price)
values("Zombieland",2009,18.95);
insert into movie (title, year, price)
values("The King's Speech",2010,17.85);
insert into movie (title, year, price)
values("Star Trek Into Darkness",2013,19.95);




NOTE: When you run a query against a sql table/s a result set of rows and columns is returned.
      (So the result set itself is a table)
      When you query a table from a java program the result set is returned in an object
      created from theResultSet class.
      This class has methods that let you extract the data from each column of each row.

To run a query in mysql commandline client:
eg.
        mysql> select title, year from movie order by year;
Or:
        select * from movie;

where & order by clause:
eg 1:        select * from movie where year <= 1980 order by year;
eg 2:        select * from movie where year < 1970 or year > 1979;

Singleton selection: (retrieve info from one specific row by mentioning the primary key column)
eg:
    select title from movie where id = 3;

like & Wildcards:
eg.
    select * from movie where title like "%princess%";

column functions: (sum(), avg(), min(), max(), count(), countDistinct())
eg. (return the number of rows in the table, and the oldest year)
    select count(*), min(year) from movie;

selecting data from more than one table:
eg.
    select * from movie, friend where movie.id = friend.movieid;
OR  select * from movie, friend where movie.id = friend.movieid and lastname = "Haskell";

eliminate duplicate using 'distinct':
eg.
    select distinct lastname, firstname from friend;


UPDATE and DELETE rows:
delete from <table-name> where <condition>;
eg.
    delete from movie where id = 2;
OR, (delete all rows by leaving out the condition):
    delete from movie;

update <table-name> set <expression> where <condition>;
eg.
    update movie set price = 18.95 where id = 8;
Update multiple columns by seperating the expressions with a comma:
eg.
    update friend set lastname = "Bob", firstname = "Billy" where lastname = "Haskell";


CALCULATIONS
update movie set price = price * 1.1;


 */
package Page830.CreatingASQLDatabase;

/**
 *
 * @author byron
 */
public class SQLscript {
    
}
