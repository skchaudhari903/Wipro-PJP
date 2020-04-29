select last_name, job_id, salary from employees 
where job_id = 'SA_REP' OR job_id = 'ST_CLERK' AND salary NOT IN (2500, 3500, 7000);