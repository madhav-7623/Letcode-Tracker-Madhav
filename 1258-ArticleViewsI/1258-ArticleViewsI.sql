-- Last updated: 11/08/2026, 21:03:22
# Write your MySQL query statement below
SELECT DISTINCT author_id AS id FROM Views WHERE author_id = viewer_id ORDER BY id;