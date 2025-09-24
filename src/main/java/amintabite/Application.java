package amintabite;

import amintabite.dao.EventDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory eMf = Persistence.createEntityManagerFactory("T2u4w3d2");
    //serve a creare l`entity manager ovvero il il componente che controllera' tutte le nostre entities
    // rendendole managed e poi eseguira'  le operazioni necessarie


    public static void main(String[] args) {
        EntityManager eT = eMf.createEntityManager();

        EventDAO Ed = new EventDAO(eT);


        System.out.println("ok");


    }

}
