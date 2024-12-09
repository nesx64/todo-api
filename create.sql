drop database if exists todo;

create database todo;

use todo;

create table task (
    id int primary key not null auto_increment,
    title varchar(255) not null unique,
    completed tinyint not null default 0
);
