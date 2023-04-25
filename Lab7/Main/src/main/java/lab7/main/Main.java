/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab7.main;


/**
 *
 * @author G
 */
public class Main {

        public static void main(String[] args) {
            Memory memory = new Memory(4);
            Map map = new Map(4);
            Game game = new Game();

            Robot Robot1 = new Robot("Robot1", map, memory, 4,false,0,0);
            Robot Robot2= new Robot("Robot2", map, memory, 4,false,0,3);
            Robot Robot3= new Robot("Robot3", map, memory, 4,false,2,2);
            Robot Robot4= new Robot("Robot4", map, memory, 4,false,3,0);
            Robot Robot5= new Robot("Robot5", map, memory, 4,true,3,3);

            game.addRobot(Robot1);
            game.addRobot(Robot2);
            game.addRobot(Robot3);
            game.addRobot(Robot4);
            game.addRobot(Robot5);


            game.start();
            

        }

}
