package com.sorting.problemsonCyclicSort;

import java.util.ArrayList;
import java.util.List;

public class MissingAllNumbersFrom1ToN {
    public static void main(String [] args){
        MissingAllNumbersFrom1ToN m  = new MissingAllNumbersFrom1ToN();
        int [] arr = new int[] {4,3,2,7,8,2,3,1};
        System.out.println(m.findDisappearedNumbers(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
                al.add(j+1);
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
