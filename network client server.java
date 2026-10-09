import java.io.*;
import java.net.*;

public class NetworkTest {
    public static void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started...");
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from Server!");
        } catch (IOException e) { e.printStackTrace(); }
    }

    public static void main(String[] args) throws Exception {
        new Thread(NetworkTest::startServer).start();
        Thread.sleep(500); // Wait for server startup

        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Client received: " + in.readLine());
        }
    }
}