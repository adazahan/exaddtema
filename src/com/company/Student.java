package com.company;

public class Student extends Persoana {
    public Student(String nume, String CNP, int age) {
        super(nume, CNP, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", CNP=" + CNP +
                ", age=" + age +
                '}';
    }
}
