/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Table;

/**
 *
 * @author G
 */
@Entity
@Table(name = "albums")
@NamedQueries({
    @NamedQuery(name = "Album.findAll", query = "SELECT a FROM Album a"),
    @NamedQuery(name = "Album.findById", query = "SELECT a FROM Album a WHERE a.id = :id"),
    @NamedQuery(name = "Album.findByRelyear", query = "SELECT a FROM Album a WHERE a.relyear = :relyear"),
    @NamedQuery(name = "Album.findByTitle", query = "SELECT a FROM Album a WHERE a.title = :title")})
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private Integer id;
    private Integer relyear;
    private String title;
    @ManyToOne(targetEntity = Artist.class)
    private Artist art;
    @OneToOne(mappedBy = "albums")
    private Genre gen;
    public Album() {
        this.title = new String();
        this.art = new Artist();
        this.gen = new Genre();
    }
   
    public Album(Integer id) {
        this.id = id;
        this.art = new Artist();
        this.gen = new Genre();
        this.title = new String();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRelyear() {
        return relyear;
    }

    public void setRelyear(Integer relyear) {
        this.relyear = relyear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(Artist a) {
        this.art = a;
    }

    public void setGenre(Genre gen) {
        this.gen = gen;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lab9.homework.Album[ id=" + id + " ]";
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExamplePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    
    
}
