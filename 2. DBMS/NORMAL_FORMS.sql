CREATE DATABASE Project_Coordination;
USE Project_Coordination;

CREATE TABLE Projects(
[ID] INT PRIMARY KEY IDENusersTITY,
[Name] VARCHAR(100),
[Value] DECIMAL(5,2),
StartDate DATE,
EndDate DATE
)

CREATE TABLE Employees(
[ID] INT PRIMARY KEY IDENTITY,
[FirstName] VARCHAR(50),
[LastName] VARCHAR(50),
[HourlyWage] DECIMAL(5,2),
[HireDate] DATE
)

CREATE TABLE ProjectEmployees(
[ID] INT PRIMARY KEY IDENTITY,
[ProjectID] INT,
[EmployeeID] INT,
[Hours] DECIMAL(5,2),
CONSTRAINT FK_ProjectEmployees_Projects FOREIGN KEY ([ProjectID]) REFERENCES  [Projects] ([ID]),
CONSTRAINT FK_ProjectEmployees_Employees FOREIGN KEY ([EmployeeID]) REFERENCES  [Employees] ([ID])
)

CREATE TABLE JobOrders(
[ID] INT PRIMARY KEY IDENTITY,
[EmployeeID] INT,
[ProjectID] INT,
[Description] TEXT,
[OrderDateTime] DATETIME,
[Quantity] INT,
[Price] DECIMAL(5,2),
CONSTRAINT FK_JobOrders_Projects FOREIGN KEY ([ProjectID]) REFERENCES  [Projects] ([ID]),
CONSTRAINT FK_JobOrders_Employees FOREIGN KEY ([EmployeeID]) REFERENCES  [Employees] ([ID])
)


CREATE TABLE Customers (
    [Name] VARCHAR(100),
    [Industry] VARCHAR(100),
    [Project1_ID] INT,
    [Project1_Feedback] TEXT,
    [Project2_ID] INT,
    [Project2_Feedback] TEXT,
    [ContactPersonID] INT,
    [ContactPersonAndRole] VARCHAR(255),
    [PhoneNumber] VARCHAR(12),
    [Address] VARCHAR(255),
    [City] VARCHAR(255),
    [Zip] VARCHAR(5)
  )

-- 1NF
ALTER TABLE [Customers]
ADD [ID] INT IDENTITY PRIMARY KEY


-- 2NF
ALTER TABLE [Customers]
DROP COLUMN ContactPerson

-- 3NF
ALTER TABLE [Customers]
DROP COLUMN City