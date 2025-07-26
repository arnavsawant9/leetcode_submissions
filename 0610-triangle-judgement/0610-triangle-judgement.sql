# Write your MySQL query statement below
SELECT *,
    CASE
        WHEN 
            x+y > z AND x+z > y AND y+z > x then 'Yes'
        ELSE 'No'
    END as triangle
FROM Triangle