create table mortgage_application_result
(
    id                      bigint auto_increment
        primary key,
    is_debtor               tinyint(1) null,
    is_terrorist            tinyint(1) null,
    is_success              tinyint(1) null,
    is_low_salary           tinyint(1) null,
    mortgage_application_id bigint     null,
    constraint FKgwxv6j8j84f51brr1u41tdf5q
        foreign key (mortgage_application_id) references mortgage_application (id)
            on update cascade on delete cascade
);

INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (137, 0, 0, 1, 0, 185);
INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (138, 0, 0, 0, 1, 186);
INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (139, 0, 0, 1, 0, 187);
INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (140, 1, 0, 0, 0, 188);
INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (141, 1, 0, 0, 0, 189);
INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (143, 1, 0, 0, 0, 191);
INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (144, 0, 0, 1, 0, 192);
INSERT INTO handler.mortgage_application_result (id, is_debtor, is_terrorist, is_success, is_low_salary, mortgage_application_id) VALUES (145, 0, 0, 1, 0, 193);