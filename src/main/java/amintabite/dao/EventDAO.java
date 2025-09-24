package amintabite.dao;

import amintabite.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class EventDAO {

    private EntityManager entityManager;

    public EventDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }    //costruttore da portare nel main


    // metodo save

    public void save(Event newEvent) {
        //chiediamo all entity manager di creare una transazione
        EntityTransaction transaction = entityManager.getTransaction();

        //parte la richiesta di transazione
        transaction.begin();

        // con il persist rendiamo l' oggetto managed
        entityManager.persist(newEvent);

        ///  pushamo l'oggetto dentro la tabella
        transaction.commit();

        System.out.println("Evento" + newEvent.toString() + " e' stato aggiunto");

    }
    // get by id

    public Event findById(UUID eventId) {

        Event found = entityManager.find(Event.class, eventId);
        return found;

    }
    // find by Id and delete

    public void findByIdAndDelete(UUID eventId) {

        // cerco nel db tramite id
        Event foundtodelete = this.findById(eventId);

        //2 Chiediamo all' entity manager di creare una transizione
        EntityTransaction transaction = entityManager.getTransaction();


        // parte transizione
        transaction.begin();

        // Rimuoviamo evento
        entityManager.remove(foundtodelete);


        transaction.commit();

        System.out.println("evento " + foundtodelete.toString() + "rimosso");


    }


}
