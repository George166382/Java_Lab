/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compulsory;

import compulsory.Location.Type;
import compulsory.Road.RoadType;

/**
 *
 * @author G
 */
public class Compulsory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Location l = new Location();
        l.setType(Type.CITY);
        l.setName("Roman");
        l.setX(12.36);
        l.setY(56.123);
        Location l1 = new Location("Iasi",39.45,16.22);
        Road r = new Road(RoadType.HIGHWAY,l,l1,120);
        System.out.println(l.getName() + " " + l.getType() + " " + l.getX());
        System.out.println(r.getLength());
        System.out.println(l.toString());
        System.out.println(l1.toString());
        System.out.println(r.toString());
    }
    
}
