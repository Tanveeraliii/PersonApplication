package org.example.seven;

public class Apartment {
    private int rooms;
    private Address address;

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Apartment(int rooms, Address address) {
        this.rooms = rooms;
        this.address = address;

    }
    public void displayInfo(){

        System.out.println("Apartment with "+ rooms+ "rooms");
        System.out.println("Located as "+ address.getStreet()+","+address.getCity());
    }
}
