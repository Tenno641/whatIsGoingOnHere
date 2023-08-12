package functional_interface;

public class Main {

    public static void main(String[] args) {

        // Anonymous class
        Func<Integer, Integer> square = new Func<Integer, Integer>() {
            @Override
            public Integer operation(Integer val) {
                return val * val;
            }
        };
        System.out.println(square.operation(5));

        // Lambda expression
        Func<Integer, Integer> addition = x -> x + x;
        System.out.println(addition.operation(5));

        // Method reference
        Func<Long, Long> sub = Func2::square;
        System.out.println(sub.operation(3L));

    }

}

@FunctionalInterface
interface Func<T, R> {

    R operation(T val);

}

class Func2 {

    public static long square(long val) {
        return val * val;
    }
}
