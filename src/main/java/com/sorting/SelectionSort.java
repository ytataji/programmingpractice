package com.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String [] args){
        //BubbleSort bs = new BubbleSort();
        int arr [] = {5,4,3,2,1};
        SelectionSort(arr);
        //worst case tc is o(n2);
        //best case is o(n2) -when array is already sorted.
        //space complexity is o(1) only
        System.out.println(Arrays.toString(arr));
    }
    public static void SelectionSort(int [] arr){
     //simple find max from array then palce that max at end by swaping
        //reconsider remaining array..
        for(int i=0;i<arr.length;i++){
            int max=maxIndex(arr,0,arr.length-i-1);
            swap(arr,max,arr.length-i-1);
            }

        }
    public static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static int maxIndex(int [] arr,int start,int end){
        int max=arr[start];
        int maxindex1=0;
        for(int i=start+1;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
                maxindex1=i;
            }
        }
        return maxindex1;
    }

}
