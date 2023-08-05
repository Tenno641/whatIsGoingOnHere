package testing;

import java.util.Scanner;
import java.math.BigInteger;

public class Play {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger num = new BigInteger(scanner.next());

        System.out.print(factorial(num));

    }

    public static BigInteger factorial(BigInteger num) {
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        return num.multiply(factorial(num.subtract(BigInteger.TWO)));

    }

}

record Grades(String name, int grade) implements Comparable<Grades> {

    @Override
    public String toString() {
        return String.format("%s %d", name(), grade());
    }

    @Override
    public int compareTo(Grades grades) {
        int grade = Integer.compare(grade(), grades.grade());
        if (grade == 0) {
            return String.CASE_INSENSITIVE_ORDER.compare(name(), grades.name());
        }

        return grade;

    }

}