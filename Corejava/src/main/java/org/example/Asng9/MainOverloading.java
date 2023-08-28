package org.example.Asng9;

public class MainOverloading {
    public static void main(String[] args) {
        OverloadedMethods calculater = new OverloadedMethods();
        System.out.println("Sum of two Integer: "+ calculater.add(5,10));
        System.out.println("Sum of three integers: "+ calculater.add(5,10,15));
        System.out.println("Sum of two double: "+ calculater.add(3.5,5.6));
    }
}
