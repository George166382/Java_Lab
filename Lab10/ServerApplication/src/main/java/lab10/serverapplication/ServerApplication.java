/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab10.serverapplication;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author G
 */
public class ServerApplication {

    public static void main(String[] args) {
        GameServer g = new GameServer(3000);
        try {
            g.startServer();
        } catch (IOException ex) {
            Logger.getLogger(ServerApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
