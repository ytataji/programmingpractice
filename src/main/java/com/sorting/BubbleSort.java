package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args){
        //BubbleSort bs = new BubbleSort();
        int arr [] = {5,4,3,2,1};
        bubbleSort(arr);
        //worst case tc is o(n2);
        //best case is o(n) -when array is already sorted.
        //space complexity is o(1) only
        System.out.println(Arrays.toString(arr));
    }
public static void bubbleSort(int [] arr){
        boolean flag=false;
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                    flag=true;//suppose given array 1,2,3,4,5 already sorted...so in first pass only we can understand that there is no swap..so it is already sorted and we dont need to check other passes
                }
            }
            if(!flag){
                break;
            }
        }

}
public static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
}

}
