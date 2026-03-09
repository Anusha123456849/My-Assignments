package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class UserRepository {

    private UserService userService;

    @Autowired
    public void setUserService(@Lazy UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        System.out.println("User saved in repository");
        userService.notifyFromRepository();
    }

    public void printInjectionStatus() {
        System.out.println("UserService injected into UserRepository: " + (userService != null));
    }
}
