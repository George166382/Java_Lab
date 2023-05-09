/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10.serverapplication;

import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ClientThread extends Thread {
    private Socket clientSocket;

    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String request;
            while ((request = in.readLine()) != null) {
                System.out.println("Server received the request: " + request);

                if (request.equals("stop")) {
                    break;
                }

                out.println("Server received the request: " + request);
            }

            out.println("Server stopped");
            clientSocket.close();
            System.out.println("Client disconnected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
