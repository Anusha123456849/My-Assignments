package Springwithoutboot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Userservice u1 = context.getBean(Userservice.class);
        Userrepository u2=context.getBean(Userrepository.class);
        u1.compile();
        u2.saveUser();
    }
}


