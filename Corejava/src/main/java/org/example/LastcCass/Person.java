package org.example.LastcCass;

public class Person {
    private int age = 20;
    private static int salary = 2000;

    private String name = "bob";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Person.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +"Salary="+salary+
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        p1.setAge(18);
        p1.setName("Zain Bhai");
        p2.setAge(18);
        p2.setName("SalahUddin Bhai");
        p3.setSalary(20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }

}
