package org.example.assignment;

public class MainInterface {
    public static void main(String[] args) {
        DatabaseInterface db = new Hibernate();
        DatabaseInterface db2 = new DataJPA();

        db.connect("hibernate_URL", "Hibernate_user", "Hibernate_password");
        db.saveData("'Some Data for Hibernate'");
        db.retrieveData();
        db.disconnect();

        db2.connect("dataJPA_URL", "DataJPA_user", "DataJPA_password");
        db2.saveData("'Some Data for DataJPA'");
        db2.retrieveData();
        db2.disconnect();
    }
}
