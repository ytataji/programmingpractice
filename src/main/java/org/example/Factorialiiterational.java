package org.example;

public class Factorialiiterational {

public static void main(String[]args){
    Factorialiiterational obj = new Factorialiiterational();
   System.out.println(obj.factorial(5));
}


    int factorial(int n){
        if(n==1 || n==0)
            return 1;
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
}


