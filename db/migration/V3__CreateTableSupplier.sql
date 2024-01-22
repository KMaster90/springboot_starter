create table supplier
(
    id   serial
        primary key,
    name varchar
);

alter table supplier
    owner to kmaster;

