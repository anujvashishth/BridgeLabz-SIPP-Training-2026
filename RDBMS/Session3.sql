create database CovidDataBase;

CREATE TABLE continents(continent_id INT PRIMARY KEY, continent_name
VARCHAR(50) NOT NULL);

CREATE TABLE countries(country_id INT PRIMARY KEY,country_name
VARCHAR(50) NOT NULL,continent_id INT,population BIGINT NOT NULL,FOREIGN
KEY(continent_id) REFERENCES continents(continent_id));

CREATE TABLE covid_cases(case_id INT PRIMARY KEY,country_id
INT,report_date DATE,confirmed_cases INT,deaths INT,FOREIGN
KEY(country_id) REFERENCES countries(country_id));

CREATE TABLE covid_deaths(death_id INT PRIMARY KEY,country_id
INT,report_date DATE,total_deaths INT,new_deaths INT,FOREIGN
KEY(country_id) REFERENCES countries(country_id));

CREATE TABLE covid_vaccines(vaccine_id INT PRIMARY KEY,country_id
INT,vaccination_status VARCHAR(30),vaccinated_people INT,FOREIGN
KEY(country_id) REFERENCES countries(country_id));

INSERT INTO continents VALUES (1,'Asia'),(2,'Europe'),(3,'North
America'),(4,'South America'),(5,'Africa');

INSERT INTO countries VALUES (101,'India',1,1380000000),(102,'USA',3,331000000),(103,'Brazil',4,212000000),(104,'Germany',2,83000000),(105,'South
Africa',5,60000000),(106,'Japan',1,125000000);

INSERT INTO covid_cases
(case_id, country_id, report_date, confirmed_cases, deaths)
VALUES
(1, 101, '2021-06-01', 28000000, 330000),
(2, 102, '2021-06-01', 33000000, 590000),
(3, 103, '2021-06-01', 16000000, 450000),
(4, 104, '2021-06-01', 3700000, 89000),
(5, 105, '2021-06-01', 1700000, 57000),
(6, 106, '2021-06-01', 750000, 13000),
(7, 101, '2021-06-02', 28100000, 331500),
(8, 102, '2021-06-02', 33150000, 591500),
(9, 103, '2021-06-02', 16100000, 452000),
(10, 104, '2021-06-02', 3710000, 89200),
(11, 105, '2021-06-02', 1715000, 57300),
(12, 106, '2021-06-02', 760000, 13100);



INSERT INTO covid_deaths
(death_id, country_id, report_date, total_deaths, new_deaths)
VALUES
(1, 101, '2021-06-01', 330000, 3500),
(2, 102, '2021-06-01', 590000, 600),
(3, 103, '2021-06-01', 450000, 1800),
(4, 104, '2021-06-01', 89000, 120),
(5, 105, '2021-06-01', 57000, 95),
(6, 106, '2021-06-01', 13000, 40),
(7, 101, '2021-06-02', 331500, 1500),
(8, 102, '2021-06-02', 591500, 500),
(9, 103, '2021-06-02', 452000, 2000),
(10, 104, '2021-06-02', 89200, 200),
(11, 105, '2021-06-02', 57300, 300),
(12, 106, '2021-06-02', 13100, 100);

INSERT INTO covid_vaccines VALUES (1,101,'Fully
Vaccinated',450000000),(2,102,'Fully
Vaccinated',180000000),(3,103,'Partially
Vaccinated',85000000),(4,104,'Fully Vaccinated',60000000),(5,106,'Fully
Vaccinated',95000000);


SELECT * FROM continents;
SELECT * FROM countries;
SELECT * FROM covid_cases;
SELECT * FROM covid_deaths;
SELECT * FROM covid_vaccines;


--Find Highest Confirmed Cases using INNER JOIN
--Objective
--Retrieve the country with the highest number of confirmed COVID cases on a specific date by joining relevant tables.

SELECT top 1 c.country_name,
       cc.report_date,
       cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
WHERE cc.report_date = '2021-06-02'
ORDER BY cc.confirmed_cases DESC;

--2: Join COVID Deaths and Vaccination Data
--Objectiv e
--Consolidate death counts and vaccination statuses for all countries into a single view, including those with missing vaccination data.

SELECT
    c.country_name,
    d.total_deaths,
    d.new_deaths,
    v.vaccination_status,
    v.vaccinated_people
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id
INNER JOIN countries c
ON d.country_id = c.country_id;

--Analyze Deaths by Continent
--Objectiv e
--Determine the total number of COVID deaths aggregated by continent to analyze geographical impact.

SELECT
    ct.continent_name,
    SUM(cc.deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
INNER JOIN continents ct
ON c.continent_id = ct.continent_id
GROUP BY ct.continent_name
ORDER BY total_deaths DESC;

--4: Calculate Average New Deaths Per Day
--Objectiv e
--Track the global trend of average daily COVID deaths over time.

SELECT
    report_date,
    AVG(new_deaths) AS avg_new_deaths
FROM covid_deaths
GROUP BY report_date
ORDER BY report_date;

--Find Countries with Highest Infection Rates
--Objectiv e
--Identify and rank countries based on their overall infection rates.

SELECT
    c.country_name,
    c.population,
    MAX(cc.confirmed_cases) AS total_confirmed_cases,
    ROUND((MAX(cc.confirmed_cases) * 100.0) / c.population, 2) AS infection_rate_percent
FROM countries c
INNER JOIN covid_cases cc
ON c.country_id = cc.country_id
GROUP BY c.country_name, c.population
ORDER BY infection_rate_percent DESC;
