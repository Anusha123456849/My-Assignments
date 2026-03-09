package Task3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    @Autowired
    private GreetService greetingService;

    public void showGreeting() {
        greetingService.greet();
    }
}
