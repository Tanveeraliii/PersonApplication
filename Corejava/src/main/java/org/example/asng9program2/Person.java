package org.example.asng9program2;

public class Person {
    private String name;
    private int age;
    private Job job;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        job.displayJobInfo();
    }

}
