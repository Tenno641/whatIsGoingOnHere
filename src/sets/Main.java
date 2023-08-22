package sets;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> map = new LinkedHashSet<>();

        map.add(3);
        map.add(2);
        map.add(1);
        map.add(4);
        map.add(5);

        System.out.println(map);

    }

}
