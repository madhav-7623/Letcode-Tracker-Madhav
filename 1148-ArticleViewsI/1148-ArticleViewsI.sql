-- Last updated: 11/09/2026, 09:43:44
# Write your MySQL query statement below
SELECT DISTINCT author_id AS id FROM Views WHERE author_id = viewer_id ORDER BY id;