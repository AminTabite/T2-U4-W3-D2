package amintabite.dao;

import amintabite.entities.Partecipazioni;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PartecipazioniDAO {


    private EntityManager entityManager;


    public PartecipazioniDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
        // costruttore da portare sul main
    }

    // metodo save

    public void save(Partecipazioni newPartecipazioni) {

        // crea transizione
        EntityTransaction transaction = entityManager.getTransaction();

        //parte la richiesta di transizione
        transaction.begin();

        //persist per rendere managed
        entityManager.persist(newPartecipazioni);

        transaction.commit();

        System.out.println("partecipazioni disponibili " + newPartecipazioni.toString() + "aggiunte !");

    }

    public Partecipazioni findById(UUID partecipazioneId) {
        return entityManager.find(Partecipazioni.class, partecipazioneId);
    }

}


