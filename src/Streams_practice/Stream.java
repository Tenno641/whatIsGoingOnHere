package Streams_practice;

import java.util.Scanner;

public class Stream {

    public static void main(String []args) throws Exception {
        int error = 5 / 0;

        new Thread(() -> {
            try {Thread.sleep(1000L);} catch (Exception e) {}
            System.out.println("I'm a zombie thread.");
        }).start();

        new Thread(() -> {
            try {Thread.sleep(2000L);} catch (Exception e) {}
            System.out.println("I'm a zombie thread too.");
        }).start();

    }

}

class HelloThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from Thread-1");
        HelloThread2 t = new HelloThread2();
        t.start();
    }
}

class HelloThread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello from Thread-2");
    }
}

class SquareWorkerThread extends Thread {
    private final Scanner scanner = new Scanner(System.in);

    public SquareWorkerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == 0) {
                    break;
                }
                System.out.println(number * number);
            } catch (NumberFormatException e) {
                System.out.print("");
            }
        }
        System.out.printf("\n%s finished%n", getName());
    }
}



