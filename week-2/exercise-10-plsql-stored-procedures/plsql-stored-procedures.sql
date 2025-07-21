-- Creating a stored procedure
CREATE OR REPLACE PROCEDURE calculate_square(num IN NUMBER) AS
    square NUMBER;
BEGIN
    square := num * num;
    DBMS_OUTPUT.PUT_LINE('Square of ' || num || ' is: ' || square);
END;
/

-- Executing the procedure
BEGIN
    calculate_square(6);
    calculate_square(12);
END;
/
