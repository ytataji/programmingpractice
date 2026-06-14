package org.example;

public class FactorialRecursion {
    public static void main(String[]args){
        FactorialRecursion obj = new FactorialRecursion();
       System.out.println(obj.factorial(5));

    }
int factorial(int n){
        if(n==1 || n==0)
            return 1;
        return n*factorial(n-1);

}

}
