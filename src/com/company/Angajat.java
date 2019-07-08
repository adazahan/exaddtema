package com.company;

public class Angajat extends Persoana {
    public Angajat(String nume, String CNP, int age) {
        super(nume, CNP, age);
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", CNP=" + CNP +
                ", age=" + age +
                '}';
    }
}
