package org.example.nine;

public class B extends A{
    @Override     // Annotation
    public void show(int a) {
        super.show(a);
        System.out.println(2);
    }
}
