package testing;

import java.util.*;


public class Play {

    public static void main(String[] args) {

        List<Grades> grades = new ArrayList<>();

        grades.add(new Grades("Ahmed", 200));
        grades.add(new Grades("Mohamed", 150));
        grades.add(new Grades("Ahmed", 150));
        grades.add(new Grades("Khaled", 350));
        grades.add(new Grades("Joe", 350));


        Collections.sort(grades);
        System.out.println(grades);

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