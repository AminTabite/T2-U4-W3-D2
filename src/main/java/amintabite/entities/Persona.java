package amintabite.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Persona {
    @Id
    @GeneratedValue
    @Column(name = "persona_id")
    private UUID personaId;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "email")
    private String email;
    @Column(name = "Data di nascita")
    private LocalDate dataDiNascita;
    @Column(name = "Genere")
    private Sesso genere;

    @OneToMany
    private List<Partecipazioni> eventipartecipati;


    //

    public Persona() {

    }

    public Persona(String nome, String cognome, String email, LocalDate dataDiNascita, Sesso genere) {

        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.genere = genere;

    }

    public UUID getPersonaId() {
        return personaId;
    }

    public void setPersonaId(UUID personaId) {
        this.personaId = personaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Sesso getGenere() {
        return genere;
    }

    public void setGenere(Sesso genere) {
        this.genere = genere;
    }

    public List<Partecipazioni> getEventipartecipati() {
        return eventipartecipati;
    }

    public void setEventipartecipati(List<Partecipazioni> eventipartecipati) {
        this.eventipartecipati = eventipartecipati;
    }
}
