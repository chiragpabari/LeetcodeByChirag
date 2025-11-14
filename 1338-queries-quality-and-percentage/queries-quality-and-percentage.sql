# Write your MySQL query statement below

SELECT 
    temp.query_name,
    temp.quality AS quality,
    ROUND((temp.low_rating_count / temp.count) * 100, 2) AS poor_query_percentage
FROM (
    SELECT 
        query_name,
        COUNT(query_name) AS count,
        ROUND(SUM(rating/ position) / COUNT(query_name), 2) AS quality,
        SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) AS low_rating_count
    FROM 
        Queries
    GROUP BY 
        query_name
) AS temp;
