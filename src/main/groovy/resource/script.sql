CREATE TABLE Usuario
(
    user_id  serial PRIMARY KEY,
    name     VARCHAR(255),
    email    VARCHAR(255),
    password VARCHAR(255)
);

-- Tabela Category
CREATE TABLE Category
(
    category_id serial PRIMARY KEY,
    name        VARCHAR(255),
    description VARCHAR(255)
);

-- Tabela Task
CREATE TABLE Task
(
    task_id     serial PRIMARY KEY,
    name        VARCHAR(255),
    description VARCHAR(255),
    deadline    TIMESTAMP,
    priority    INT,
    status      VARCHAR(255),
    category_id INT,
    user_id     INT,
    FOREIGN KEY (category_id) REFERENCES Category (category_id),
    FOREIGN KEY (user_id) REFERENCES Usuario (user_id)
);

-- Tabela Alarm
CREATE TABLE Alarm
(
    alarm_id             serial PRIMARY KEY,
    task_id              INT,
    alarm_time           TIMESTAMP,
    description          VARCHAR(255),
    alarm_period_minutes INT,
    status               BOOLEAN,
    FOREIGN KEY (task_id) REFERENCES Task (task_id)
);

