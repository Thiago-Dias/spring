package dias.thiago.exemploweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplowebApplication.class, args);

		System.out.println("Exemplo com server TomCat");
	}

}
