CREATE OR REPLACE PROCEDURE raise_salary (
	p_id IN emp.empno % TYPE, 
	p_percent IN NUMBER
) 
IS 
	test NUMBER;
BEGIN 

	/*UPDATE emp SET sal = sal * ( 1 + p_percent/ 100 ) 
	WHERE empno = p_id; */

	SELECT COUNT(*) INTO test FROM emp;
	DBMS_OUTPUT.PUT_LINE(test || ' records total');

END raise_salary;
/


/*
Create a stored procedure that calculates net salary of all the employees whose records are stored in table "emp".
The criteria for calculating net salary is as follows :

Gross salary = sal + comm.
Net Salary = gross salary - IT

If (the employee's commission is null)
	then IT is calculated as
	IT =  10% of gross salary
else if (the employees commission is less than 500)
	then IT is calculated as
	IT =  15% of gross salary
else
	IT = 20% of gross salary.

Develop a jdbc program that invokes this stored procedure by passing the empno. and in return gets the net salary of each employee. Display on screen the empno., ename and net salary of all the employees.

*/

CREATE OR REPLACE PROCEDURE calculate_salary (
	p_empno IN emp.empno % TYPE,
	p_comm IN emp.comm % TYPE,
	p_sal IN emp.sal % TYPE,
	p_percent IN NUMBER
) 
IS 
	gross_salary NUMBER;
	net_salary NUMBER;
	it NUMBER;
BEGIN 

	gross_salary = p_sal + p_comm;
	
	IF p_comm IS NULL THEN
		it = gross_salary * 10 / 100;
	ELSE IF p_comm < 500 THEN
		it = gross_salary * 15 / 100;
	ELSE
		it = gross_salary * 20 / 100;
	END IF;

	net_salary = gross_salary - it;

	UPDATE emp SET sal = sal * ( 1 + p_percent/ 100 ) 
	WHERE empno = p_empno; 

END calculate_salary;
/


CREATE OR REPLACE PROCEDURE calculate_salary (
	p_empno IN emp.empno % TYPE,
	output OUT emp.sal % TYPE
) IS 
	p_comm emp.comm % TYPE;
	p_sal emp.sal % TYPE;

	gross_salary  emp.sal % TYPE;
	net_salary  emp.sal % TYPE;
	it  emp.sal % TYPE;
BEGIN 
	SELECT comm INTO p_comm FROM emp WHERE empno = p_empno;
	SELECT sal INTO p_sal FROM emp WHERE empno = p_empno;

	IF p_comm IS NULL THEN
		p_comm := 0;
	END IF;

	gross_salary := p_sal + p_comm;
	
	IF p_comm IS NULL THEN
		it := gross_salary * 10 / 100;
	ELSE
		IF p_comm < 500 THEN
			it := gross_salary * 15 / 100;
		ELSE
			it := gross_salary * 20 / 100;
		END IF;	
	END IF;

	net_salary := gross_salary - it;
	
	output := net_salary;
END calculate_salary;
/