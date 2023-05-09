/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9.homework;

import entities.Album;
import entities.Artist;
import entities.Genre;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FakeDataGenerator {
    private static final int MAX_ARTISTS = 1000;
    private static final int MAX_ALBUMS = 10000;
    private static final int MAX_GENRES = 10;
    private static final Random RANDOM = new Random();

    public static List<Artist> generateArtists() {
        List<Artist> artists = new ArrayList<>();
        for (int i = 0; i < MAX_ARTISTS; i++) {
            Artist artist = new Artist();
            artist.setName(generateName());
            //artist.setCountry(generateCountry());
            artists.add(artist);
        }
        return artists;
    }

    public static List<Album> generateAlbums(List<Artist> artists, List<Genre> genres) {
        List<Album> albums = new ArrayList<>();
        for (int i = 0; i < MAX_ALBUMS; i++) {
            Album album = new Album();
            album.setTitle(generateTitle());
            album.setArtist(artists.get(RANDOM.nextInt(artists.size())));
            genres = generateGenres();
            album.setGenre(genres.get(RANDOM.nextInt(genres.size())));
            albums.add(album);
        }
        return albums;
    }

    public static List<Genre> generateGenres() {
        List<Genre> genres = new ArrayList<>();
        for (int i = 0; i < MAX_GENRES; i++) {
            Genre genre = new Genre();
            genre.setName(generateName());
            genres.add(genre);
        }
        return genres;
    }

    private static Set<Genre> generateGenres(List<Genre> genres) {
        int numGenres = RANDOM.nextInt(4) + 1;
        Set<Genre> albumGenres = new HashSet<>();
        for (int i = 0; i < numGenres; i++) {
            albumGenres.add(genres.get(RANDOM.nextInt(genres.size())));
        }
        return albumGenres;
    }

    private static String generateName() {
        String[] names = {"John", "Mary", "Bob", "Alice", "David", "Kate", "Tom", "Lisa", "Sam", "Sara"};
        return names[RANDOM.nextInt(names.length)] + " " + names[RANDOM.nextInt(names.length)];
    }


    private static String generateTitle() {
        String[] titles = {"Greatest Hits", "Live in Concert", "The Best of", "Unplugged", "Acoustic Sessions", "In the Studio", "On Tour", "Essential", "Anthology", "Ultimate"};
        return titles[RANDOM.nextInt(titles.length)] + " " + generateName();
    }
    
    
}

