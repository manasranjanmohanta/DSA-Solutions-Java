# Write your MySQL query statement below
# 1. USING SUB-QUEY
-- select E.name as Employee
-- from Employee E
-- where E.salary > (select M.salary
--                 from Employee M
--                 where M.id = E.managerId);

# 2. USING SELF JOIN
select e.name as employee 
from employee e
join employee m
on e.managerId = m.id and e.salary > m.salary