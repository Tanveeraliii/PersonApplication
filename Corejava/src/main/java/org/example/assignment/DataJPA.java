package org.example.assignment;

public class DataJPA implements DatabaseInterface{
    private boolean isConnected = false;

    @Override
    public void connect(String url, String username, String password) {
        System.out.println("Connecting to Data JPA");
        isConnected = false;

    }

    @Override
    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnected to Data JPA..");
            isConnected = false;
        }

    }

    @Override
    public void saveData(String data) {
        if (isConnected == true) {
            System.out.println("Saving data to DATA JPA: " + data);
        } else {
            System.out.println("Cannot Save Data. Not Connected to DATA JPA");
        }

    }

    @Override
    public void retrieveData() {
        if (isConnected == true) {
            System.out.println("Retrieving data from DATA JPA: ");
        } else {
            System.out.println("Cannot retrieve Data. Not Connected to DATA JPA");
        }

    }



}
