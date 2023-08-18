package org.example;

public class Vehicle {
    private String type;
    private int year;

//    public void displayInfo(){
//        System.out.println("Types: "+ type);
//        System.out.println("Year: "+ year);



    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Types: " + type);
        System.out.println("Year: " + year);

    }



}
