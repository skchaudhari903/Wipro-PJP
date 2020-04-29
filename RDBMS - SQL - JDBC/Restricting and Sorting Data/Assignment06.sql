select first_name|| ' '|| last_name as Employee , salary as "Monthly Salary" from employees 
where salary between 5000 and 12000
and department_id = 20 or department_id = 50;