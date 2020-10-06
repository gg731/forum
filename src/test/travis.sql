create table if not exists posts (
  id serial primary key,
  name varchar(2000),
  description text,
  created timestamp not null default now()
);

INSERT INTO posts(`name`) VALUES ('О чем этот форум?');
