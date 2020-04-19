package dias.thiago.exemplocomponentscan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 18:50
 * @version 1
 */

@SpringBootApplication
@ComponentScan("externalclasses") //Nome do pacote onde deve acontecer o scan
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());
	}

}
