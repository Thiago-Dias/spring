package dias.thiago.exemplohelloworld.controller;

import dias.thiago.exemplohelloworld.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public Cliente getClient() {

        Cliente cliente = new Cliente();
        cliente.setNome("Thiago");

        return cliente;
    }

    @GetMapping("/arrayclientes")
    public ArrayList<Cliente> getClients() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Thiago");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        return clientes;
    }

}
