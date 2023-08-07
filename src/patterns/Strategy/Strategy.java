package patterns.Strategy;

public class Strategy {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new Computer());

        context.on();

        context.setStrategy(new TV());

        context.on();



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
