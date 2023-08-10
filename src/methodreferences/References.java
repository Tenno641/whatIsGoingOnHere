package methodreferences;

import java.util.function.Function;

public class References {

    public static void main(String[] args) {

        sum s = new sum();


        Function<Integer, Integer> add = sum::add;

        Function<Integer, Integer> sub = s::sub;

        int num = add.apply(5);

        System.out.println(num);





    }

}

class sum {

    public static int add(int x) {
        return x + 2;
    }

    public int sub(int x) {
        return x - 2;
    }

}
