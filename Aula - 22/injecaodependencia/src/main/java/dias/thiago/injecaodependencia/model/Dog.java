package dias.thiago.injecaodependencia.model;

import dias.thiago.injecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 13:59
 * @version 1.0
 */

@Component
@Qualifier("dog")
public class Dog implements IAnimal {

    @Override
    public void comunicar() {
        // Todo Auto-generated method stub
        System.out.println("au au");
    }
}
