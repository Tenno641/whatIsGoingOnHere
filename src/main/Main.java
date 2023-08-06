package main;

import cryptography.Crypto;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringBuilder res = new StringBuilder();

        int times = 20;

        while (times-- > 0) {
            res.append(String.format("%d ", (new Scanner(System.in).nextInt() + 10) % 26));
        }

        System.out.println(res);

    }

}
