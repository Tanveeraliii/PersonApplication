package org.example;

public class Abc {
    private int i = 20;


    public Abc() {
        System.out.println("default constructor: ");
    }

    public Abc(int i) {
        this();
        this.i = i;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Abc a = new Abc(2);
        Abc a1 = new Abc(200);

    }
}
