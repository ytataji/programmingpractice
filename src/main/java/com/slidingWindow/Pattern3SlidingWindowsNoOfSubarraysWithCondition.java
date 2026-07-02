package com.slidingWindow;

public class Pattern3SlidingWindowsNoOfSubarraysWithCondition {
    public static void main(String[]args){
//example : No of subarrays with sum=k
        //when it is sum<=k ..it is just a small modification of longestsubsequence problem
        //but when sum is constanct number

        //approach is below
        //find no of subarray with sum<=k;
        //find no of subarray with sum<=k-1;
        //then substract both to get no of subarray with sum=k
    }
}
