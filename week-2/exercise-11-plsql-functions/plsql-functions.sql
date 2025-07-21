-- Creating a function to calculate factorial
CREATE OR REPLACE FUNCTION get_factorial(n IN NUMBER) RETURN NUMBER IS
    result NUMBER := 1;
BEGIN
    IF n = 0 THEN
        RETURN 1;
    ELSE
        FOR i IN 1..n LOOP
            result := result * i;
        END LOOP;
    END IF;
    RETURN result;
END;
/

-- Using the function
DECLARE
    value NUMBER := 5;
    fact NUMBER;
BEGIN
    fact := get_factorial(value);
    DBMS_OUTPUT.PUT_LINE('Factorial of ' || value || ' is: ' || fact);
END;
/
