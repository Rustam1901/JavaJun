package org.example.hw3.task2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

    public void addPerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }

    public void updatePerson(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(person);
        em.getTransaction().commit();
        em.close();
    }

    public void deletePerson(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Person person = em.find(Person.class, id);
        if (person != null) {
            em.remove(person);
        }
        em.getTransaction().commit();
        em.close();
    }
}

