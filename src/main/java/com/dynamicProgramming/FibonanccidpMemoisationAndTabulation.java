package com.dynamicProgramming;

import java.util.Arrays;

public class FibonanccidpMemoisationAndTabulation {

    //memoisation is top down approach
    //in memoisation we store the values in dp array
   //suppose as part of fib(5) we calculate fib(4) and fib(3)
    //here as part of fib(4) we calculate fib(3) and fib(2)
    //but fib(3) is already calculated in fib(5) so we can use it
    //steps to follow
    //first create dp array with corresponding length in main function
    //then send that dp array to fib functiona as extra parameter compared to recursion
    //so now just do changes in recursion solution like
    //don't chnage base condtion
    //for remaining cases wherever calcuaation fib(n-2)+fib(n-1) need..before calcualtion first check whether value is availabe in dp array using dp[n]!=-1..if available just return it
    //if not available calucalte and assign it to dp array
    //then return dp array value

    public static void main(String [] args){
        FibonanccidpMemoisationAndTabulation f = new FibonanccidpMemoisationAndTabulation();

      int n=6;
      System.out.println(f.fib(n));
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f.fibMemoisation(n,dp));
        System.out.println(f.fibTabulation(n));
        System.out.println(f.fibTabulationSpaceOptimised(n));
    }
    public static int fib(int n){

        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fibMemoisation(int n,int [] dp){
//here time complexity is O(n) and space complexity is O(n)(stack fucntions related)+o(n)(array related)
        if(n==0 || n==1){
           return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= fib(n-1)+fib(n-2);
        return dp[n];
    }
    public static int fibTabulation(int n){
//here time complexity is O(n) and space complexity is o(n)(array related)
        if(n==0 || n==1){
            return n;
        }
        int [] dp = new int[n+1];
       dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
    public static int fibTabulationSpaceOptimised(int n){
        //here time complexity is O(n) and space complexity is o(1)
        if(n<=1){
            return n;
        }
        int previous2=0;
        int previous1=1;

        for(int i=2;i<=n;i++){
          int  current= previous1+previous2;
          previous2=previous1;
          previous1=current;

        }
        return previous1;
    }
}
