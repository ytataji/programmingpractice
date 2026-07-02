package com.binarySearch;

public class FindelementinRotatedarray {
    public static void main(String [] args){
        FindelementinRotatedarray fe = new FindelementinRotatedarray();
        int [] nums = {4,5,6,7,0,1,2};//anlyse this array with getpivotindex condtions..we will understadn rotated array
        //here we won't move r we only move l till we get pivot
        int target=0;
        System.out.println(fe.search(nums,target));
    }
    public int search(int[] nums, int target) {
        int x=  getPivotIndex(nums);
        int ans=binarysearch(nums,0,x,target);
        if(ans==-1){
            ans=binarysearch(nums,x,nums.length-1,target);
        }
        return ans;
    }
    public static int getPivotIndex(int[] nums){
        int l=0;
        int r=nums.length-1;
        int results=-1;

        while(l<=r){
            // The current subarray is already sorted,
            // the minimum is at the low index
            if(nums[l]<=nums[r]){
                return l;
            }

            int mid= l+((r-l)/2);
            // The right half is not sorted. So
            // the minimum element must be in the
            // right half
            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            // The right half is sorted. Note that in
            // this case, we do not change high to mid - 1
            // but keep it to mid. The mid element
            // itself can be the smallest
            else{
                r=mid;
            }

        }
        return l;
    }
    public static int binarysearch(int[] nums,int l,int r,int target){
        int result =-1;
        while(l<=r){
            int mid = l+((r-l)/2);
            if(nums[mid]==target){
                return mid;
            }
            else if(target > nums[mid]){
                l=l+1;
            }
            else{
                r=r-1;
            }
        }
        return result;
    }

}
