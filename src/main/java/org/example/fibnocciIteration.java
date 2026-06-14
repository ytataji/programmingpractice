package org.example;

import java.util.Arrays;

public class fibnocciIteration {

    public static void main(String [] args){

        fibnocciIteration obj= new fibnocciIteration();
        System.out.println(Arrays.toString(obj.fibnocci(5)));
    }

    int[] fibnocci(int n){
        int [] arr= new int[n];

         arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        return arr;
    }
}
