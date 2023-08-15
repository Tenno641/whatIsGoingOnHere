package threads;

import java.util.*;

public class Threads {

    public static void main(String[] args) throws Exception {

//        // static synchronized shared methods
//        myThread0 thread0 = new myThread0();
//        myThread1 thread1 = new myThread1();
//
//        // instance synchronized shared methods
//        sharedCounter2 counter = new sharedCounter2();
//        myThread2 thread2 = new myThread2(counter);
//        myThread3 thread3 = new myThread3(counter);
//
//        thread0.start();
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        System.out.println();

        SomeClass someClass = new SomeClass();

        testThreadInstance testThreadInstance = new testThreadInstance(someClass);
        testThreadInstance.start();

        testThreadStatic testThreadStatic = new testThreadStatic();
        testThreadStatic testThreadStatic2 = new testThreadStatic();

        testThreadStatic.start();
        testThreadStatic2.start();


    }

}

class SomeClass {

    public static void staticMethod() {

        // unsynchronized code

        synchronized (SomeClass.class) { // synchronization on the class
            for (int i = 0; i < 5; i++) {
                System.out.println("Static" + i);
            }
        }
    }

    public void instanceMethod() {

        // unsynchronized code

        synchronized (this) { // synchronization on this instance
            for (int i = 0; i < 5; i++) {
                System.out.println("Instance" + i);
            }
        }
    }
}

class testThreadInstance extends Thread {

    SomeClass someClass;

    testThreadInstance(SomeClass someClass) {
        this.someClass = someClass;
    }

    @Override
    public void run() {
        someClass.instanceMethod();
    }
}

class testThreadStatic extends Thread {

    @Override
    public void run() {
        SomeClass.staticMethod();
    }
}



class sharedCounter1 {

    static int number = 0;

    static synchronized void doSomething() {
        System.out.println(Thread.currentThread().getName() + " Started");
        number++;
        System.out.println(Thread.currentThread().getName() + number);
        System.out.println(Thread.currentThread().getName() + " Finished");

    }
}

class myThread0 extends Thread {

    @Override
    public void run() {
        sharedCounter1.doSomething();
    }
}

class myThread1 extends Thread {

    @Override
    public void run() {
        sharedCounter1.doSomething();
    }
}

class sharedCounter2 {

    int number = 0;

    synchronized void doSomething() {
        System.out.println(Thread.currentThread().getName() + " Started");
        number++;
        System.out.println(Thread.currentThread().getName() + number);
        System.out.println(Thread.currentThread().getName() + " Finished");
    }
}

class myThread2 extends Thread {

    sharedCounter2 counter;

    myThread2(sharedCounter2 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.doSomething();
    }
}

class myThread3 extends Thread {

    sharedCounter2 counter;

    myThread3(sharedCounter2 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.doSomething();
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
