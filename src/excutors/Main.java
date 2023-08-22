package excutors;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        sharedData data = new sharedData();

        for (int i = 0; i < 10; i++) {

            executor1.submit(() -> {

                System.out.println("Start process");
                synchronized (data) {
                    data.inc();
                }
                System.out.println("It's done\n");

            });
        }

        executor1.shutdown();

        System.out.println(data.getNum());

    }

}

class sharedData {

    private int num = 0;

    public synchronized void inc() {
        num++;
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
