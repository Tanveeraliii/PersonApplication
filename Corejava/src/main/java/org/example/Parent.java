package org.example;

public class Parent {
    private String name = "bob";

    public Parent() {
    }

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("Super class method: ");
    }
}
