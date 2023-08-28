package org.example.asng9program2;

public class Job {
    private String title;
    private double salary;

    public Job(String title, double salary) {
        this.title = title;
        salary = salary;
    }

    public Job() {

    }

    public void displayJobInfo(){
        System.out.println("title: "+ title);
        System.out.println( "Salary: "+ salary);
    }
}
