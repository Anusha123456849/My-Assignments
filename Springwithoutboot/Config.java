package Springwithoutboot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Userservice userService(){
        return new Userservice();
    }
    @Bean
    public Userrepository ur()
    {
        return new Userrepository();
    }
}
