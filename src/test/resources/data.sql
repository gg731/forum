create table user
(
    id       bigint identity primary key,
    username varchar(2000),
    email    varchar(2000),
    password varchar(2000)
);

create table user_roles
(
    user_role_id bigint identity primary key,
    userid       int,
    role         varchar(2000)
);

create table posts
(
    id          bigint identity primary key,
    name        varchar(2000),
    description varchar(2000),
    created     TIMESTAMP DEFAULT NOW
);



