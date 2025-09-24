package amintabite;

import amintabite.dao.EventDAO;
import amintabite.dao.LocationDAO;
import amintabite.dao.PartecipazioniDAO;
import amintabite.dao.PersonaDAO;
import amintabite.entities.Event;
import amintabite.entities.EventType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory eMf = Persistence.createEntityManagerFactory("T2u4w3d2");
    //serve a creare l`entity manager ovvero il il componente che controllera' tutte le nostre entities
    // rendendole managed e poi eseguira'  le operazioni necessarie


    public static void main(String[] args) {
        EntityManager eT = eMf.createEntityManager();

        EventDAO Ed = new EventDAO(eT);
        PartecipazioniDAO PZd = new PartecipazioniDAO(eT);
        LocationDAO Ld = new LocationDAO(eT);
        PersonaDAO Pd = new PersonaDAO(eT);

        Event giochidatavolo = new Event("gioco dnd", LocalDate.of(2025, 12, 25), "descrizione a caso", EventType.PUBLIC, 10, "Torino");


        System.out.println("ok");


    }

}
