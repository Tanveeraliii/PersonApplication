package org.example.tenclass;

public class DataJpa implements database{

    @Override
    public void setup() {
        System.out.println("DataJpa setup "+ timeout);
    }

    @Override
    public void connect() {
        System.out.println("DataJpa connect "+ timeout);

    }

    @Override
    public void executeTransaction() {
        System.out.println("DataJpa excuteTransaction: "+ timeout);

    }

    @Override
    public void endSetup() {
        System.out.println("DataJpa endSetup: "+timeout);

    }
}
