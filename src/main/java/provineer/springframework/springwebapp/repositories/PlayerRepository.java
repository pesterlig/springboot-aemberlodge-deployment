package provineer.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import provineer.springframework.springwebapp.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
