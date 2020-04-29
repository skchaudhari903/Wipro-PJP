select last_name, salary, commission_pct from employees 
where commission_pct is not null order by 2, 3 DESC;