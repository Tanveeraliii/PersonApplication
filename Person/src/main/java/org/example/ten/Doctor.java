package org.example.ten;

public class Doctor extends Person {
    private  String specialization;
    private  int doctorId;

    public Doctor(String specialization, int doctorId) {
        this.specialization = specialization;
        this.doctorId = doctorId;
    }

    public Doctor(String name, int age, String specialization, int doctorId) {
        super(name, age);
        this.specialization = specialization;
        this.doctorId = doctorId;

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: "+ specialization);
        System.out.println("DoctorID: "+ doctorId);
    }
}
