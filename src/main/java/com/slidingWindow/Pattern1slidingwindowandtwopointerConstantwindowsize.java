package com.slidingWindow;

public class Pattern1slidingwindowandtwopointerConstantwindowsize {

    public static void main(String [] args){
        //this problem is related to subarray or subsequence with constant windows size
        //find the subarray of length 4 which had max sum
        int arr [] = {-1,2,3,3,4,5,-1};
        int windowSize=4;
        //approach is simple
        //take two pointer left and right
        //take maxsum and sum variable
        //initially we should find out a sum for first window
        //then run a while loop with right pointer condition which can't cross array length
        // sum and compare with max sum

        int l=0;
        int r=windowSize-1;
        int sum=0;
        int arrLen=arr.length;
        int maxSum=0;
        for(int i=0;i<=r;i++){
           sum=sum+arr[i];
        }

        while(r<arrLen-1){

            maxSum=Math.max(maxSum,sum);
            sum=sum-arr[l];
            l=l+1;
            r=r+1;
            sum=sum+arr[r];

        }
        System.out.println(maxSum);
    }
}
