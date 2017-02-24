package com.testproject;
import java.util.Scanner;


public class Anagram {
    public static void main(String[] args){
        int i, j;
        char index;
        boolean flag;
        String first, second;
        char[] firstArrayOfChars, secondArrayOfChars;

        Scanner in = new Scanner(System.in);

        do {
            flag = false;
            System.out.println("Please enter first string");
            first = in.nextLine();
            System.out.println("Please enter second string");
            second = in.nextLine();
            if(first.length() != 0 && second.length() != 0)
                flag = true;
            else {
                first = first.replaceAll("\\s", "").toLowerCase();
                second = first.replaceAll("\\s", "").toLowerCase();

            }
        }
        while(!flag);

        firstArrayOfChars = first.toCharArray();
        secondArrayOfChars = second.toCharArray();

        if(firstArrayOfChars.length != secondArrayOfChars.length){
            System.out.println("The provided strings are not anagrams");
        }
        else{
            for(i=0; i<firstArrayOfChars.length; i++){
                for(j=0; j<=i; j++){
                    if(firstArrayOfChars[j]>firstArrayOfChars[i]) {
                        index = firstArrayOfChars[j];
                        firstArrayOfChars[j] = firstArrayOfChars[i];
                        firstArrayOfChars[i] = index;
                    }
                }
            }
            for(i=0; i<secondArrayOfChars.length; i++){
                for(j=0; j<=i; j++){
                    if(secondArrayOfChars[j]>secondArrayOfChars[i]) {
                        index = secondArrayOfChars[j];
                        secondArrayOfChars[j] = secondArrayOfChars[i];
                        secondArrayOfChars[i] = index;
                    }
                }
            }
            flag = false;
            for(i=0; i<firstArrayOfChars.length; i++){
                if(firstArrayOfChars[i] != secondArrayOfChars[i]){
                        System.out.println("The provided strings are not anagrams");
                        flag = true;
                        break;

                }
            }
            if(!flag)
                System.out.println("Provided strings are anagrams!");
        }
    }
}
