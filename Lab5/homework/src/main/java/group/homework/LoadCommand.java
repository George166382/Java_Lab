/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G
 */
public class LoadCommand {  
    private static String path;

    public LoadCommand(String path) {
        this.path = path;
    }
    
    

    public Catalog execute() throws InvalidCatalogException{
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
}
