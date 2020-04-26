package dias.thiago.PokemonH2MySQL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Thiago Dias
 * @version 1.0
 * @since 25/04/20 - 21:06
 */

@RestController
public class HellowWorldController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the Pokemon World!";
    }
}
