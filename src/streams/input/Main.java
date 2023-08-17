package streams.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("src\\streams\\input\\test.txt");
        FileInputStream fis = new FileInputStream(file);

        byte[] bytes = fis.readAllBytes();

        for (byte b : bytes) {
            System.out.println();
        }

        fis.close();
    }

}
