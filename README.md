# Проект Сервиса по выдаче ипотечных кредитов
Проект был сделан в рамках курса "Java для тестировщиков"

## Используемые технологии

  - Jar 8.x
  - Gradle
  - Spring 
  - MySql // h2database
```
Вы можете скопировать базу данных для тестовой проверки сервиса с помощью файлов 
*.sql в папке "sqlDunp" для работы с базой данных MySql
```
  - JPA 
  
### Описание проекта
Данный проект может принимать заяки и обрабатывать их автоматически.
В ответ на заявку Вы получите решение, принятое по Вашей заявки.

Также Вы можете получить все успешные или все отклоненные заявки.

Заявка проверяется по 3 параметрам:
1. Есть ли у клиента финансовая возможность выплачивать кредит;
2. Является ли клиент террористом;
3. Проверка кредитной истории клиента; 

### Описание работы с проектом
Данный проект поддерживает возможность отправки запроса с заявкой POST 
по url `/mortgages`

Пример post запроса:
```
POST http://localhost:8080/mortgages
Content-Type: application/json
{
 "surname": "Дмитриева",
 "firstName": "Арина",
 "salary": 50000,
 "creditPeriod": 24,
 "creditAmount": 200000
}
```
Пример get запроса для получения всех отклоненных заявок с MySql по локальному хосту
```
GET http://localhost:8080/mortgages/declined
```

Пример get запроса для получения всех успешных заявок с MySql по локальному хосту
```
GET http://localhost:8080/mortgages/successful
```

### для проверки через heroku 

Пример get запроса для получения всех успешных заявок на heroku
```
https://handler-homework.herokuapp.com/mortgages/successful
```

Пример get запроса для получения всех отклоненных заявок на heroku
```
https://handler-homework.herokuapp.com/mortgages/declined
```
### Описание тестов
Для запуска тестов используйте команду:
```
gradle clean test
```
Для проверки "Является ли клиент террористом" используется заглушка Mockito.

## Автор проекта
Кряжова Светлана Юрьевна