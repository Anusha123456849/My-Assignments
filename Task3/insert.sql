//students
insert into students(student_id ,name,email ,age ,join_date ,active_flag)values(11,'rishika','rishika@gmail.com',23,01032022,1),(12,'sushma','sushma@gmail.com',23,01032022,0),(13,'eshwar','eshwar@gmail.com',23,01032022,0);
//courses
insert into courses(courses_id,course_name,fees)values(60,'aiml',100000);
//enrollments
insert into enrollments(enrollment_id,student_id,course_id,enroll_timestamp)values
(11,11,60,'2026-02-03 10:15:42'),(12,12,60,'2026-02-03 10:15:42'),(13,13,60,'2026-02-03 10:15:42');
