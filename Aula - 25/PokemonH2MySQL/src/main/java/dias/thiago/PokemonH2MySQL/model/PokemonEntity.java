package dias.thiago.PokemonH2MySQL.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Author Thiago Dias
 * @version 1.0
 * @since 25/04/20 - 21:17
 */

//SpringBoot
@Component

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA - Java Persistence API
@Entity
@Table(name = "pokemon")
public class PokemonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pokemon")
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "tipo")
    private String type;

    @Column(name = "habilidade")
    private String ability;

    @Column(name = "natureza")
    private String nature;

    @Column(name = "altura")
    private double height;

    @Column(name = "peso")
    private double weight;

}
