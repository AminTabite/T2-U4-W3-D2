package amintabite.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Location")


public class Location {
    @Id
    @GeneratedValue
    @Column(name = "Location_id")
    private UUID Location_id;


    private String nome;
    private String citta;
    @OneToMany(mappedBy = "location")
    private List<Event> events;

    Location() {

    }

    Location(String nome, String citta, List events) {

        this.nome = nome;
        this.citta = citta;
        this.events = events;


    }


    public UUID getLocation_id() {
        return Location_id;
    }

    public String getNome() {
        return nome;
    }

    public String getCitta() {
        return citta;
    }

    public List<Event> getEvents() {
        return events;
    }


    @Override
    public String toString() {
        return "Location{" +
                "Location_id=" + Location_id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", events=" + events +
                '}';
    }
}
