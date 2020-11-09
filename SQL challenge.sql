CREATE TABLE student(
  studentid int(11) NOT NULL,
  name varchar(250) NOT NULL, 
  course int(11)
  PRIMARY KEY (studentid)
);

CREATE TABLE course(
  courseid int(11) NOT NULL,
  name varchar(250) NOT NULL,
  institution int(11)
  PRIMARY KEY (courseid)
);

CREATE TABLE institution(
  institutionid int(11) NOT NULL,
  name varchar(250) NOT NULL,
  PRIMARY KEY (institutionid)
);

SELECT institution.name AS [INSTITUTION NAME], course.name AS [COURSE NAME], COUNT(student.studentid) AS [NUMBER OF STUDENTS]
FROM ((student
INNER JOIN course ON student.course = course.courseid)
INNER JOIN institution ON course.institution=institution.institutionid)
GROUP BY course.name, institution.name




