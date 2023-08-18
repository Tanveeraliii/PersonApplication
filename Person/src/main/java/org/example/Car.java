package org.example;

public class Car extends Vehicle {
    private int numDoors;




    public Car(String type, int year) {
        super(type, year);
    }

    public Car(String type, int year, int numDoors) {
        super(type, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: "+ numDoors);
    }


}











//    private String model;

//    public Car() {
//    }

//    public Car(String make) {
//        this.make = make;
//    }

//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }
//
//    public String getMake() {
//        return make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void displayInfo(){
//        System.out.println(" Data is: "+ make+" "+model);
//    }
