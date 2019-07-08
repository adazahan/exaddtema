package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Persoana implements Comparable <Persoana> {
    String nume;
    String CNP;
    int age;
    List<String> hobbies = new ArrayList<>();

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);//ca sa nu expui niciodata colectiile in afara !!!
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Persoana(String nume, String CNP, int age) {
        this.nume = nume;
        this.CNP = CNP;
        this.age = age;
    }
//Override the equals() method so that 2 persons are considered equal if they have the same CNP - din generate equal !! doar in persoana selectezi

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return CNP.equals(persoana.CNP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CNP);
    }

    @Override
    public int compareTo(Persoana o) {
        return nume.compareTo(o.nume);//afiseaza treeset-ul in ordinea alfabetica anumelor persoaneleor
    }
}
