package hello;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/login")
    public String index() {
        return "Greetings from Gateway no " + ThreadLocalRandom.current().nextInt(1, 100 + 1) + "!";
    }

}