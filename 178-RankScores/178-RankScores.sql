-- Last updated: 11/08/2026, 21:06:35
SELECT score,
DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;