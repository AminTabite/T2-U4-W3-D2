package amintabite;

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
        Event linkin_park = new Event("Emptiness machine",
                LocalDate.of(2026, 05, 22), "linking park tour",
                EventType.PUBLIC, 50);

        System.out.println("Hello World!");
        linkin_park.toString();
    }

}
