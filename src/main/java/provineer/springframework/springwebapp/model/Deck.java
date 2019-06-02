package provineer.springframework.springwebapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity

public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String deckName;
    private String owner;
    private Integer numChains;
    private Integer consecutiveWins;

    @ManyToMany
    @JoinTable(name = "player_deck", joinColumns = @JoinColumn(name = "deck_id"), inverseJoinColumns = @JoinColumn(name = "player_id"))
    private Set<Player> players = new HashSet<>();

    public Deck() {
    }

    ;

    public Deck(String deckName, String owner, Integer numChains, Integer consecutiveWins) {
        this.id = id;
        this.deckName = deckName;
        this.owner = owner;
        this.numChains = numChains;
        this.consecutiveWins = consecutiveWins;
    }

    public Integer getConsecutiveWins() {
        return consecutiveWins;
    }

    public void setConsecutiveWins(Integer consecutiveWins) {
        this.consecutiveWins = consecutiveWins;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Deck(Long id, String deckName, String owner, Integer numChains, Integer consecutiveWins, Set<Player> players) {
        this.id = id;
        this.deckName = deckName;
        this.owner = owner;
        this.numChains = numChains;
        this.consecutiveWins = consecutiveWins;
        this.players = players;
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getNumChains() {
        return numChains;
    }

    public void setNumChains(Integer numChains) {
        this.numChains = numChains;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deck)) return false;
        Deck deck = (Deck) o;
        return Objects.equals(getId(), deck.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Deck{" +
                "id=" + id +
                ", deckName='" + deckName + '\'' +
                ", owner='" + owner + '\'' +
                ", numChains=" + numChains +
                ", consecutiveWins=" + consecutiveWins +
                ", players=" + players +
                '}';
    }
}

