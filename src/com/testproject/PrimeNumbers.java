package com.testproject;
import java.util.Scanner;

/**
 * Created by iaroslav.goliiad on 2/22/2017.
 */
public class PrimeNumbers {
    public static void main(String[] args){
        System.out.println("Please enter an integer");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        int i, j;
        boolean flag;

        if (index <= 1) {
            System.out.print("Inputted number should be more than 1, but you have typed " + index);
        } else {
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