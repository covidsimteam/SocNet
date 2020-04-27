-- spring boot will auto create schema from sql script on deploy if ddl-auto is set to create-drop

create schema covidb;

alter schema covidb owner to sample;

create table person
(
    id serial not null
        constraint person_pk
            primary key,
    first_name varchar(255),
    last_name varchar(255),
    address varchar(1000),
    primary_id_type varchar(100),
    primary_id_number varchar(100),
    contact_tracing_id varchar(255)
);

alter table person owner to sample;



