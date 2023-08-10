package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client2 {

    public static void main(String[] args) {

        try (
                Socket socket = new Socket("127.0.0.2", 2500);
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ) {

            for (int i = 0; i < 5; i++) {
                Scanner scanner = new Scanner(System.in);
                String msg = scanner.nextLine();

                output.writeUTF(msg);
                String receivedMsg = input.readUTF();

                System.out.println(receivedMsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
