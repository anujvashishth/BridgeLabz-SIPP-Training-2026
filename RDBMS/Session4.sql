-- Find Countries with Above-Average Death Counts

SELECT location, MAX(total_deaths) AS total_death_count
FROM CovidDeaths
WHERE continent IS NOT NULL
GROUP BY location
HAVING MAX(total_deaths) > (
    SELECT AVG(total_deaths)
    FROM CovidDeaths
    WHERE continent IS NOT NULL
);


-- Identify Countries Exceeding Case Threshold

SELECT location, MAX(total_cases) AS max_confirmed_cases
FROM CovidDeaths
WHERE location IN (
    SELECT location
    FROM CovidDeaths
    GROUP BY location
    HAVING MAX(total_cases) > 1000000
)
GROUP BY location;


-- Track COVID Waves - State-wise Analysis

SELECT
    c1.location,
    c1.date,
    c1.total_cases,
    CASE
        WHEN c1.total_cases = (
            SELECT MAX(c2.total_cases)
            FROM CovidDeaths c2
            WHERE c2.location = c1.location
        )
        THEN 'Peak Wave'
        ELSE 'Not Peak'
    END AS wave_status
FROM CovidDeaths c1
WHERE c1.location = 'Mumbai'
ORDER BY c1.date;


-- Find Countries Present in Deaths but Not Cases

SELECT DISTINCT location AS country
FROM covid_deaths
WHERE location NOT IN (
    SELECT DISTINCT location
    FROM covid_cases
    WHERE location IS NOT NULL
);  