package dias.thiago.exemplohelloworld.controller;

import dias.thiago.exemplohelloworld.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloWorldController {

    public String index() {
        return "Agora sim, vamo dale!";
    }

}
