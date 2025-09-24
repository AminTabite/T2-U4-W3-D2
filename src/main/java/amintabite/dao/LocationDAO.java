package amintabite.dao;

import amintabite.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class LocationDAO {


    private EntityManager entityManager;


    public LocationDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
        // costruttore da portare sul main
    }

    // metodo save

    public void save(Location newLocation) {

        // crea transizione
        EntityTransaction transaction = entityManager.getTransaction();

        //parte la richiesta di transizione
        transaction.begin();

        //persist per rendere managed
        entityManager.persist(newLocation);

        transaction.commit();

        System.out.println("Location" + newLocation.toString() + "aggiunta !");

    }

    public Location findById(UUID Location_Id) {
        return entityManager.find(Location.class, Location_Id);
    }


}
