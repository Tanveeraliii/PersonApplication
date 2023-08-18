package org.example;

public class Animal {
    private String name;
    private String habitat;

    public void displayInfo(){
        System.out.println("Animal is: "+ name +" "+ habitat );

    }

    public Animal() {
        this.name = "zebra";
        this.habitat= "Wild";
    }

    public Animal(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}
