package dias.thiago.exemploo;

import dias.thiago.exemploo.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplooApplication.class, args);

		System.out.println("Hello World SpringBOOT com Gradle");

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("thiago");
		System.out.println(pessoa);
	}

}
