package Beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
    @Bean
    public UserService userService() {
        return new UserService();
    }
}
