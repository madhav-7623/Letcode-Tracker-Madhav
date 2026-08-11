-- Last updated: 11/08/2026, 21:06:38
# Write your MySQL query statement below
SELECT firstName, lastName, city, state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;