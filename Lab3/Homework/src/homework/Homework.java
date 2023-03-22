/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author G
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Network n = new Network();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,1958);
        cal.set(Calendar.MONTH,6);
        cal.set(Calendar.DAY_OF_MONTH,25);

        Date d = cal.getTime();
        Programmer p = new Programmer(6,"Gigi Becali",d);
        n.addNode(p);
        Company c = new Company("FCSB","Bucuresti");
        n.addNode(c);
        cal.set(1965, 4, 12);
        d = cal.getTime();
        Designer des = new Designer("mm",d,false);
        n.addNode(des);
        des.addRelationship(p, des.getName());
        des.addRelationship(c, des.getName());
        p.addRelationship(des, p.getName());
        p.addRelationship(c, p.getName());
        /*c.addRelationship(des, c.getName());
        c.addRelationship(p, c.getName());*/
        n.print();
    }
    
}
