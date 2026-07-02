package com.patternproblems;

public class Pattern5 {
    public static void main(String [] args){
        for(int i=1;i<=13;i=i+2){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print("*"+"");
                }
                else{
                    System.out.print(j+"");
                }

            }
            System.out.println();
        }
    }
}
