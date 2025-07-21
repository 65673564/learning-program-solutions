-- IF...ELSE
DECLARE
    marks NUMBER := 70;
BEGIN
    IF marks >= 50 THEN
        DBMS_OUTPUT.PUT_LINE('Pass');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Fail');
    END IF;
END;
/

-- WHILE Loop
DECLARE
    i NUMBER := 1;
BEGIN
    WHILE i <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE('WHILE Loop: ' || i);
        i := i + 1;
    END LOOP;
END;
/

-- FOR Loop
BEGIN
    FOR j IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('FOR Loop: ' || j);
    END LOOP;
END;
/

-- Simple LOOP with EXIT
DECLARE
    k NUMBER := 1;
BEGIN
    LOOP
        EXIT WHEN k > 5;
        DBMS_OUTPUT.PUT_LINE('LOOP with EXIT: ' || k);
        k := k + 1;
    END LOOP;
END;
/
