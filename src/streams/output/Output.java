package streams.output;

import java.io.*;
import java.util.Arrays;

public class Output {

    public static void main(String[] args) throws IOException {

        // Character streams

        String filename = "src\\streams\\output\\text.txt";

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        FileWriter card1 = new FileWriter("src\\streams\\output\\text1.txt", true);
        FileWriter card2 = new FileWriter("src\\streams\\output\\text2.txt", true);

        charArrayWriter.write("Hello this is my Business card");
        charArrayWriter.writeTo(card1);
        charArrayWriter.writeTo(card2);

        char[] arr = charArrayWriter.toCharArray();

        System.out.println(charArrayWriter);

        System.out.println(Arrays.toString(arr));

        charArrayWriter.close();
        card1.close();
        card2.close();


        // Byte Streams


        OutputStream output = new FileOutputStream(filename, true);

        byte[] bytes = {65, 66};

        output.write(bytes);

        output.write(bytes, 0, 2);

        output.write(65);




        output.close();





    }

}
