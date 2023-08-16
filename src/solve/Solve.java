package solve;

public class Solve {

    public static void main(String[] args) {

        int first = Integer.parseInt(args[1]);
        int second = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "+" -> System.out.print(first + second);

            case "-" -> System.out.print(first - second);

            case "*" -> System.out.print(first * second);

            case "/" -> System.out.print(first / second);

            default -> System.out.print("Unknown operator");

        }

    }

}
