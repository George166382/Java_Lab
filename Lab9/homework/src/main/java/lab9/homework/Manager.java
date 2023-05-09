/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.homework;

import entities.AbstractJpaController;
import entities.Album;
import entities.AlbumJpaController;
import entities.Artist;
import entities.ArtistJpaController;
import entities.Genre;
import entities.GenreJpaController;
import java.util.List;
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
        AbstractJpaController a = new ArtistJpaController(emf);
        AbstractJpaController g = new GenreJpaController(emf);
        AbstractJpaController al = new AlbumJpaController(emf);
         Artist artist = new Artist(3);
        artist.setName("Beatles");
        Genre gen = new Genre(3);
        gen.setName("Rock");
        Album alb = new Album(3);
        alb.setTitle("Beat");
        List<Album> albs = FakeDataGenerator.generateAlbums(FakeDataGenerator.generateArtists(), FakeDataGenerator.generateGenres());
        em.getTransaction().begin();
        a.create(artist);
        g.create(gen);
        al.create(alb);
        al.create(albs.get(0));
        //a.findById(3);
       /* Artist art = (Artist)em.createQuery(
        "select e from Artist e where e.name='Beatles'")
        .getSingleResult();
        art.setName("The Beatles");*/
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
