package measurements;

public class Measurements {

    static class Circle {

        public static double circumference(double radius) {
            return 2.0 * Math.PI * radius;
        }

        public static double area(double radius)  {
            return Math.PI * (radius * radius);
        }

    }

    static class Rectangle {

        public static double circumference(double length, double width) {
            return 2 * (length + width);
        }

        public static double area(double length, double width) {
            return length * width;
        }

    }

    static class Square {

        public static double circumference(double length) {
            return length * 4;
        }

        public static double area(double length) {
            return length * length;
        }

    }

    static class Triangle {

        public static double circumference(double length1, double length2, double length3) {
            return length1 + length2 + length3;
        }

        public static double area(double height, double base) {
            return (height * base) / 2;
        }

    }

}
