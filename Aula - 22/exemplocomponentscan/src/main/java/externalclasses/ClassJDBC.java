package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 18:57
 * @version 1
 */

@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conexão JDBC!");
    }
}
