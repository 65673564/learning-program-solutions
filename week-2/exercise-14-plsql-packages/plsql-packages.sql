-- Create the package specification
CREATE OR REPLACE PACKAGE emp_pkg AS
    PROCEDURE show_salary(emp_id IN NUMBER);
    FUNCTION get_bonus(salary IN NUMBER) RETURN NUMBER;
END emp_pkg;
/

-- Create the package body
CREATE OR REPLACE PACKAGE BODY emp_pkg AS

    PROCEDURE show_salary(emp_id IN NUMBER) IS
        emp_salary employee.salary%TYPE;
    BEGIN
        SELECT salary INTO emp_salary FROM employee WHERE id = emp_id;
        DBMS_OUTPUT.PUT_LINE('Salary of employee ID ' || emp_id || ' is ' || emp_salary);
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('No employee found with ID ' || emp_id);
    END;

    FUNCTION get_bonus(salary IN NUMBER) RETURN NUMBER IS
    BEGIN
        RETURN salary * 0.10;
    END;

END emp_pkg;
/

-- Test the package
BEGIN
    emp_pkg.show_salary(1);
    DBMS_OUTPUT.PUT_LINE('Bonus: ' || emp_pkg.get_bonus(50000));
END;
/
