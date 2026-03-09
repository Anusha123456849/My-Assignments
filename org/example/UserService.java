package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser() {
        System.out.println("Registering user in service");
        userRepository.saveUser();
    }

    public void notifyFromRepository() {
        System.out.println("UserService received callback from repository");
    }

    public void printInjectionStatus() {
        System.out.println("UserRepository injected into UserService: " + (userRepository != null));
    }
}
