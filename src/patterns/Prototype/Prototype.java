package patterns.Prototype;

import javax.xml.namespace.QName;
import java.util.Objects;

public class Prototype {

    public static void main(String[] args) {

        Proto proto = new PigeonPrototype();

        PigeonPrototype newPigeon = (PigeonPrototype) proto.clone();
        newPigeon.fly();

    }

}

abstract class Test {

    String name;

    public Test(String name) {
        this.name = name;
    }



}

interface Proto {

    Proto clone();

}

class DuckPrototype implements Proto {

    String name = "Duck";

    void eat() {
        System.out.println("Duck eating");
    }

    void makeEggs() {
        System.out.println("duck's egg");
    }

    void fly() {
        System.out.println("Ducking flying away");
    }

    void swim() {
        System.out.println("Duck swimming");
    }

    void voice() {
        System.out.println("duck's voice");
    }

    @Override
    public Proto clone() {
        return new DuckPrototype();
    }

}

class ChickenPrototype implements Proto {

    String name = "Chicken";

    void eat() {
        System.out.println("Chicken eating");
    }

    void makeEggs() {
        System.out.println("Chicken's egg");
    }

    void voice() {
        System.out.println("Chicken's voice");
    }

    @Override
    public Proto clone() {
        return new ChickenPrototype();
    }

}

class PigeonPrototype implements Proto {

    String name = "Pigeon";

    void eat() {
        System.out.println("Pigeon eating");
    }

    void makeEggs() {
        System.out.println("Pigeon's egg");
    }

    void fly() {
        System.out.println("Pigeon flying");
    }

    void voice() {
        System.out.println("Pigeon's voice");
    }

    @Override
    public Proto clone() {
        return new PigeonPrototype();
    }

}
