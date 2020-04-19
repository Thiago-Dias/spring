package dias.thiago.exemplopostconstructpredestroy;

import dias.thiago.exemplopostconstructpredestroy.dao.ClientDAO;
import dias.thiago.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @Thiago Dias
 * @since 18/04/2020 - 15:35
 * @version 1.0
 */

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Thiago Dias"));

		System.out.println("Objeto ClientDAO: " + clientDAO);
		System.out.println("Objeto Client dentro do CLientDAO: " + clientDAO.getClient());

	}
}
