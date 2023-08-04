package testing;

import java.lang.Exception;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Deque;


public class Play {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(solve(input));

    }

    public static boolean solve(String input) {

        String opening = "({[";
        String closing = ")}]";

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);

            if (opening.contains(String.valueOf(current))) {
                deque.push(current);
            } else {
                try {
                    char last = deque.pop();

                    if (opening.indexOf(last) != closing.indexOf(current)) {
                        return false;
                    }

                } catch (NoSuchElementException e) {
                    return false;
                }

            }
        }

        return deque.isEmpty();

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
