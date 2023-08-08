package patterns.Factory.FactoryMethod;

public class Factory {

    public static void main(String[] args) {



    }

}

class BirdsFactory {

    static Bird getInstance(String choice) {
        return switch (choice) {
            case "Duck" -> new Duck();
            case "Chicken" -> new Chicken();
            case "Pigeon" -> new Pigeon();
            default -> throw new IllegalStateException();
        };
    }

}

abstract class Bird{

    abstract void eat();

    abstract void makeSound();

    abstract void makeEggs();

}

class Duck extends Bird {

    String name = "Duck";

    @Override
    void eat() {
        System.out.println("Duck eating");
    }

    @Override
    void makeEggs() {
        System.out.println("Golden Egg");
    }

    @Override
    void makeSound() {
        System.out.println("Quack");
    }

}

class Chicken extends Bird {

    String name = "Chicken";

    @Override
    void eat() {
        System.out.println("Chicken eating");
    }

    @Override
    void makeEggs() {
        System.out.println("Silver Egg");
    }

    @Override
    void makeSound() {
        System.out.println("idk.");
    }

}

class Pigeon extends Bird {

    @Override
    void eat() {
        System.out.println("Duck eating");
    }

    @Override
    void makeEggs() {
        System.out.println("Cutie Egg");
    }

    @Override
    void makeSound() {
        System.out.println("CLCKCKCLCKCK");
    }

}
