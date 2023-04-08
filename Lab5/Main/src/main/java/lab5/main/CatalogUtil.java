/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.main;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import lab5.main.InvalidCatalogException;

/**
 *
 * @author G
 */
import java.io.FileOutputStream;
import static java.lang.System.in;
public class CatalogUtil {
    public static void save(Catalog catalog, String path)
                                            throws IOException {
            try (var oos = new ObjectOutputStream(
            new FileOutputStream(path))) 
            {
            oos.writeObject(catalog);
            }
    }
    public static Catalog load(String path)
    throws InvalidCatalogException {
        Catalog cat;
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fis);
            cat = (Catalog)in.readObject();
        }
        catch(FileNotFoundException e){
            System.err.println("File not found...");
            return null;
        }
        catch(IOException e){
            System.err.println("I/O Error");
            return null;
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Class not found");
            return null;
        }
            return cat;
        
        
       
        
    }
 
   public static void view(Document doc) {
    Desktop desktop = Desktop.getDesktop();
    try {
        desktop.open(new File(doc.getLocation()));
    } catch (IOException ex) {
        System.out.println("Could not open document " + doc.getLocation());
    }
}

}
