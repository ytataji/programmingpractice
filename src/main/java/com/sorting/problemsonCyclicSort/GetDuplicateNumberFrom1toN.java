package com.sorting.problemsonCyclicSort;

import java.util.ArrayList;
import java.util.List;

public class GetDuplicateNumberFrom1toN {

    public static void main(String [] args)  {
        int nums[] = {1,3,4,2,2};
        int x =DuplicateNumber(nums).get(0);
        System.out.println(x);
    }

    public  static List<Integer> DuplicateNumber(int[] nums) {
        int n = nums.length;
        int i=0;
        List<Integer> al = new ArrayList<Integer>();
        while(i<n){
            if(nums[i]!=i+1 && nums[i]!=nums[(nums[i]-1)]){
                swap(nums,i,nums[i]-1);
            }
            else{
                i=i+1;
            }

        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                al.add(nums[j]);
            }
        }

        return al;
    }

    public static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
