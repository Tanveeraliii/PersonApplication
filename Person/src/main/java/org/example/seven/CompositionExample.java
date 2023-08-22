package org.example.seven;

public class CompositionExample {
    public static void main(String[] args) {
        Address add = new Address("123 M=main st","chicago");

        House house = new House(4,add);

        house.displayInfo();

        Apartment apt = new Apartment(2,add);
        apt.displayInfo();
    }
}
