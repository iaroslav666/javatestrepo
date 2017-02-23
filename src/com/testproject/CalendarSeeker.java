package com.testproject;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class CalendarSeeker {
    public static void main(String[] args){
        System.out.println("Please enter the date in next format MM//DD//YYYY");
        Scanner in = new Scanner(System.in);
        String inputtedString = in.nextLine();
        String[] inputtedArrayOfStrings = inputtedString.split("//");
        int[] ArrayOfNumbers = new int[inputtedArrayOfStrings.length];
        int i;

        for (i=0; i<inputtedArrayOfStrings.length; i++) {
            //if (inputtedArrayOfStrings[i])
            ArrayOfNumbers[i] = Integer.parseInt(inputtedArrayOfStrings[i].replaceAll("[^0-9]", ""));
        }

        Calendar calendar = new GregorianCalendar();


    }
}
