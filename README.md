# springmvc
spring mvc sample site with angularjs

sql:

CREATE DATABASE studentsdb
  WITH ENCODING='UTF8'
       CONNECTION LIMIT=-1;

create TABLE courses(
   course_id INT PRIMARY KEY     NOT NULL,
   name           TEXT    NOT NULL   
);

create TABLE student_course(
   course_id INT      NOT NULL,
   student_id INT      NOT NULL
);

create TABLE students(
   student_id INT PRIMARY KEY     NOT NULL,
   firstName           TEXT    NOT NULL,
   LastName           TEXT    NOT NULL,
   AGE            INT     NOT NULL
);