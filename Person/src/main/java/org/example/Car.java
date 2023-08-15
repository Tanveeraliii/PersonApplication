package org.example;

public class Car {
    private String make;
    private String model;

    public Car() {
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void displayInfo(){
        System.out.println(" Data is: "+ make+" "+model);
    }
}