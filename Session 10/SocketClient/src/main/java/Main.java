import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    private static Socket clientSocket;
    private static PrintWriter out;
    private static BufferedReader in;

    public static void main(String[] args) {
        try {
            //clientSocket = new Socket("127.0.0.1", 42000);
            clientSocket = new Socket("0.tcp.ngrok.io", 18313);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String sMessageToSend="", sMessageReceived="";
            Scanner myScanner = new Scanner(System.in);
            while (!sMessageToSend.contains("exitAndGoodbye") && !sMessageReceived.contains("exitAndGoodbye"))
            {
                sMessageToSend = myScanner.nextLine();

                System.out.print("You: ");
                System.out.println(sMessageToSend);
                out.println(sMessageToSend);
                sMessageReceived = in.readLine();
                System.out.println("Server: " + sMessageReceived);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            //System.out.println("Reaching finally");
            try {
                clientSocket.close();
                out.close();
                in.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                //System.out.println("Again in catch");
                e.printStackTrace();
            }

        }

    }

}
