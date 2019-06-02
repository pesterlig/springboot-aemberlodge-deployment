package provineer.springframework.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import provineer.springframework.springwebapp.model.Deck;

public interface DeckRepository extends CrudRepository<Deck, Long> {
}
