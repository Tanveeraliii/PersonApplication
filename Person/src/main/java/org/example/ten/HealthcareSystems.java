package org.example.ten;

public class HealthcareSystems {
    public static void main(String[] args) {
        Person person1 = new Person("salah", 25);
        Person person2 = new Person("uddin",30);

        Patient patient = new Patient(5,"canceer");
        Doctor doctor = new Doctor("Cadionogy",52);
        patient.displayInfo();
        doctor.displayInfo();

    }
}
