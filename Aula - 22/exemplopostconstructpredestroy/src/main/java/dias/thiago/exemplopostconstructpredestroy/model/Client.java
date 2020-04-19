package dias.thiago.exemplopostconstructpredestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 15:35
 * @version 1.0
 */

@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private  String name;

    public Client() {
        System.out.println("Passou no construtor do Client");
    }
}
