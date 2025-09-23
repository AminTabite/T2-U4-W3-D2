package amintabite;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory eMf = Persistence.createEntityManagerFactory("T2u4w3d2");
    //serve a creare l`entity manager ovvero il il componente che controllera' tutte le nostre entities
    // rendendole managed e poi eseguira'  le operazioni necessarie


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
