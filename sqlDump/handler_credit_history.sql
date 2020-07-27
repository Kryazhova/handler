create table credit_history
(
    id         int auto_increment
        primary key,
    surname    varchar(32) not null,
    first_name varchar(32) not null,
    debtor     tinyint(1)  null,
    rating     int         not null
);

INSERT INTO handler.credit_history (id, surname, first_name, debtor, rating) VALUES (1, 'Иванов', 'Иван', 0, 85);
INSERT INTO handler.credit_history (id, surname, first_name, debtor, rating) VALUES (2, 'Тимофеев', 'Тимофей', 0, 90);
INSERT INTO handler.credit_history (id, surname, first_name, debtor, rating) VALUES (3, 'Гергиев', 'Георгий', 1, 90);
INSERT INTO handler.credit_history (id, surname, first_name, debtor, rating) VALUES (4, 'Дмитриев', 'Дмитрий', 1, 40);
INSERT INTO handler.credit_history (id, surname, first_name, debtor, rating) VALUES (5, 'Александрова', 'Александра', 0, 84);
INSERT INTO handler.credit_history (id, surname, first_name, debtor, rating) VALUES (6, 'Дмитриева', 'Дарина', 0, 50);