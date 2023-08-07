package patterns.Strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strategy {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new Computer());

        context.on();

        context.setStrategy(new TV());

        context.on();

        String[] arr = {"AshAllen", "Bailey Cox", "Danni Taylor"};
        // 1 2 3 4 5 6 7 8

        int last = 3;

        for (int i = arr.length - 1; last > 0; i--, last--) {
            System.out.println(arr[i]);
        }

    }

}

interface Power {

    void on();
    void off();

}

class Computer implements Power {

    @Override
    public void on() {
        System.out.println("The computer is On");
    }

    @Override
    public void off() {
        System.out.println("The Computer is off");
    }

}

class TV implements Power {

    @Override
    public void on() {
        System.out.println("The TV is On");
    }

    @Override
    public void off() {
        System.out.println("The TV is off");
    }

}

class Context {

    private Power concreteStrategy;

    public void setStrategy(Power concreteStrategy) {
        this.concreteStrategy = concreteStrategy;
    }

    public void on() {
        this.concreteStrategy.on();
    }

    public void off() {
        this.concreteStrategy.off();
    }

}

