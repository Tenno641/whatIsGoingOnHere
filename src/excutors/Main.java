package excutors;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor1 = Executors.newFixedThreadPool(4);
        ExecutorService executor2 = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10; i++) {
            int number = i;
            executor1.submit(() -> {
               String taskName = "task-" + number;
               String threadName = Thread.currentThread().getName();
               System.out.printf("%s executes %s\n", threadName, taskName);
            });
        }

        executor1.shutdown();
        System.out.println(executor1.awaitTermination(60, TimeUnit.MILLISECONDS));

        for (int i = 0; i < 10; i++) {
            int number = i;
            executor2.submit(() -> {
                String taskName = "task-" + number;
                String threadName = Thread.currentThread().getName();
                System.out.printf("%s executes %s\n", threadName, taskName);
            });
        }

        executor2.shutdown();
        System.out.println(executor1.awaitTermination(60, TimeUnit.MILLISECONDS));

    }

}

class sum implements Runnable {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {

        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);

    }
}
