import java.util.*;
import java.io.*;
public class Problem4 {
    public static void main(String[]args)
        {
          student s1=new student(1,"anusha",98); 
          s1.show(); 
          System.out.println(s1.ispassed());
          student s2=new student(2,"lathasri",95); 
          s2.show();
          System.out.println(s2.ispassed());
        }
}
class student
{
    private int id;
    private String name;
    private int marks;
    student(int id,String name,int marks)
    {
       this.id=id;
       this.name=name;
       this.marks=marks;
    }
    Boolean ispassed()
    {
        if(marks>40)
        {
            return true;
        }
    }
    void show()
    {
        System.out.println(id+" "+name+" "+marks);
    }
}

