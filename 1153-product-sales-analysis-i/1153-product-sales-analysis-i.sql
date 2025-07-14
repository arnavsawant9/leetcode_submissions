# Write your MySQL query statement below
SELECT product_name, year, price
FROM Sales as sale
LEFT JOIN Product as product ON sale.product_id = product.product_id