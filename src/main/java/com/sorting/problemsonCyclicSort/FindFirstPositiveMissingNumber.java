package com.sorting.problemsonCyclicSort;

public class FindFirstPositiveMissingNumber {

    public static void main(String [] args){
        int [] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
        //some test cases are being failed...redo the problem.
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            if(nums[i]!=i && nums[i]>=0 && nums[i]<n){
                swap(nums,i,nums[i]);

            }
            else{
                i=i+1;
            }
        }
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return n;
    }
    public static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
