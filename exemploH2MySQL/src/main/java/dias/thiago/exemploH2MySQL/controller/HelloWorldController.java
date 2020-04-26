package dias.thiago.exemploH2MySQL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Thiago Dias
 * @version 1.0
 * @since 22/04/20 - 22:05
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Seja bem-vindo ao sistema!";
    }
}
