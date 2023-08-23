package org.example.nineeeee;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this.name="cat";


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("Name is: "+this.name);
    }
}
