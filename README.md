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
![Image alt](https://github.com/gg731/forum/blob/master/screenshots/login.png)

Страница регистрации:
![Image alt](https://github.com/gg731/forum/blob/master/screenshots/reg.png)

Просмотр постов:
![Image alt](https://github.com/gg731/forum/blob/master/screenshots/posts.png)

Создание поста:
![Image alt](https://github.com/gg731/forum/blob/master/screenshots/new_post.png)



Start
 > mvn spring-boot:run
