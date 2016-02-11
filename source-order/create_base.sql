CREATE DATABASE education
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Russian_Russia.1251'
       LC_CTYPE = 'Russian_Russia.1251'
       CONNECTION LIMIT = -1;

--DROP SEQUENCE action_seq;
CREATE SEQUENCE action_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER TABLE action_seq
OWNER TO postgres;

--DROP SEQUENCE action_type_seq;

CREATE SEQUENCE action_type_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER TABLE action_type_seq
OWNER TO postgres;

--DROP SEQUENCE action_people_seq;

CREATE SEQUENCE action_people_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER TABLE action_people_seq
OWNER TO postgres;

--DROP SEQUENCE journal_seq;

CREATE SEQUENCE journal_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER TABLE journal_seq
OWNER TO postgres;

-- DROP SEQUENCE people_seq;

CREATE SEQUENCE people_seq
INCREMENT 1
MINVALUE 1
MAXVALUE 9223372036854775807
START 1
CACHE 1;
ALTER TABLE people_seq
OWNER TO postgres;

--DROP TABLE action;

CREATE TABLE action
(
     id integer NOT NULL DEFAULT nextval('action_seq'::regclass),
     name character(255),
     kal integer,
     action_type_id integer
)
WITH (
OIDS=FALSE
);
ALTER TABLE action
OWNER TO postgres;

-- DROP TABLE action_type;

CREATE TABLE action_type
(
     id integer NOT NULL DEFAULT nextval('action_type_seq'::regclass),
     name character(255)
)
WITH (
OIDS=FALSE
);
ALTER TABLE action_type
OWNER TO postgres;

-- DROP TABLE journal;

CREATE TABLE journal
(
     id integer NOT NULL DEFAULT nextval('products_seq'::regclass),
     date date,
     action_type_id integer
)
WITH (
OIDS=FALSE
);
ALTER TABLE journal
OWNER TO postgres;

-- DROP TABLE action_people;

CREATE TABLE action_people
(
     id integer NOT NULL DEFAULT nextval('action_people_seq'::regclass),
     people_id integer,
     action_id integer
)
WITH (
OIDS=FALSE
);
ALTER TABLE action_people
OWNER TO postgres;

-- DROP TABLE people;

CREATE TABLE people
(
     id integer NOT NULL DEFAULT nextval('people_seq'::regclass),
     name character(255),
     image character(255)
)
WITH (
OIDS=FALSE
);
ALTER TABLE people
OWNER TO postgres;