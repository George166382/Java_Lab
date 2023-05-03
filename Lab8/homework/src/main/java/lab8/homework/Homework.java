/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab8.homework;

import java.sql.SQLException;

/**
 *
 * @author G
 */
public class Homework {

    public static void main(String[] args) {
        try {
            var artists = new ArtistAO("Artists");
            artists.create(2,"Pink Floyd");
            var genres = new GenreAO("Genres");
            genres.create(2,"Rock");
            Database.getConnection().commit();
            System.out.println(artists.findByName("Michael Jackson"));
            Database.getConnection().commit();
            Database.getConnection().close();
        } catch (SQLException e) {
            System.err.println(e);
            
        }
    }
}
