package com.azam.dsa.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    private String name;
    private int age;
    private boolean elVote;
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", elVote=" + elVote + "]";
    }

    public Person() {
    }

    public Person(String name, int age, boolean elVote) {
        this.name = name;
        this.age = age;
        this.elVote = elVote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isElVote() {
        return elVote;
    }

    public void setElVote(boolean elVote) {
        this.elVote = elVote;
    }
    
    
}
public class VoteEligible {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("Azam", 31, false),
            new Person("Amir", 11, false),
            new Person("Reza", 21, false)
            );
        list.stream()
        .filter(person->person.getAge()>=18)
        .peek(p->p.setElVote(true))
        .collect(Collectors.toList())
        .forEach(System.out::println);;
        
    }
}
