package com.testproject;

public class Main {

    public static void main(String[] args) {
        int a;
        byte b;
        double c;

        a=257;
        b=100;
        c=267.3245;
        //b = (byte) a;
        a = (int) c;

	    System.out.println(b + " and " +  a);

	    b = (byte)(b *2);
        System.out.println(b);

    }
}
