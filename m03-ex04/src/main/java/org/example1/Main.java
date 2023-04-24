package org.example1;
import org.example1.airport.Ticket;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernatefundmentals.m03.ex04");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Ticket ticket= new Ticket();
        ticket.setSeries("AA");
        ticket.setNumber("1234");
        ticket.setOrigin("Busharest");
        ticket.setDestination("London");
        em.persist(ticket);
        em.getTransaction().commit();
        emf.close();
    }
}




