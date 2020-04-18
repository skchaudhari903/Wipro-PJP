INSERT INTO dept VALUES (
    10,
    'Accounts'
);

INSERT INTO dept VALUES (
    20,
    'TT'
);

INSERT INTO dept VALUES (
    1,
    'Accounts'
);


UPDATE dept
SET
    dept_id = 30
WHERE
    dept_id = 1;

INSERT INTO dept
    SELECT
        department_id,
        department_name
    FROM
        departments;

