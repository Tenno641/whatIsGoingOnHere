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
        ExecutorService executor1;

        synchronized (data) {
            executor1 = Executors.newSingleThreadExecutor();

            for (int i = 0; i < 10; i++) {

                executor1.submit(() -> {

                    System.out.println("Start process");
                    data.inc();
                    System.out.println("It's done\n");

                });

            }
        }

        executor1.shutdown();

        System.out.println(data.getNum());

    }

}

class sharedData {

    AtomicInteger num = new AtomicInteger(0);

    public synchronized void inc() {
        num.incrementAndGet();
    }

    public int getNum() {
        return num.get();
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
