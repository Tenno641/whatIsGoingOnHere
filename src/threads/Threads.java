package threads;

import java.util.*;

public class Threads {

    public static void main(String[] args) throws Exception {

        // static synchronized shared methods
        myThread0 thread0 = new myThread0();
        myThread1 thread1 = new myThread1();

        thread0.start();
        thread1.start();
        thread1.join();

        // Object of the shared data
        sharedCounter2 counter = new sharedCounter2();
        // instance synchronized shared methods
        myThread2 thread2 = new myThread2(counter);
        myThread3 thread3 = new myThread3(counter);

        thread2.start();
        thread3.start();
        thread3.join();

        System.out.println();

        // Object of the shared data
        SomeClass someClass = new SomeClass();
        // synchronized instance block (statement)
        testThreadInstance testThreadInstance = new testThreadInstance(someClass);
        testThreadInstance.start();

        // synchronized static blocks (statements)
        testThreadStatic testThreadStatic = new testThreadStatic();
        testThreadStatic testThreadStatic2 = new testThreadStatic();

        testThreadStatic.start();
        testThreadStatic2.start();
        testThreadStatic2.join();

        SomeClass2 someClass2 = new SomeClass2();
        testThreadInstance2 testThreadInstance2 = new testThreadInstance2(someClass2);
        testThreadInstance22 testThreadInstance22 = new testThreadInstance22(someClass2);

        testThreadInstance2.start();
        testThreadInstance22.start();

    }

}

class SomeClass2 {

    private int numberOfCallingMethod1 = 0;
    private int numberOfCallingMethod2 = 0;

    final Object lock1 = new Object(); // an object for locking
    final Object lock2 = new Object(); // another object for locking

    public void method1() {
        System.out.println("method1...");

        synchronized (lock1) {
            numberOfCallingMethod1++;
            System.out.println(numberOfCallingMethod1);
        }
    }

    public void method2() {
        System.out.println("method2...");

        synchronized (lock2) {
            numberOfCallingMethod2++;
            System.out.println(numberOfCallingMethod2);
        }
    }
}

class testThreadInstance2 extends Thread {

    SomeClass2 someClass;

    testThreadInstance2(SomeClass2 someClass) {
        this.someClass = someClass;
    }

    @Override
    public void run() {
        someClass.method1();
    }
}

class testThreadInstance22 extends Thread {

    SomeClass2 someClass;

    testThreadInstance22(SomeClass2 someClass) {
        this.someClass = someClass;
    }

    @Override
    public void run() {
        someClass.method2();
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

// ----------------------------------------

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

