# Write your MySQL query statement below

SELECT t.user_id,ROUND(COUNT(CASE WHEN action='confirmed' THEN 1 END)/COUNT(t.user_id), 2) 
AS confirmation_rate FROM
(SELECT s.user_id,action
FROM Confirmations c
RIGHT JOIN Signups s 
ON c.user_id=s.user_id) AS t
GROUP BY t.user_id ;
