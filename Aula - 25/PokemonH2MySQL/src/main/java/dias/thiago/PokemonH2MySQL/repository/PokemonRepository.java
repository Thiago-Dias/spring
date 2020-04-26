package dias.thiago.PokemonH2MySQL.repository;

import dias.thiago.PokemonH2MySQL.model.PokemonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Author Thiago Dias
 * @version 1.0
 * @since 25/04/20 - 21:06
 */

@Repository
public interface PokemonRepository extends CrudRepository<PokemonEntity, Long> {

}
