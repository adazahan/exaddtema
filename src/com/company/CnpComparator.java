package com.company;

import java.util.Comparator;

public class CnpComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana o1, Persoana o2) {
        return o1.CNP;
    }
}
