package amintabite.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Partecipazioni")


public class Partecipazioni {
    @Id
    @GeneratedValue
    @Column(name = "id_prenotazione")
    private UUID partecipazioneId;  //

    @Column(name = "Stato prenotazione")
    @Enumerated(EnumType.STRING)
    private Status stato; //
    @ManyToOne
    @JoinColumn(name = "Id_Persona", nullable = false)
    private Persona personaId; //
    @ManyToOne
    @JoinColumn(name = "Id_Event", nullable = false)
    private Event id; //


    public UUID getPartecipazioneId() {
        return partecipazioneId;
    }


    public Status getStato() {
        return stato;
    }

    public void setStato(Status stato) {
        this.stato = stato;
    }

    public Persona getPersonaId() {
        return personaId;
    }


    public Event getId() {
        return id;


    }


}
