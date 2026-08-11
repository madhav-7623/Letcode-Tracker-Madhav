-- Last updated: 11/08/2026, 21:06:27
# Write your MySQL query statement below
DELETE p1
FROM Person p1, Person p2
WHERE p1.Email = p2.Email
AND p1.Id > p2.Id;