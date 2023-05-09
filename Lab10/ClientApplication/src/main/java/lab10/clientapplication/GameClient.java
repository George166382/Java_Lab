/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10.clientapplication;

import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GameClient {
    private String host;
    private int port;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private BufferedReader keyboard;

    public GameClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

   public void startClient() throws IOException {
    socket = new Socket(host, port);
    System.out.println("Connected to server on " + host + ":" + port);

    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    out = new PrintWriter(socket.getOutputStream(), true);
    keyboard = new BufferedReader(new InputStreamReader(System.in));

    String request;
    while ((request = keyboard.readLine()) != null) {
        out.println(request);
        String response = in.readLine();
        System.out.println(response);

        if (request.equals("exit")) {
            break;
        }
    }

    socket.close();
    System.out.println("Client disconnected");
    }
}
