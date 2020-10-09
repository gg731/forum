INSERT INTO posts(name, description, created)
VALUES ('О чем этот форум?', 'desc', CURRENT_TIMESTAMP);
INSERT INTO posts(name, description, created)
VALUES ('Правила форума', 'desc', CURRENT_TIMESTAMP);

INSERT INTO user(id, username, email, password)
VALUES ('1', 'qwe', 'qwe', '$2a$10$BcrSBvONbJMcdrhc3KoKDuBuI4cvGOJKtOjtzY/UoWZcQ1I5wgDla');

insert into user_roles(userid, role)
values ('1', 'ROLE_USER');
