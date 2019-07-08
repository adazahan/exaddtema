package com.company;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	//addAndListPersoane();
    addAndListPersoaneArrayList();
    //addAndListPersoaneLinkedList();
   //addAndListPersoaneHashSet();
    //putAndGetHashMap();
    //treeSetExample();


    }

       private static void addAndListPersoaneHashSet() {
        HashSet<Persoana> setdepersoana = new HashSet<>();
        Persoana p1 = new Somer("Popescu", "2911128125830", 27);
        Persoana p2 = new Somer("Pop", "2911128125830", 36);
        Persoana p3 = new Student("Radu", "2830228125830", 33);

        setdepersoana.add(p1);
        setdepersoana.add(p2);
        setdepersoana.add(p3);

        // System.out.println(listadepersoane);
        for (Persoana persoana : setdepersoana) // la hashset nu se foloseste for-ul clasic, cu i; persoana ia fiecare element din lista setdepersoana
            System.out.println(persoana.nume);

        if (p1.equals(p2)) //metoda equals tb sa fie in persoana
        {
            System.out.println("cnp identic");
        }
        else {
            System.out.println("cnp dif");// se afiseaza cnp diferit deoarece compara clase diferite (somer-angajat)
        }

           Map <String, Persoana> myPeople = new HashMap<String, Persoana>();
           myPeople.put("somerPopescu", p1 );
           myPeople.put ("somerPop", p2);
           myPeople.put ("studentRadu", p3);
           System.out.println(myPeople.get("somerPopescu"));
          //3 variante de afisare a hashMAp
          //MI
           for (String key: myPeople.keySet())//cea mai frecventa metoda de afisare a hashmap
           {
               System.out.println(myPeople.get(key));
           }

           //MII
           for (Persoana persoana : myPeople.values())
           {
               System.out.println((persoana));
           }

           //MIII
           System.out.println();//afiseaza si cheia
           for (Map.Entry   <String, Persoana> entry : myPeople.entrySet())
           {
               System.out.println(entry);
           }





    }

    private static void addAndListPersoaneLinkedList() {
        List<Persoana> listadepersoane = new LinkedList<>();
        listadepersoane.add(new Somer("Popescu", "2911128125830", 27));
        listadepersoane.add(new Angajat("Pop", "2800228125830", 36));
        listadepersoane.add(new Student("Radu", "2830228125830", 33));
        // System.out.println(listadepersoane);
        for (int i=0; i<=listadepersoane.size(); i++)
            System.out.println(listadepersoane.get(i).nume); //pt a afisa doar numele -  daca era cu gettere si settere, ar fi fost.getNume()
    }

    private static void addAndListPersoaneArrayList() {
        List<Persoana> listadepersoane = new ArrayList<>();
        Persoana p1 = new Somer("Popescu", "2911128125830", 27);


        Persoana p2 = new Angajat("Pop", "2800228125830", 36);
        Persoana p3 = new Student("Radu", "2830228125830", 33);
        listadepersoane.add (p1);
        listadepersoane.add (p2);
        listadepersoane.add (p3);

        System.out.println("before SORT");
        System.out.println(listadepersoane);
        Collections.sort(listadepersoane, new Comparator<Persoana>() {
            @Override
            public int compare(Persoana p1, Persoana p2) {
                return p1.CNP.compareTo(p2.CNP);
            }
        });

        System.out.println("after SORT");
        System.out.println(listadepersoane);
       // System.out.println(listadepersoane);
        for (int i=0; i<=listadepersoane.size(); i++)
            System.out.println(listadepersoane.get(i));
    }

    public static void addAndListPersoane() {
        Persoana[] sirdepersoane = new Persoana[3];
        Persoana mia = new Somer("Popescu", "2911128125830", 27);
        sirdepersoane [1] = new Angajat("Pop", "2800228125830", 34);
        sirdepersoane[2] = new Student("Radu", "2830228125830", 80);

        for (int i=0; i<=sirdepersoane.length; i++)
            System.out.println(sirdepersoane[i]);




}

    private static void  treeSetExample ()
    { TreeSet <Persoana> persoanaTreeSet = new TreeSet<Persoana>();
    persoanaTreeSet.add (new Angajat("Z", "2341235", 27));
    persoanaTreeSet.add (new Somer("Popescu", "2911128125830", 27));
    persoanaTreeSet.add (new Student("Radu", "2830228125830", 80));

    System.out.println(persoanaTreeSet);



    }

   /* private static void  treeSetExample (Persoana p1, p2, p3, List<Persoana>)
    { TreeSet <Persoana> persoanaTreeSet = new TreeSet<Persoana>();
        persoanaTreeSet.add (new Angajat("Z", "2341235", 27));
        persoanaTreeSet.add (new Somer("Popescu", "2911128125830", 27));
        persoanaTreeSet.add (new Student("Radu", "2830228125830", 80));

        System.out.println(persoanaTreeSet);



    }*/


}


