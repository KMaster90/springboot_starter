create table client
(
    id   serial
        primary key,
    name varchar
);

alter table client
    owner to kmaster;

