package com.binarySearch;

public class CielingOfANumber {
   // Given a sorted array arr[] and an integer x, find the index (0-based) of the smallest element in arr[] that is greater than or equal to x. This element is called the ceil of x. If such an element does not exist, return -1.

  //  Note: In case of multiple occurrences of ceil of x, return the index of the first occurrence.

  //  Examples

  //  Input: arr[] = [1, 2, 8, 10, 11, 12, 19], x = 5
  //  Output: 2
  //  Explanation: Smallest number greater than 5 is 8, whose index is 2.
public static void main(String [] args){
    CielingOfANumber cn = new CielingOfANumber();
    int [] arr = {1,2,8,10,10,12,19};
    int x=5;
    System.out.println(cn.findCeil(arr,x));
}
    public int findCeil(int[] arr, int x) {
        // code here
        int l=0;
        int r=arr.length-1;
        int result=-1;
        while(l<=r){
            int mid= l+((r-l)/2);
            if(arr[mid]<x){
                l=l+1;
            }
            else{
                result=mid;
                r=r-1;
            }
        }
        return result;
    }
}
