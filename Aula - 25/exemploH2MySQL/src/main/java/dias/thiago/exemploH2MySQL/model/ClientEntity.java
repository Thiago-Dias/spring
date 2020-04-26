package dias.thiago.exemploH2MySQL.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Author Thiago Dias
 * @version 1.0
 * @since 22/04/20 - 22:00
 */

//SpringBoot
@Component

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA - Java Persistence API
@Entity
@Table(name = "cliente")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "renda")
    private double income;

}
