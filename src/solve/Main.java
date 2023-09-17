package solve;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Set<String> set = new HashSet<>();
        int records = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < records; i++) {
            String record = scanner.nextLine().toLowerCase();
            set.add(record);
        }

        Set<String> set2 = new HashSet<>();
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputNumber; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            Collections.addAll(set2, inputs);
        }

        set2.forEach(e -> {
            if (!set.contains(e.toLowerCase())) {
                System.out.println(e);
            }
        });

    }

}