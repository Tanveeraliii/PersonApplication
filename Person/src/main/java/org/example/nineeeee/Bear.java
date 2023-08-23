package org.example.nineeeee;

public class Bear extends Animal{

    public Bear(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("bear class: "+super.getName());
    }
}
