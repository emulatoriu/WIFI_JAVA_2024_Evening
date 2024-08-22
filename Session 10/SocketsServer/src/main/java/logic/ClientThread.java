package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread extends Thread {
    private final Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;
    private final Scanner scanner;
    public ClientThread(Socket clientSocket, PrintWriter out, Scanner scanner) {
        this.clientSocket = clientSocket;
        this.out = out;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            //out.println("Connected successfully");
            String sClientMessage = in.readLine(); // reads till it reads a '\n'
            String sMsgToClient = "";
            while (!sClientMessage.contains("exitAndGoodbye") && !sMsgToClient.contains("exitAndGoodbye"))
            {
                System.out.println("Client: " + sClientMessage);
                sMsgToClient = scanner.nextLine();
                out.println(sMsgToClient);
                sClientMessage = in.readLine();

            }
            System.out.println("Goodbye " + clientSocket.getInetAddress().toString());

        } catch (IOException e) {
            System.out.println("Could not send message");
        }
    }
}
