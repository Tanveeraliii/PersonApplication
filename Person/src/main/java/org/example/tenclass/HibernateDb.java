package org.example.tenclass;

public class HibernateDb implements database{
    @Override
    public void setup() {
        System.out.println("Hibernate setup"+ timeout);
    }

    @Override
    public void connect() {
        System.out.println("Hibernate connect ");

    }

    @Override
    public void executeTransaction() {
        System.out.println("Hibernate executeTransaction");

    }

    @Override
    public void endSetup() {
        System.out.println("Hibernate endSetup");

    }
}

