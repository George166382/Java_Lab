/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10.serverapplication;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class GameServer {
    private final int port;
    private ServerSocket serverSocket;

    public GameServer(int port) {
        this.port = port;
    }

    public void startServer() throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started on port " + port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostName());

            // Create a new thread to handle the client
            ClientThread clientThread = new ClientThread(clientSocket);
            clientThread.start();
        }
    }

    public void stopServer() throws IOException {
        if (serverSocket != null) {
            serverSocket.close();
            System.out.println("Server stopped");
        }
    }
}

