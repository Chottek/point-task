create table account
(
    id          BIGINT PRIMARY KEY NOT NULL,
    name        VARCHAR            NOT NULL,
    surname     VARCHAR            NOT NULL,
    username    VARCHAR            NOT NULL,
    email       VARCHAR            NOT NULL,
    birthdate   DATE               NOT NULL,
    nationality VARCHAR            NOT NULL,
    role        INT                NOT NULL
);