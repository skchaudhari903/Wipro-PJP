select employee_id, last_name, salary, department_id from employees 
where manager_id = &id order by &column_name;