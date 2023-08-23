package excutors;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        sharedData data = new sharedData();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        ExecutorService executor2 = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {

            executor2.submit(() -> {
                try {
                    System.out.println("Start process");
                    System.out.println(1 / 0);
                    System.out.println("It's done\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        }

        executor2.shutdown();

        for (int i = 0; i < 10 && executor2.awaitTermination(60, TimeUnit.MILLISECONDS); i++) {

            executor.submit(() -> {

                System.out.println("Start process");
                data.inc();
                System.out.println("It's done\n");

            });

        }

        executor.shutdown();

        if (executor.awaitTermination(60, TimeUnit.MILLISECONDS) && executor2.awaitTermination(60, TimeUnit.MILLISECONDS)) {
            System.out.println(data.getNum());
        }

    }

}

class sharedData {

    int num = 0;

    public void inc() {
        num++;
    }

    public void dec() {
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
