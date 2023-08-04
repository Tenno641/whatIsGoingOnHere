package testing;

import java.lang.Exception;
import java.util.*;


public class Play {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int times = Integer.parseInt(scanner.nextLine());


        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;


        while (times-- > 0) {
            String[] input = scanner.nextLine().split(" ");

            switch (input[0]) {
                case "push" -> {
                    if (Integer.parseInt(input[1]) >= max) {
                        maxStack.push(Integer.parseInt(input[1]));
                        max = Integer.parseInt((input[1]));
                    }
                    stack.push(Integer.parseInt(input[1]));
                }

                case "max" -> System.out.println(maxStack.peek());

                case "pop" -> {
                    if (Objects.equals(stack.peek(), maxStack.peek())) {
                        maxStack.pop();
                        max = maxStack.peek();
                    }
                    stack.pop();
                }

                default -> System.out.println("fuck it");

            }



        }


    }


}


class myException extends Exception{

    public myException(String msg) {
        super(msg);
    }

    public myException(Exception e) {
        super(e);
    }

}
