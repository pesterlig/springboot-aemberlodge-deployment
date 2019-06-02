package provineer.springframework.springwebapp.bootstrap;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import provineer.springframework.springwebapp.model.Deck;
import provineer.springframework.springwebapp.model.Player;
import provineer.springframework.springwebapp.repositories.DeckRepository;
import provineer.springframework.springwebapp.repositories.PlayerRepository;
// must make repsos for this, must fork his code and examine, time for github lessons :p
@Component

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private PlayerRepository playerRepository;
    private DeckRepository deckRepository;

    public DevBootstrap(PlayerRepository playerRepository, DeckRepository deckRepository){
        this.playerRepository = playerRepository;
        this.deckRepository = deckRepository;
    }


    private void initData() {

        //Zooner
        Player zooner = new Player("Zooner", "Rutherford");
        Deck deck1 = new Deck("Z. V. Hectabaron of the Haughty Gully", "Zooner", 0, 2);
        zooner.getDecks().add(deck1);
        deck1.getPlayers().add(zooner);



        Player moam = new Player("Moam", "Rutherford");
        Deck deck2 = new Deck("Yngvi “Raydeth” Aimhdine", "Jeff", 0, 0);
        moam.getDecks().add(deck2);
        deck2.getPlayers().add(moam);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();

    }
}
