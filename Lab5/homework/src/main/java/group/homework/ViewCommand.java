/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.homework;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G
 */
public class ViewCommand implements Command { 

    private Document doc;

    public ViewCommand(Document doc) {
        this.doc = doc;
    }
    
    @Override
    public void execute() {
        
        Desktop desktop = Desktop.getDesktop();
    try {
        desktop.open(new File(doc.getLocation()));
    } catch (IOException ex) {
        System.out.println("Could not open document " + doc.getLocation());
    }
    }
}
