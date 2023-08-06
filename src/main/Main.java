package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(new BigDecimal(scanner.next()).multiply(new BigDecimal(scanner.next())));

    }

}