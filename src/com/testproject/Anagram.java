package com.testproject;
import java.util.Scanner;

/**
 * Created by iaroslav.goliiad on 2/22/2017.
 */
public class Anagram {
    public static void main(String[] args){
        char[] firstArrayOfChars, secondArrayOfChars;
        int i, j;
        char index;
        boolean flag;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter first string");
        String first = in.nextLine();
        System.out.println("Please enter second string");
        String second = in.nextLine();

        first = first.replaceAll("\\s","").toLowerCase();
        second = first.replaceAll("\\s","").toLowerCase();
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
