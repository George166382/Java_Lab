/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author G
 */
public class SaveCommand { 
    private static Catalog cat;
    private static String path;

    public SaveCommand(Catalog cat, String path) {
        this.cat = cat;
        this.path = path;
    }
    public static void execute()
                                            throws IOException {
            try (var oos = new ObjectOutputStream(
            new FileOutputStream(path))) 
            {
            oos.writeObject(cat);
            }
    }
}
