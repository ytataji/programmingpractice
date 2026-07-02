package com.sorting;

import java.util.Arrays;

public class CyclicSort {
    //when numbers are from [0,N] or [1,N]
public static void main(String [] args){
    int arr []= {5,4,3,2,1};
    CyclicSort.cyclic1toN(arr);
    int arr1 []= {4,3,2,1,0};
    CyclicSort.cyclic0toN(arr1);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr1));
}

    public static void cyclic1toN(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            }
            else{
                i=i+1;
            }
        }
    }
    public static void cyclic0toN(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i) {
                swap(arr, i, arr[i]);
            }
            else{
                i=i+1;
            }
        }
    }
    public static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
