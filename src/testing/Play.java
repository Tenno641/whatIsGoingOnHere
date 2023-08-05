package testing;

import java.util.Scanner;
import java.math.BigInteger;

public class Play {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        BigInteger c = new BigInteger(scanner.next());
        BigInteger d = new BigInteger(scanner.next());

        System.out.println((a.negate()).multiply(b).add(c).subtract(d));

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