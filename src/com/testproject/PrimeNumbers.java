package com.testproject;
import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int index;
        int i, j;
        boolean flag;

        do {
            flag = false;
            System.out.println("Please enter an integer");
            index = in.nextInt();
            if (index <= 1) {
                System.out.println("Inputted number should be more than 1, but you have typed " + index);
                flag = true;
            }
        }
        while(flag);

        {
            for (i=2; i <=index; i++) {
                flag = false;
                for (j=2; j<= i/2; j++) {
                    if ((i % j) == 0) {
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    System.out.print(i + "; ");
                }

            }
        }
    }
}