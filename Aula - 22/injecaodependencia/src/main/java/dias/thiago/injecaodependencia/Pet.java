package dias.thiago.injecaodependencia;

import dias.thiago.injecaodependencia.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 13:29
 * @version 1.0
 */

@Component
public class Pet {

// Número 3 - A Annotation @Autowired faz a injeção de dependência automaticamente, sem precisarmos declarar consrtutor.
    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

// Número 2 - Baixo acoplamento. A aplicação envia a classe que deve ser instanciada por construtor.
// public Pet(IAnimal iAnimal) {
//     this.iAnimal = iAnimal;
// }

    public void execute() {
        iAnimal.comunicar();
    }

// Número 1 - Classe Pet fortemente acoplada com a classe Gato e Cachorro. Precisamos entrar no
// código e modificar a instanciação informanado qual classe queremos.
// public void executar() {
//      iAnimal = new Gato();
//      iAnimal.comunicar();
// }
}
