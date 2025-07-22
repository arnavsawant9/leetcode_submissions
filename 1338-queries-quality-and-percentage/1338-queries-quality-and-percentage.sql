# Write your MySQL query statement below
SELECT query_name,
ROUND(AVG(rating / position) , 2) AS quality,
ROUND(COUNT(CASE WHEN rating < 3 THEN 1 END) * 100 / COUNT(query_name),2) as poor_query_percentage 
FROM Queries
GROUP BY query_name