package solve;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            PrintIfPrimeTask printIfPrimeTask = new PrintIfPrimeTask(number);
            executor.submit(printIfPrimeTask);
        }
        executor.shutdown();

    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number < 2) {
            return;
        }
        if (number == 2) {
            System.out.println(number);
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return;
            }
            System.out.println(number);
        }

    }
}