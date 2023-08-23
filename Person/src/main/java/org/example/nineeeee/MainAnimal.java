package org.example.nineeeee;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
       ArrayList<Animal> l = new ArrayList<>();
       Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal a4 = new Animal();
        Animal a5 = new Animal();

        Bear b1 = new Bear("bear bear");
        Dog d1 = new Dog("Tommy");


        l.add(a3);
        l.add(a2);
        l.add(0,a4);
        for (Animal animal: l) {
            animal.printName();
        }
    }
}
