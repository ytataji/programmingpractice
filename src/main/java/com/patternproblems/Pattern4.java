package com.patternproblems;

public class Pattern4 {
    public static void main(String [] args) {
        int n = 7;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if(i<=7){
                for (int j = 7; j >= i; j--) {
                    System.out.print("* ");
                }
            }
               else{
            for (int j = 1; j <= i - (n - 1); j++) {
                System.out.print("* ");
            }
               }
            System.out.println();
        }
    }
}
