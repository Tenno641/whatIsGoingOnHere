package excutors;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor1 = Executors.newFixedThreadPool(4);
        ExecutorService executor2 = Executors.newFixedThreadPool(4);
        sharedData data = new sharedData();

        for (int i = 0; i < 10; i++) {
            executor1.submit(() -> {
                System.out.println("Start process");
                data.dec();
                System.out.println("It's done\n");
            });
        }

        executor1.shutdown();
        System.out.println(executor1.awaitTermination(60, TimeUnit.MILLISECONDS));

        for (int i = 0; i < 10; i++) {
            executor2.submit(() -> {
                System.out.println("Start process");
                data.inc();
                System.out.println("It's done\n");
            });
        }

        executor2.shutdown();
        System.out.println(executor1.awaitTermination(60, TimeUnit.MILLISECONDS));

        System.out.println(data.num);

    }

}

class sharedData {

    volatile int num = 0;

    public synchronized void inc() {
        num++;
    }

    public synchronized void dec() {
        num--;
    }

    public int getNum() {
        return num;
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
