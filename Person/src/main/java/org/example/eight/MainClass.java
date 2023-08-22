package org.example.eight;

public class MainClass {
    public static void main(String[] args) {
        OverloadedMethod calculator = new OverloadedMethod();
        System.out.println("Sum of two integers: "+ calculator.add(5,10));
        System.out.println("Sum of three integers: "+ calculator.add(5,10,15));
        System.out.println("Sum of two double: "+ calculator.add(3.5,2.7));
    }


}
