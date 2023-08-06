package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       String bigNumber = scanner.nextLine();
       int newScale = scanner.nextInt();

       BigDecimal bigDecimal = new BigDecimal(bigNumber);

       System.out.print(bigDecimal.setScale(newScale, RoundingMode.HALF_DOWN));

    }

}