insert into students(student_id ,name,email ,age ,join_date ,active_flag)values(03,'latha','latha@gmail.com',23,01032022,1),(04,'divya','divya@gmail.com',22,01032022,0),(09,'rupa','rupa@gmail.com',23,01032022,1);
//courses
insert into courses(courses_id,course_name,fees)values(10,'cse',10000),(20,'eee',20000),(30,'ece',30000);
//enrollments
insert into enrollments(enrollment_id,student_id,course_id,enroll_timestamp)values
(1,01,10,'2026-02-03 11:15:42'),
(2,02,10,'2026-02-03 11:15:42'),
(3,03,20,'2026-02-03 11:15:42'),
(4,04,20,'2026-02-03 11:15:42'),
(5,05,30,'2026-02-03 11:15:42'),
(6,06,10,'2026-02-03 11:15:42'),
(7,07,20,'2026-02-03 11:16:45'),
(8,08,30,'2026-02-03 11:16:45'),
(9,09,10,'2026-02-03 11:16:45'),
(10,10,10,'2026-02-03 11:16:45');