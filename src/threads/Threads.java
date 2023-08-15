package threads;

import java.util.*;

public class Threads {

    public static void main(String[] args) throws Exception {

        sharedCounter counter = new sharedCounter();

        thread1 thread1 = new thread1(counter);
        thread2 thread2 = new thread2(counter);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        System.out.println(counter.getCounter());

    }

}

class sharedCounter {

    int counter = 0;

    void increment() {
        counter++;
    }

    int getCounter() {
        return counter;
    }

}

class thread1 extends Thread {

    sharedCounter counter;

    thread1(sharedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
    }
}

class thread2 extends Thread {

    sharedCounter counter;

    thread2(sharedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.increment();
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
