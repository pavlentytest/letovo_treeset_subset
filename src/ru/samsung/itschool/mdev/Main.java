package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

            ArrayList<String> names = new ArrayList<>();
            names.add("Ivan");
            names.add("Ivan");
            names.add("Ivan");
            names.add("Olga");
            names.add("Petr");

            TreeSet<String> treeSet = new TreeSet<>(names);
            for(String s: treeSet){
                System.out.println(s);
            }
            class Person implements Comparable<Person> {
                private String name;
                private int age;

                public Person(String name, int age) {
                    this.name = name;
                    this.age = age;
                }

                @Override
                public int compareTo(Person o) {
                    return this.age-o.age;
                }
            }

            /*
        Comparator<Person> rule = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        };*/

            TreeSet<Person> people = new TreeSet<>();
            people.add(new Person("Ivan",22));
            people.add(new Person("Olga",15));
            people.add(new Person("Alex",20));
            people.add(new Person("Maria",16));
            people.add(new Person("Petr",30));

            SortedSet<Person> sortedSet = people.headSet(new Person("",20));

        SortedSet<Person> sortedSet2 = people.subSet(new Person("",10),new Person("",20));

        for(Person p: sortedSet){
            System.out.println(p.age + " " + p.name);
        }
    }
}
