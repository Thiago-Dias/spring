package dias.thiago.exemploH2MySQL.repository;

import dias.thiago.exemploH2MySQL.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Author Thiago Dias
 * @version 1.0
 * @since 22/04/20 - 22:02
 */

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
