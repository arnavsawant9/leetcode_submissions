# Write your MySQL query statement below
SELECT unique_id, name FROM Employees AS emp LEFT JOIN EmployeeUNI as empUni ON emp.id = empUni.id