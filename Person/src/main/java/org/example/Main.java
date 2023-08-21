package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));

        int size = numbers.size();

        numbers.remove(1);
        boolean contains = numbers.contains(10);
        System.out.println(contains);



    }
}