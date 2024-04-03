------------2024-04-03-------------

create database dihdb;
create user dihUser@'%' identified by 'dih';
grant all privileges on dihdb.* to dihUser@'%' with grant option;
flush privileges;


