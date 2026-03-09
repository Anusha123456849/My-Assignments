package Task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    @Autowired
    private GreetingService greetingService;

    public void showGreeting() {
        greetingService.greet();
    }
}
