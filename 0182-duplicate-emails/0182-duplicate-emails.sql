# Write your MySQL query statement below
SELECT p.email as Email 
FROM Person as p
GROUP BY email
HAVING COUNT(*) >1; 