CREATE TABLE Usuario
(
    id  serial PRIMARY KEY,
    name     VARCHAR(255),
    email    VARCHAR(255),
    password VARCHAR(255)
);

-- Tabela Category
CREATE TABLE Category
(
    id serial PRIMARY KEY,
    name        VARCHAR(255),
    description VARCHAR(255)
);

-- Tabela Task
CREATE TABLE Task
(
    id     serial PRIMARY KEY,
    name        VARCHAR(255),
    description VARCHAR(255),
    deadline    TIMESTAMP,
    priority    INT,
    status      VARCHAR(255),
    category_id INT,
    usuario_id     INT,
    FOREIGN KEY (category_id) REFERENCES Category (id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario (id)
);

-- Tabela Alarm
CREATE TABLE Alarm
(
    id             serial PRIMARY KEY,
    task_id              INT,
    alarm_time           TIMESTAMP,
    description          VARCHAR(255),
    alarm_period_minutes INT,
    status               BOOLEAN,
    FOREIGN KEY (task_id) REFERENCES Task (id)
);

