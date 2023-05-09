/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab9.homework;

import entities.Album;
import entities.Artist;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;

public class Homework {
    
    public static void main(String[] args) {
        Manager m;
        m = new Manager();
        try {
            m.testJPA();
        } catch (Exception ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Album> albums = FakeDataGenerator.generateAlbums(FakeDataGenerator.generateArtists(),FakeDataGenerator.generateGenres());
        
    }

    
}

