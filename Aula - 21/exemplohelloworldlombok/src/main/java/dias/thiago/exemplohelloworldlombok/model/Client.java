package dias.thiago.exemplohelloworldlombok.model;

import lombok.*;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 12:32
 * version 1.0
 */

@NoArgsConstructor @AllArgsConstructor
@ToString
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String email;
}
