package com.testproject;


class IfSample {
    public static void main(String args[]){
       int x, y;

       x=10;
       y=20;

        System.out.println("x lower than y");
       x=x*2;

       if(x==y)
           System.out.println("x is equal to y");

       x=x*2;

       if(x>y)
           System.out.println("now x bigger than y");

       if(x==y)
           System.out.println("this will no be displyed");
    }
}
