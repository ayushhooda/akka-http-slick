DROP TABLE IF EXISTS user_details;

CREATE TABLE IF NOT EXISTS user_details (
    id INT NOT NULL AUTO_INCREMENT,
    firstname varchar(50) NOT NULL,
    lastname varchar(50) NOT NULL,
    age INT NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO user_details VALUES (1, 'Ayush', 'Hooda', 23);
