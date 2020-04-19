package dias.thiago.exemploescopo.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 17:21
 * @version 1.0
 */

@Component
//Opção 1
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Opção 2
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC");
    }
}
