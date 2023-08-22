package org.example;

public class PolyOne {
    public void show(int a){
        System.out.println("Int method is called");
    }


    public void show(String a){

        System.out.println("Float method is called ");
    }

    public static void main(String[] args) {
        PolyOne ob = new PolyOne();
        ob.show('c');
    }

}
