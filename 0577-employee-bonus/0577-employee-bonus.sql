# Write your MySQL query statement below
-- SELECT name, FROM Employee ON Employee.empId = Bonus.empId WHERE (SELECT bonus FROM BONUS) <100

SELECT emp.name, bonus.bonus
FROM Employee AS emp
LEFT JOIN Bonus AS bonus ON emp.empId = bonus.empId
WHERE bonus.bonus < 1000 OR bonus.bonus is NULL;