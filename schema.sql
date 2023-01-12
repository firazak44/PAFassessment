create database acme_bank;
use acme_bank;

create table accounts(
    account_id varchar(24),
    name varchar(128),
    balance decimal
);

insert into user(account_id, name, balance)
    values  ("V9L3Jd1BBI", "fred", "100.00"),
            ("fhRq46Y6vB", "barney", "300.00"),
            ("uFSFRqUpJy", "wilma", "1000.00"),
            ("ckTV56axff", "betty", "1000.00"),
            ("Qgcnwbshbh", "pebbles", "50.00"),
            ("if9l185l18", "bambam", "50.00");