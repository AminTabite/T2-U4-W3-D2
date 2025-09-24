package amintabite.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Partecipazioni")


public class Partecipazioni {
    @Id
    @GeneratedValue
    @Column(name = "id_prenotazione")
    private UUID partecipazioneId;

    @Column(name = "Persona")
    private Persona persona;

    @Column(name = "Evento")
    private Event evento;

    @Column(name = "Stato prenotazione")
    private Status stato;


}
