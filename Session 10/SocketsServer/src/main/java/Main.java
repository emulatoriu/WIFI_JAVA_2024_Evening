import logic.ClientThread;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    final String MESSAGE_END = "WIFI_END_STRING";

    private static ServerSocket serverSocket;
    private static Socket clientSocket;
    private static PrintWriter out;
    private BufferedReader in;

    public static void main(String[] args)
    {
        try {
            serverSocket = new ServerSocket(22);
        } catch (Exception e) {
            throw new RuntimeException("");
        }
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                clientSocket = serverSocket.accept();
                Thread clientThread = new ClientThread(clientSocket, out, scanner);
                clientThread.start();
            } catch (Exception e) {
                System.out.println("Could not connect to client");

            }
        }
    }
}
