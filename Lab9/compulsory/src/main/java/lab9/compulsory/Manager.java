/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.compulsory;

import entities.Artist;
import entities.ArtistJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author G
 */
public class Manager {
    Manager(){}
    public void testJPA() throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExamplePU");
        EntityManager em = emf.createEntityManager();
        ArtistJpaController a = new ArtistJpaController(emf);
        em.getTransaction().begin();
        Artist artist = new Artist(3);
        artist.setName("Beatles");
        a.create(artist);
        a.findById(3);
       /* Artist art = (Artist)em.createQuery(
        "select e from Artist e where e.name='Beatles'")
        .getSingleResult();
        art.setName("The Beatles");*/
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
