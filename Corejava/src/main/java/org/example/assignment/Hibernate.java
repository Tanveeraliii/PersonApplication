package org.example.assignment;
//public class Hibernate implements DatabaseInterface {
//    Boolean isConnected = false;
//
//    @Override
//    public void connect(String url, String username, String password) {
//        System.out.println("connecting to Hibernate.. ");
//        isConnected = true;
//
//    }
//
//    @Override
//    public void disconnect() {
//        if (isConnected = true) {
//        System.out.println("Disconnecting to Hibernate.. ");
//        isConnected = false;
//
//
//    }
//
//    @Override
//    public void saveData(String data) {
//            if (isConnected = true){
//                System.out.println(("Saving data to Hibernate.."+ data );
//            }
//            else {
//                System.out.println("Cannot save the Data. not connect to Hibarnate. ");
//            }
//        }
//
//    }
//
//    @Override
//    public void retrieveData() {
//        if (isConnected = true) {
//            System.out.println("Retrieving data from Hibernate: ");
//
//        } else {
//            System.out.println("Cannot retrieve Data. Not Connected to  Hibernate");
//
//
//        }
//
//}
//}




// Class implementing the DatabaseInterface for Hibernate
class Hibernate implements DatabaseInterface {
    private boolean isConnected = false;

    @Override
    public void connect(String url, String username, String password) {
        System.out.println("Connecting to Hibernate...");
        isConnected = true;
    }

    @Override
    public void disconnect() {
        if (isConnected) {
            System.out.println("Disconnecting from Hibernate...");
            isConnected = false;
        }
    }

    @Override
    public void saveData(String data) {
        if (isConnected) {
            System.out.println("Saving data to Hibernate: " + data);
        } else {
            System.out.println("Cannot save data. Not connected to Hibernate.");
        }
    }

    @Override
    public void retrieveData() {
        if (isConnected) {
            System.out.println("Retrieving data from Hibernate...");
        } else {
            System.out.println("Cannot retrieve data. Not connected to Hibernate.");
        }
    }
}