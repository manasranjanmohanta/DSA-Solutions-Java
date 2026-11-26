# Write your MySQL query statement below
-- select email
-- from person
-- group by email
-- having count(email) > 1;

select distinct t.email as Email from (
    select email,
    row_number() over(
        partition by email
        order by email asc
    ) as row_num
    from person
) t
where t.row_num > 1;


