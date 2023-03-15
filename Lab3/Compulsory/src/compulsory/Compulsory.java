/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compulsory;

/**
 *
 * @author G
 */
public class Compulsory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Cristi");
        Company c = new Company();
        c.setName("Endava");
        Person p2 = new Person();
        p2.setName("Alin");
        System.out.println(p1.compareTo(p2));
        Network n = new Network();
        n.addNode(p1);
        n.addNode(c);
        n.print();
    }
    
}
