# Write your MySQL query statement below
SELECT project_id,
ROUND(AVG(experience_years),2) AS average_years
FROM Project AS proj
LEFT JOIN Employee AS emp
ON proj.employee_id = emp.employee_id
GROUP BY proj.project_id