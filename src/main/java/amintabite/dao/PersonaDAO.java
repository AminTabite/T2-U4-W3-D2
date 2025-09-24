package amintabite.dao;

import amintabite.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PersonaDAO {

    private EntityManager entityManager;


    public PersonaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
        // costruttore da portare sul main
    }

    // metodo save

    public void save(Persona newPersona) {

        // crea transizione
        EntityTransaction transaction = entityManager.getTransaction();

        //parte la richiesta di transizione
        transaction.begin();

        //persist per rendere managed
        entityManager.persist(newPersona);

        transaction.commit();

        System.out.println("persona" + newPersona.toString() + "aggiunta !");

    }

    public Persona findById(UUID personaId) {
        return entityManager.find(Persona.class, personaId);
    }


}
