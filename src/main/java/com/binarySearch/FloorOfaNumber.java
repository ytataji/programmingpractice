package com.binarySearch;

public class FloorOfaNumber {
   // Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

   // Note: In case of multiple occurrences of floor of x, return the index of the last occurrence.

  //  Examples

  //  Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
   // Output: 1
  //  Explanation: Largest number less than or equal to 5 is 2, whose index is 1.
    public static void main(String[]args){
        FloorOfaNumber fn = new FloorOfaNumber();
        int [] arr = {1,2,8,10,10,12,19};
        int x=5;
        System.out.println(fn.findFloor(arr,x));
    }
    public int findFloor(int[] arr, int x) {
        // code here
        int l=0;
        int r=arr.length-1;
        int result=-1;
        while(l<=r){
            int mid=l+((r-l)/2);
            if(arr[mid]>x){
                r=r-1;
            }
            else{
                result=mid;
                l=l+1;
            }
        }
        return result;
    }

}

