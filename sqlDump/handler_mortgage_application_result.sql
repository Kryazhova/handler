create table mortgage_application_result
(
    id            bigint auto_increment
        primary key,
    customer_id   bigint     not null,
    is_debtor     tinyint(1) null,
    is_terrorist  tinyint(1) null,
    is_success    tinyint(1) null,
    is_low_salary tinyint(1) null,
    constraint mortgage_application_result_mortgage_application_id_fk
        foreign key (customer_id) references mortgage_application (id)
            on update cascade on delete cascade
);

INSERT INTO handler.mortgage_application_result (id, customer_id, is_debtor, is_terrorist, is_success, is_low_salary) VALUES (55, 81, 0, 0, 1, 0);
INSERT INTO handler.mortgage_application_result (id, customer_id, is_debtor, is_terrorist, is_success, is_low_salary) VALUES (56, 82, 0, 0, 0, 1);
INSERT INTO handler.mortgage_application_result (id, customer_id, is_debtor, is_terrorist, is_success, is_low_salary) VALUES (57, 83, 1, 0, 0, 0);
INSERT INTO handler.mortgage_application_result (id, customer_id, is_debtor, is_terrorist, is_success, is_low_salary) VALUES (58, 84, 1, 0, 0, 1);
INSERT INTO handler.mortgage_application_result (id, customer_id, is_debtor, is_terrorist, is_success, is_low_salary) VALUES (59, 85, 1, 0, 0, 0);
INSERT INTO handler.mortgage_application_result (id, customer_id, is_debtor, is_terrorist, is_success, is_low_salary) VALUES (60, 86, 0, 0, 1, 0);
INSERT INTO handler.mortgage_application_result (id, customer_id, is_debtor, is_terrorist, is_success, is_low_salary) VALUES (99, 126, 0, 1, 0, 0);