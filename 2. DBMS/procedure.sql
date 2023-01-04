-- Procedure to get all product details and find the top'N' cities sold.
DELIMITER &&  
CREATE PROCEDURE get_top_cities (IN var1 INT)  
BEGIN  
    SELECT * FROM city LIMIT var1;  
    SELECT COUNT(Name) AS CityName 
    FROM city
    GROUP BY Name
    LIMIT var1;    
END &&  
DELIMITER ;  

-- Run the store procedure
CALL get_top_cities(5);