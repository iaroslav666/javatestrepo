package com.testproject;


public class TwoDArray {
    public static void main(String args[]) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < twoD.length; i++) {
            for (j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = k;
                k++;
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
