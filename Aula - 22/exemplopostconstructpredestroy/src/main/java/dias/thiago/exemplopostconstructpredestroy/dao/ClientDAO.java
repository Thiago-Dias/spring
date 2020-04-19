package dias.thiago.exemplopostconstructpredestroy.dao;

import dias.thiago.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 14:45
 */

@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    /**
     * Executed when ClientDAO object is created in the memory
     */

    @PostConstruct
    public void postConstructor() {
        System.out.println("Objeto criado na memória");
    }

    /**
     * Executed when ClientDAO object is removed from memory
     */

    @PreDestroy
    public  void preDestroy() {

        System.out.println("Objeto finalizado");
    }
}
