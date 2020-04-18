CREATE TABLE emp (
    id           NUMBER(7),
    last_name    VARCHAR2(25)
        CONSTRAINT ln NOT NULL,
    first_name   VARCHAR2(25),
    dept_id      NUMBER(7),
    CONSTRAINT emp_pk PRIMARY KEY ( id ),
    CONSTRAINT emp_fk FOREIGN KEY ( dept_id )
        REFERENCES dept ( dept_id )
);

INSERT INTO emp VALUES (
    101,
    'SAM',
    'SUNDAR',
    10
);