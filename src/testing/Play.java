package testing;

import java.lang.Exception;
import java.util.*;


public class Play {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<String> stack = new ArrayDeque<>();
        Deque<String> wordStack = new ArrayDeque<>();

        char[] input = scanner.nextLine().toCharArray();
        StringBuilder test = new StringBuilder();

        for (char s : input) {

            if (Objects.equals(stack.peek(), "<a>") && s == '<') {
                wordStack.add(test.toString());
                test = new StringBuilder();
            }

            test.append(s);

            if (s == '>') {
                stack.add(test.toString());
                test = new StringBuilder();
            }



        }

        stack.forEach(System.out::println);
        wordStack.forEach(System.out::println);

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
