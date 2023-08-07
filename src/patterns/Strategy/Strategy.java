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

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int step = 3;

        Integer[] ints;
        ArrayList<Integer> person = new ArrayList<>();
        int size = arr.length;
        for (int i = 0; i < size; i += step) {
            person.add(arr[i]);
        }
        System.out.println(Arrays.toString(person.toArray(new Integer[0])));

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

