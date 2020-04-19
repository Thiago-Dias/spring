package dias.thiago.exemplohelloworldlombok.controller;

import dias.thiago.exemplohelloworldlombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 12:32
 * version 1.0
 */

@RestController
public class ClientController {

    @GetMapping("/clientes")
    public Client getClient() {

        Client client = new Client();
        client.setName("Thiago");
        client.setLastName("Dias");
        client.setEmail("thiago_dasd@hotmail.com");

        return client;
    }

    @GetMapping("/listaclientes")
    public ArrayList<Client> getListClient() {

        Client client1 = new Client();
        client1.setName("Thiago");
        client1.setLastName("Dias");
        client1.setEmail("thiago_dasd@hotmail.com");

        Client client2 = new Client();
        client2.setName("Everaldo");
        client2.setLastName("Pinto");
        client2.setEmail("everaldo.pinto@gmail.com");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        return clients;
    }

}
