package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) throws IOException {

        while (true) {
            try (
                    Socket socket = new Socket("127.0.0.1", 2500);
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream())
            ) {
                Scanner scanner = new Scanner(System.in);

                String msg = scanner.nextLine();

                output.writeUTF(msg);
                String received = input.readUTF();

                System.out.printf("received this message from the server -> \"%s\"\n", received);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
