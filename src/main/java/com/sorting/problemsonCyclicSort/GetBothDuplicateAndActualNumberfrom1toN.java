package com.sorting.problemsonCyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetBothDuplicateAndActualNumberfrom1toN {
public static void main(String [] args){
    //https://leetcode.com/problems/set-mismatch/
    int [] nums={1,2,2,4};
    List<Integer> al = DuplicateNumber(nums);
    int [] arr= new int[2];
    for(int i=0;i<al.size();i++){
        arr[i]=al.get(i);
    }
    System.out.println(Arrays.toString(arr));
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
