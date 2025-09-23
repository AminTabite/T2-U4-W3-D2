package amintabite;

import amintabite.dao.EventDAO;
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

        Event linkin_park = new Event("Emptiness machine",
                LocalDate.of(2026, 05, 22), "linking park tour",
                EventType.PUBLIC, 50);


        Event ThreeDaysGrace = new Event("Mayday",
                LocalDate.of(2025, 12, 28), "Three days grace",
                EventType.PUBLIC, 200);


        Event Raxeller = new Event("Dont Leave",
                LocalDate.of(2025, 12, 28), "Raxeller",
                EventType.PUBLIC, 110);

        //   Event idtrovato = Ed.findById(3);

        //System.out.println(idtrovato.toString());


        Ed.findByIdAndDelete(7);


    }

}
