package com.company;

public class Somer extends Persoana{

    public Somer(String nume, String CNP, int age) {
        super(nume, CNP, age);
    }

    @Override
    public String toString() {
        return "Somer{" +
                "nume='" + nume + '\'' +
                ", CNP=" + CNP +
                ", age=" + age +
                '}';
    }


}
