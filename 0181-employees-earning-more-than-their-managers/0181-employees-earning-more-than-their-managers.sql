# Write your MySQL query statement below
# 1. USING SUB-QUEY
-- select E.name as Employee
-- from Employee E
-- where E.salary > (select M.salary
--                 from Employee M
--                 where M.id = E.managerId);

# 2. USING SELF JOIN
select E.name as Employee
from Employee E
join Employee M 
on E.managerId = M.id and E.salary > M.salary;