package externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 18:53
 * @version 1
 */

@Component
@Getter @Setter
public class ClassDAO {

    @Autowired
    private ClassJDBC objectJDBC;

}
