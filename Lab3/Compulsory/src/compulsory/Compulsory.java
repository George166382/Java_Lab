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
        Person p = new Person();
        p.setName("Cristi");
        Company c = new Company();
        c.setName("Endava");
        p.setName("Cristi");
        Network n = new Network();
        n.addNode(p);
        n.addNode(c);
        n.print();
    }
    
}
