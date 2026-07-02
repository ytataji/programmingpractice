package com.binarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfAnElement {
    public static void main(String[]args){
        FirstAndLastPositionOfAnElement fap = new FirstAndLastPositionOfAnElement();
        int [] nums = {5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(fap.searchRange(nums,target)));
    }
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;;
        int firstIndex=-1;
        int lastIndex=-1;
        firstIndex=  binarySearch(nums,target,true);
        lastIndex=  binarySearch(nums,target,false);
        return new int[]{firstIndex,lastIndex};
    }
    public static int binarySearch(int[] nums1, int target,boolean startIndex){
        int l=0;
        int r=nums1.length-1;
        int result=-1;
        while(l<=r){
            int mid = l+((r-l)/2);

            if(target>nums1[mid]){
                l=mid+1;
            }
            else if(target < nums1[mid]){
                r=mid-1;
            }
            else{
                result=mid;
                if(startIndex){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return result;
    }
}
