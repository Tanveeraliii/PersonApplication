package org.example;
public class Main {
    public static void main(String[] args) {
//        ArraysExample ob = new ArraysExample();


//        Car ob = new Car("Toyata",2020,4);
//        ob.displayInfo();

        Product laptop = new Product("laptop",1000);
        Product smartphone = new Product("SmartPhone",500);

        Order order1 = new Order(1,"Laptop");
        Order order2 = new Order(2,"SmartPhone");
        System.out.println("order1: " + order1.toString());
        System.out.println("order2: " + order2.toString());

    }



}