# Write your MySQL query statement below
SELECT DATE_FORMAT(trans_date, '%Y-%m') as month,
country,
COUNT(amount) as trans_count,
COUNT(CASE WHEN state = 'approved' THEN 1 END) as approved_count,
SUM(amount) as trans_total_amount,
SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) as approved_total_amount 
FROM Transactions
GROUP BY 
EXTRACT(YEAR FROM trans_date), 
EXTRACT(MONTH FROM trans_date), 
country;