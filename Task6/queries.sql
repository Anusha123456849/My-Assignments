select*from students  where age>20 order by age;

select count(*) from students where name like '%a%';

select course_name from courses where fees>1000 and fees<40000 order by fees;

select *from students where active_flag=0 and age IS NOT NULL ;

select course_id,count(student_id) from enrollments group by course_id having count(student_id)>1;