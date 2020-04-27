INSERT INTO my_employee
    SELECT
        employee_id,
        first_name,
        last_name,
        department_id,
        NULL
    FROM
        employees
    WHERE
        employee_id = 202;