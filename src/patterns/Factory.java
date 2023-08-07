package patterns;

import java.util.Scanner;

public class Factory {

    public static void main(String[] args) {

        System.out.println(500000 % 60);

    }

}

class SchoolStaticFactory {

    public static School newInstance(String type) {

        return switch (type) {
            case "school" -> new School();

            case "subject" -> new Subjects();

            case "student" -> new Students();

            default -> throw new IllegalStateException("Unexpected value: " + type);
        };

    }
}

class School {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

class Subjects extends School {

    private String name;
    private int fullMark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullMark() {
        return fullMark;
    }

    public void setFullMark(int fullMark) {
        this.fullMark = fullMark;
    }
}

class Students extends School {

    private String name;
    private int studentClass;
    private int age;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}


