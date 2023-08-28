package org.example.tenclass;

public interface database {
    public abstract void setup();     //Setup method
    public abstract void connect();     //connect method
    public abstract void executeTransaction();  // executeTaransaction method
    public abstract void endSetup();            //endSetup

    public static final int timeout = 120;

}
