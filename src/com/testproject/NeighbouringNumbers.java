package com.testproject;
import java.util.Scanner;

/**
 * Created by iaroslav.goliiad on 2/22/2017.
 */
public class NeighbouringNumbers {
    public static void main(String[] args){
        System.out.println("Please enter numbers separated by spaces");
        Scanner in = new Scanner(System.in);
        String inputtedString = in.nextLine();
        String[] inputtedArrayOfStrings = inputtedString.split("\\s+");
        int[] ArrayOfNumbers = new int[inputtedArrayOfStrings.length];
        int[] diffs = new int[ArrayOfNumbers.length-1];
        int i, j, minValue, index;

        for (i=0; i<inputtedArrayOfStrings.length; i++){
            ArrayOfNumbers[i] = Integer.parseInt(inputtedArrayOfStrings[i].replaceAll("[^0-9]", ""));
        }
        if(ArrayOfNumbers.length<2)
            System.out.println("Entered numbers should be more than two");
        else{
            for(i=0; i<ArrayOfNumbers.length-1; i++) {
                diffs[i] = Math.abs(ArrayOfNumbers[i] - ArrayOfNumbers[i+1]);
            }
            index = 0;
            for(i=0; i<diffs.length; i++){
                minValue = diffs[0];
                if(minValue>diffs[i]) {
                    minValue = diffs[i];
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
}
