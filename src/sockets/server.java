package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(2500)) {

            while (true) {
                session socket = new session(server.accept());
                socket.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


class session extends Thread {

    Socket socket;

    public session(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try (
            DataInputStream input = new DataInputStream(this.socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream())
            ) {

            for (int i = 0; i < 5; i++) {
                String received = input.readUTF();

                output.writeUTF(received);

            }

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
