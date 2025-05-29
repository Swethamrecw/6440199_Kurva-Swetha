import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);

        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String clientMessage, serverMessage;

        while (true) {
            System.out.print("Client: ");
            clientMsg = keyboard.readLine();
            output.println(clientMessage);
            if ("bye".equalsIgnoreCase(clientMessage)) break;

            serverMsg = input.readLine();
            System.out.println("Server: " + serverMessage);
        }
        socket.close();
    }
}
