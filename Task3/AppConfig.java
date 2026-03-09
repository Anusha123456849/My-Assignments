package Task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Task3")
public class AppConfig {

    @Bean
    public String appName() {
        return "Spring Core Demo Application";
    }
}
