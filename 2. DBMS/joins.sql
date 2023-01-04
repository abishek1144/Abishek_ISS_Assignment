 -- INNER JOIN (get customer , their oder number and status)
 SELECT city.Name as CityName, country.Name as CountryName
 FROM city
 INNER JOIN country ON city.CountryCode = country.Code;
 
--  LEFT JOIN (get all orders and their status with corresponding ordered product code)
 SELECT city.Name as CityName, country.Name as CountryName
 FROM country
 INNER JOIN city ON city.CountryCode = country.Code;
--  
--  -- RIGHT JOIN (get all customers who have placed order, null for customer who have not placed an order)
 SELECT city.Name as CityName, country.Name as CountryName
 FROM city
RIGHT JOIN country ON city.CountryCode = country.Code;
 