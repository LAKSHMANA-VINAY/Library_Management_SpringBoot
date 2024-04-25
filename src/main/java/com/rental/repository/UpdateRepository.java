package com.rental.repository;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class UpdateRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void update(int id) {
        entityManager.createNativeQuery("UPDATE rental SET status = :newValue WHERE id = :id")
                     .setParameter("newValue", 0)
                     .setParameter("id", id)
                     .executeUpdate();
    }
    
    @Transactional
    public void updateBook(int id) {
        entityManager.createNativeQuery("UPDATE book SET is_available = :newValue WHERE id = :id")
                     .setParameter("newValue", 0)
                     .setParameter("id", id)
                     .executeUpdate();
    }
    @Transactional
    public void updateRecord(int id) {
        entityManager.createNativeQuery("UPDATE book SET is_available = :newValue WHERE id = :id")
                     .setParameter("newValue", 1)
                     .setParameter("id", id)
                     .executeUpdate();
    }
}
