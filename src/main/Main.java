package main;

import cryptography.Crypto;
import patterns.Factory;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        School school = SchoolStaticFactory.newInstance("student");

        school.setName("Ahmed");
        Students students = (Students) school;
        students.setAge(25);

    }

}

class SchoolStaticFactory {

    public static School newInstance(String type) {

        switch (type) {
            case "school" -> {
                return new School();
            }

            case "subject" -> {
                return new Subjects();
            }

            case "student" -> {
                return new Students();
            }

        }

        throw  new NoSuchElementException("Not found!");

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


