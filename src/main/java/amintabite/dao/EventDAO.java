package amintabite.dao;

import jakarta.persistence.EntityManager;

public class EventDAO {

    private EntityManager entityManager;

    public EventDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
