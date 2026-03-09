package Beanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class UserRepository {

    private UserService userService;

    @Autowired
    public void setUserService(@Lazy UserService userService) {
        this.userService = userService;
    }

    public void init() {
        System.out.println("UserRepository init");
    }

    public void saveUser() {
        System.out.println("User saved in repository");
    }

    public void cleanup() {
        System.out.println("UserRepository destroy");
    }
}
