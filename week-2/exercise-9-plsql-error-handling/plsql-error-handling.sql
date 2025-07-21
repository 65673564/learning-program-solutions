-- Predefined Exception: ZERO_DIVIDE
BEGIN
    DECLARE
        a NUMBER := 10;
        b NUMBER := 0;
        c NUMBER;
    BEGIN
        c := a / b;
        DBMS_OUTPUT.PUT_LINE('Result: ' || c);
    EXCEPTION
        WHEN ZERO_DIVIDE THEN
            DBMS_OUTPUT.PUT_LINE('Cannot divide by zero.');
    END;
END;
/

-- User-Defined Exception
DECLARE
    insufficient_balance EXCEPTION;
    balance NUMBER := 300;
BEGIN
    IF balance < 500 THEN
        RAISE insufficient_balance;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Sufficient balance.');
    END IF;
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient balance!');
END;
/
