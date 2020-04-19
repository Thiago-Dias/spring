package dias.thiago.exemplohelloworldlombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 12:32
 * version 1.0
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Agora sim, com Lombok sou Dev já!";
    }

}
