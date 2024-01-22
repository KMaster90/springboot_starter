create table role
(
    id   serial
        primary key,
    name varchar
);

alter table role
    owner to kmaster;

