package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);
        System.out.println(numbers.headSet(3, true));
        System.out.println(numbers.tailSet(3, true));

        System.out.println(numbers.subSet(2, true, 4, true));
        


    }

}
