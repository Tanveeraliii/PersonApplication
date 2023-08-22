package org.example.seven;

public class House {
    private int bedrooms;
    private Address address;

    public House() {
    }

    public House(int bedrooms, Address address) {
        this.bedrooms = bedrooms;
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("House with "+bedrooms+"bedrooms");
//        System.out.println("House with " + String.valueOf(bedrooms) + "bedrooms");
        System.out.println("Located at "+ address.getStreet()+","+ address.getCity());

    }
}
