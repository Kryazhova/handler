create table mortgage_application
(
    id            bigint auto_increment
        primary key,
    surname       varchar(32) charset utf8 not null,
    first_name    varchar(32) charset utf8 not null,
    salary        decimal(10, 2)           not null,
    credit_period int default 12           null,
    credit_amount decimal(10, 2)           not null
);

INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (81, 'Володин', 'Володя', 40000.00, 36, 500000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (82, 'Иванов', 'Иван', 40000.00, 12, 500000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (83, 'Гергиев', 'Георгий', 100000.00, 12, 500000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (84, 'Дмитриев', 'Дмитрий', 50000.00, 12, 500000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (85, 'Дмитриева', 'Дарина', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (86, 'Дмитриева', 'Арина', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (126, 'Дорогая', 'Диана', 50000.00, 24, 200000.00);