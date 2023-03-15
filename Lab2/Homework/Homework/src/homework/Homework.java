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
        pb.setNewLoc("Iasi", 39.45, 16.22);
        pb.setNewLoc("Bucuresti",12.233,78.213);
        pb.setNewLoc("Cluj", 19.33, 27.199);
        pb.setNewLoc("Craiova", 200.2123, 123.2313);
        pb.setNewLoc("Constanta", 99.01, 1000.314);
        pb.setNewLoc("Brasov", 4344, 133.45);
        pb.setNewLoc("Timisoara", 2324.2312, 24144.241);
        pb.setNewLoc("Braila", 4334, 24143);
        pb.setNewLoc("Suceava", 23433, 23144);
        pb.setNewLoc("Sibiu",4321,434);
        
        pb.setNewRoad(pb.getLocInd(2), pb.getLocInd(5));
        pb.setNewRoad(pb.getLocInd(6),pb.getLocInd(3));
        pb.setNewRoad(pb.getLocInd(1), pb.getLocInd(4));
        pb.setNewRoad(pb.getLocInd(1), pb.getLocInd(0));
        pb.setNewRoad(pb.getLocInd(2), pb.getLocInd(9));
        pb.setNewRoad(pb.getLocInd(9), pb.getLocInd(5));

        System.out.println(pb.Alg(pb.getLocInd(2),pb.getLocInd(5)));
        System.out.println(pb.verify());
    }
    
}
