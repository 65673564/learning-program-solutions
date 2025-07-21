-- Creating the main table
CREATE TABLE students (
    id NUMBER PRIMARY KEY,
    name VARCHAR2(50)
);

-- Creating the log table
CREATE TABLE student_logs (
    id NUMBER,
    name VARCHAR2(50),
    action VARCHAR2(20),
    log_time TIMESTAMP
);

-- Creating a trigger to log insert actions
CREATE OR REPLACE TRIGGER log_student_insert
AFTER INSERT ON students
FOR EACH ROW
BEGIN
    INSERT INTO student_logs (id, name, action, log_time)
    VALUES (:NEW.id, :NEW.name, 'INSERT', SYSTIMESTAMP);
END;
/

-- Testing the trigger
INSERT INTO students (id, name) VALUES (1, 'Raji');
INSERT INTO students (id, name) VALUES (2, 'Hari');

-- View logs
SELECT * FROM student_logs;
