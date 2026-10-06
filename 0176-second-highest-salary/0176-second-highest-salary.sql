# Write your MySQL query statement below
SELECT DISTINCT MAX(salary) as SecondHighestSalary
From Employee
WHERE SALARY<(
    SELECT MAX(salary) from Employee
)