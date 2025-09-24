package amintabite.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Event {


    @OneToMany(mappedBy = "id")
    List<Partecipazioni> partecipazioni;
    //attributi ovvero row e tipo delle colonne
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "uuid")
    private UUID id;
    @Column(name = "title", nullable = false, length = 40)
    private String title;
    @Column(name = "Event_date", nullable = false)
    private LocalDate eventDate;
    @Column(name = "description", nullable = true, length = 150)
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "Event_type")
    private EventType type;
    @Column(name = "maxPeopleAllowed", nullable = false)
    private int maxPeople;
    @ManyToOne()
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;


    //costruttore

    public Event() {
    } //costruttore vuoto per le entities
    //ritornano oggetti quando leggiamo la tabella


    public Event(String title, LocalDate eventDate, String description, EventType type, int maxPeople, Location location) {
        this.title = title;
        this.eventDate = eventDate;
        this.description = description;
        this.type = type;
        this.maxPeople = maxPeople;
    }

// metodi


    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public EventType getType() {
        return type;
    }

    public int getMaxPeople() {
        return maxPeople;
    }


    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate=" + eventDate +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", maxPeople=" + maxPeople +
                ", location=" + location +
                '}';
    }
}
