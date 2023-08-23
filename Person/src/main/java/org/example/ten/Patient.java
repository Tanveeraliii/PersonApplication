package org.example.ten;

public class Patient extends Person{
    private int patientId;
    private String medicalCondition;


    public Patient(int patientId, String medicalCondition) {
        this.patientId = patientId;
        this.medicalCondition = medicalCondition;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
    public void displayInfo(){

    }

    public Patient() {
        super();
    }

}
