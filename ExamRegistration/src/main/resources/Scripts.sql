CREATE TABLE 'User_Role_Map' (
  User_ID int NOT NULL,
  Role_ID int NOT NULL,
  PRIMARY KEY ('User_ID','Role_ID')
); 

CREATE TABLE 'User' (
  'ID' int NOT NULL AUTO_INCREMENT,
  'Password' varchar(45) NOT NULL,
  'first_name' varchar(45) NOT NULL,
  'last_name' varchar(45) DEFAULT NULL,
  'phone_number' varchar(45) NOT NULL,
  PRIMARY KEY ('ID')
);

CREATE TABLE 'Role' (
  'ID' int NOT NULL AUTO_INCREMENT,
  'name' varchar(45) NOT NULL,
  PRIMARY KEY ('ID')
);

CREATE TABLE 'Exam'.'Examination' (
  'code' INT NOT NULL AUTO_INCREMENT,
  'name' VARCHAR(45) NOT NULL,
  'SRN' VARCHAR(45) NOT NULL,
  'duration' INT NULL,
  PRIMARY KEY ('code'),
  UNIQUE INDEX 'SRN_UNIQUE' ('SRN' ASC) VISIBLE);

INSERT INTO Exam.Role
(name)
VALUES
('Administrator');

INSERT INTO Exam.Role
(name)
VALUES
('Teacher');

INSERT INTO Exam.Role
(name)
VALUES
('Student');


