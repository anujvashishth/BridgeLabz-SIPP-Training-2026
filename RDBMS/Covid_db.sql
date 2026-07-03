-- Challenge 1: Create COVID Database Schema (DDL)

-- Task A: Create a database named covid_db and select it for use.

create database coviddb;

-- Task B: Create a table named covid_cases based on the mapping above. Add an id column that acts as a Primary Key.

CREATE TABLE covid_cases (
    id INT IDENTITY(1,1) PRIMARY KEY,
    country VARCHAR(100),
    report_date DATE,
    confirmed INT,
    deaths INT,
    recoveries INT
);

-- Challenge 2: Insert Initial COVID Data (DML)

-- Task: Insert a new record into your table for 'India' on '2020-03-15' at '10 AM', with 50 recoveries, 2 deaths, and 100 confirmed cases.

INSERT INTO covidIndia
(State_UnionTerritory ,date, time, ConfirmedIndianNational, deaths, confirmed)
VALUES
('India', '2020-03-15', '10:00:00', 50, 2, 100);

-- Challenge 3: Update Case Information (DML)

-- Task: Update the confirmed cases to 120 for the record you just created (India,2020-03-15).

UPDATE covidIndia
SET confirmed = 120
WHERE State_UnionTerritory = 'India'
  AND date = '2020-03-15';

-- Challenge 4: Delete Incorrect Records (DML)

-- Task: A rogue entry was added where the state is listed as 'IN' instead of 'India'. Write a query to delete it.

DELETE FROM covidIndia
WHERE State_UnionTerritory = 'IN';

-- and Update 

UPDATE covidIndia
SET State_UnionTerritory = 'India'
WHERE State_UnionTerritory = 'IN';

-- Challenge 5: Alter Table (DDL)

-- Task: The data team wants to start tracking vaccination rates. Add a vaccination_rate column to your table.

ALTER TABLE covidIndia
ADD vaccination_rate FLOAT;



select * from covidIndia;