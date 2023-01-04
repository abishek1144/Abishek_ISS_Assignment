-- SELECT statement to get all data from city table. 
SELECT * FROM world.city;


-- DISTINCT statement to get unique country codes and district.
SELECT DISTINCT CountryCode, 
District 
FROM world.city;


-- WHERE, AND/OR, ORDER BY, INSERT UPDATE, DELETE, INJECTION, SELECT TOP, WILDCARDS, LIKE, IN , BETWEEN, ALIASES
SELECT Name 
FROM city WHERE CountryCode='AFG' 
AND population>20000;


SELECT * FROM city 
WHERE CountryCode Like "%AFG%" ORDER BY Name DESC;


SELECT * FROM city 
GROUP BY CountryCode;

