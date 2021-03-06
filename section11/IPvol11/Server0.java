import java.io.*;
import java.net.*;

public class Server0 {
  public static final int PORT = 1234;

  public static void main(String args[]) {
    try {
      ServerSocket serverSocket = new ServerSocket(PORT);

      System.out.printf(
          "Start server:\n\tport=%d\n\thost=%s\n",
          serverSocket.getLocalPort(), serverSocket.getInetAddress().getHostAddress());

      while (true) {
        Socket connect = serverSocket.accept();

        OutputStreamWriter out = new OutputStreamWriter(connect.getOutputStream());
        out.write("You have connected to Server0 program\n");
        out.close();
        connect.close();
      }
    } catch (Exception err) {
      System.out.println(err);
    }
  }
}
