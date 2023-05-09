/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab10.clientapplication;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author G
 */
public class ClientApplication {

    public static void main(String[] args) {
        GameClient gc = new GameClient("localhost",3000);
        try {
            gc.startClient();
        } catch (IOException ex) {
            Logger.getLogger(ClientApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
