CREATE DATABASE usertable;

-- show tables present inside the database
SHOW tables;

-- Create a table
CREATE TABLE usertable.users(
	Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) PRIMARY KEY ,
    Password VARCHAR(255) NOT NULL);

-- Delete/Drop a table
DROP TABLE usertable.users;

-- Insert values into the table
INSERT INTO users VALUES("Abishek S", "abishek@gmail.com", "aaa123" ),
	("Prayag K","prayag@gmail.com", "abcd1234"),
    ("Ravi G","ravi@gmail.com", "akjdk12345");