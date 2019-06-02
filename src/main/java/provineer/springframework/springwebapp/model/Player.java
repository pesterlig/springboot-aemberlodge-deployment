package provineer.springframework.springwebapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String lodge;
    @ManyToMany(mappedBy = "players")
    private Set<Deck> decks = new HashSet<>();

    public Player() {
    }

    ;

    public Player(String userName, String lodge) {
        this.id = id;
        this.userName = userName;
        this.lodge = lodge; //make this an object later - a lodge can have more than one player
    }

    ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player(Long id, String userName, String lodge, Set<Deck> decks) {
        this.id = id;
        this.userName = userName;
        this.lodge = lodge;
        this.decks = decks;
    }

    ;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLodge() {
        return lodge;
    }

    public void setLodge(String lodge) {
        this.lodge = lodge;
    }

    public Set<Deck> getDecks() {
        return decks;
    }

    public void setDecks(Set<Deck> decks) {
        this.decks = decks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equals(getId(), player.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", lodge='" + lodge + '\'' +
                ", decks=" + decks +
                '}';
    }
}
