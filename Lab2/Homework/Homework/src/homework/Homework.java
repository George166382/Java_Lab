/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

/**
 *
 * @author G
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Location l = new Location("Iasi", 39.45, 16.22);
        l.setName("Roman");
        l.setX((float) 12.36);
        l.setY((float) 56.123);
        Location l1 = new Location("Bucuresti",12.233,78.213);
        Road r = new Road(l,l1);
        System.out.println(l.getName() + " " + l.getX());
        System.out.println(r.getLength());
        Problem pb = new Problem();
        System.out.println(pb.Alg(pb.getLocInd(2),pb.getLocInd(5)));
    }
    
}
