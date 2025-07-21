-- Create a sample table
CREATE TABLE employee (
    id NUMBER,
    name VARCHAR2(50),
    salary NUMBER
);

-- Insert sample data
INSERT INTO employee VALUES (1, 'Raji', 50000);
INSERT INTO employee VALUES (2, 'Harini', 60000);
INSERT INTO employee VALUES (3, 'Gopika', 55000);

-- Cursor to fetch employee details
DECLARE
    CURSOR emp_cursor IS
        SELECT id, name, salary FROM employee;

    v_id employee.id%TYPE;
    v_name employee.name%TYPE;
    v_salary employee.salary%TYPE;
BEGIN
    OPEN emp_cursor;
    LOOP
        FETCH emp_cursor INTO v_id, v_name, v_salary;
        EXIT WHEN emp_cursor%NOTFOUND;
        DBMS_OUTPUT.PUT_LINE('ID: ' || v_id || ', Name: ' || v_name || ', Salary: ' || v_salary);
    END LOOP;
    CLOSE emp_cursor;
END;
/
