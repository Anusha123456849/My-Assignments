package Beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserService.class);
        userService.registerUser();
        userService.init();
        userService.cleanup();
        context.close();
    }
}
