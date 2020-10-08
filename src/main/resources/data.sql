create table if not exists user
(
    id       bigint primary key,
    username varchar(2000),
    email    varchar(2000),
    password varchar(2000)
);

create table if not exists user_roles
(
    user_role_id bigint primary key,
    userid       int,
    role         varchar(2000)
);

INSERT INTO user(id, username, email, password)
VALUES ('1', 'qwe', 'qwe', '$2a$10$BcrSBvONbJMcdrhc3KoKDuBuI4cvGOJKtOjtzY/UoWZcQ1I5wgDla');

insert into user_roles(userid, role)
values ('1', 'ROLE_USER');


create table if not exists posts
(
    id          bigint primary key,
    name        varchar(2000),
    description varchar(2000),
    created     TIMESTAMP DEFAULT NOW
);

INSERT INTO posts(name, description, created)
VALUES ('О чем этот форум?', 'desc', CURRENT_TIMESTAMP);
