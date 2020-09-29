# Forum
[![Build Status](https://travis-ci.com/gg731/forum.svg?branch=master)](https://travis-ci.com/gg731/forum)
[![codecov](https://codecov.io/gh/gg731/forum/branch/master/graph/badge.svg)](https://codecov.io/gh/gg731/forum)
[![GitHub issues](https://img.shields.io/github/issues/gg731/forum)](https://github.com/gg731/forum/issues)


Веб приложение, созданное в учебных целях.

Функционал:
- добавление постов
- редактирование постов
- просмотр страницы с созданными постами
- регистрация в приложение
- аутентификация в приложении созданная с помощью Spring Security

Технологии используемые в проекте:
- Spring Boot
- Spring Security
- Spring Data
- Hibernate 
- БД MySQL
- библиотека тегов JSTL
- Непрерывная интеграция Travis, тесты Codecov

Страница аутентификации:
![alt text](screenshot/login.png)
Страница регистрации:
![alt text](screenshot/reg.png)
Просмотр постов:
![alt text](screenshot/posts.png)
Создание поста:
![alt text](screenshot/new_post.png)



Start
 > mvn spring-boot:run
