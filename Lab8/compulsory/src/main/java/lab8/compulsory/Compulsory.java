/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab8.compulsory;

import java.sql.SQLException;

/**
 *
 * @author G
 */
public class Compulsory {

    public static void main(String[] args) {
        try {
            var artists = new ArtistAO();
            artists.create(1,"Pink Floyd");
            artists.create(2,"Michael Jackson");
            var genres = new GenreAO();
            genres.create(1,"Rock"); //TODO: Funk, Soul, Pop
            Database.getConnection().commit();
            var albums = new AlbumAO();
            albums.create(1 , 1979, "The Wall");
            //findByName
            albums.create(2 , 1982, "Thriller");
            Database.getConnection().commit();
            //TODO: print all the albums in the database
            Database.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            
        }
    }
}
