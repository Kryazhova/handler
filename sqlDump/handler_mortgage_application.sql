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

INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (185, 'Иванов', 'Иван', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (186, 'Тимофеев', 'Тимофей', 50000.00, 24, 2000000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (187, 'Гергиев', 'Геогий', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (188, 'Гергиев', 'Георгий', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (189, 'Дмитриев', 'Дмитрий', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (191, 'Дмитриева', 'Дарина', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (192, 'Дмитриева', 'Арина', 50000.00, 24, 200000.00);
INSERT INTO handler.mortgage_application (id, surname, first_name, salary, credit_period, credit_amount) VALUES (193, 'Александрова', 'Александра', 50000.00, 24, 200000.00);