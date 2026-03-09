package Beanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void init() {
        System.out.println("UserService init");
    }

    public void registerUser() {
        System.out.println("Registering user in service");
        userRepository.saveUser();
    }

    public void cleanup() {
        userRepository.init();
        userRepository.cleanup();
        System.out.println("UserService destroy");
    }
}
