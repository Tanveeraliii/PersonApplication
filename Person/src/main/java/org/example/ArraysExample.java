package org.example;

import java.util.Arrays;

public class ArraysExample {
    private String name;
    private int a[] = new int[10];

    @Override
    public String toString() {
        return "ArraysExample{" +
                "name='" + name + '\'' +
                ", a=" + Arrays.toString(a) +
                '}';
    }

    public void displayInfo(){

        try{
            int i = 5;
            int j = 55;




















               int k = i/j;
            System.out.println(k);

        } catch(Exception a){
            System.out.println("cannot divide by zero try another number ");
        }
    }
}
