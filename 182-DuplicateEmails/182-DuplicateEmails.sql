-- Last updated: 11/08/2026, 21:06:32
# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;