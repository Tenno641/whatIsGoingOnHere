package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) throws IOException {

        try (ServerSocket server = new ServerSocket(2500)) {
            while (true) {
                try (
                    Socket socket = server.accept();
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                ) {
                    String msg = input.readUTF();
                    output.writeUTF(msg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
