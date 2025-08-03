# Write your MySQL query statement below
SELECT emp1.employee_id
FROM Employees as emp1
LEFT JOIN Employees as emp2
ON emp1.manager_id = emp2.employee_id
WHERE emp1.salary < 30000
    AND emp1.manager_id IS NOT NULL
    AND emp2.employee_id IS NULL
ORDER BY emp1.employee_id