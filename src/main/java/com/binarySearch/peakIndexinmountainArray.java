package com.binarySearch;

public class peakIndexinmountainArray {
    public static void main(String[] args){
        peakIndexinmountainArray pia = new peakIndexinmountainArray();
        int [] arr = {0,1,0};
        System.out.println(pia.peakIndexInMountainArray(arr));
    }
    public int peakIndexInMountainArray(int[] arr) {
        int results = -1;
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid= l+((r-l)/2);
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                r=r-1;
            }
            else{
                l=l+1;
            }
        }
        return results;
    }
}
