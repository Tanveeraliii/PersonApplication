package org.example;

public class Person {
    private String name;
    private int age;
    public Person(){
        System.out.println("default constructor");;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("two args constructor");
    }


    public Person(String name) {
        this.name = name;
        System.out.println("name constructor");
    }

    public Person(int age) {
        this.age = age;
        System.out.println("age constructor");
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
}
