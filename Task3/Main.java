package Task3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserController controller = context.getBean(UserController.class);

        controller.showGreeting();

       // String name = context.getBean("appName", String.class);

        //System.out.println(name);
    }
}
