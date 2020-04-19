package dias.thiago.exemploescopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 17:16
 * @version 1.0
 */

@Component
//Opção 1
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Opção 2
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter @Setter
public class ClassDAO {

    @Autowired
    private  ClassJDBC objectJDBC;
}
