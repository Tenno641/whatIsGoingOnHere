package measurements;

public class Main {

    public static void main(String[] args) {

        // Circle
        System.out.printf("Circle circumference : %.2f\n", Measurements.Circle.circumference(24.0));
        System.out.printf("Circle Area : %.2f\n", Measurements.Circle.area(24.0));

        System.out.println();

        // Triangle
        System.out.println("Triangle circumference : " + Measurements.Triangle.circumference(5.0, 5.0, 10.0));
        System.out.println("Triangle Area : " + Measurements.Triangle.area(5.0, 10.5));

        System.out.println();

        // Rectangle
        System.out.println("Rectangle circumference : " + Measurements.Rectangle.circumference(15.5, 5.0));
        System.out.println("Rectangle Area : " + Measurements.Rectangle.area(15.5, 5.0));

        System.out.println();

        // Square
        System.out.println("Square circumference : " + Measurements.Square.circumference(4.0));
        System.out.println("Square area : " + Measurements.Square.area(4.0));

    }

}
