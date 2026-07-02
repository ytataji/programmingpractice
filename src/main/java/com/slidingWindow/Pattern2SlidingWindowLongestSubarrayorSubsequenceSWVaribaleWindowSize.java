package com.slidingWindow;

public class Pattern2SlidingWindowLongestSubarrayorSubsequenceSWVaribaleWindowSize {
    public static void main(String [] args){
        // here we don't have windows size..so longest subarray can be of size 1 or can be of size arr.lenght also...based on condition
        //example :Longest subarray where sum <=14

        int arr []= {2,5,1,10,10};
        int k=14;
        //here windows size is not given so..we should take it as 0 and increase windows size

            int l = 0;
            int r = 0;
            int maxsubarrayLen = 0;
            int sum = 0;
            int arrLen = arr.length;
            int leftans = 0;
            int rightans = 0;
            while (r < arrLen) {
                sum = sum + arr[r];
    System.out.println("sum is"+sum);
        while(sum > k & l<=r) {
                    sum = sum - arr[l];
                    l = l +1 ;
                } if(sum<=k) {
//below code is to compare maxsubarraylength and even store left and right indexs related to maxsubararyalength
                    if(maxsubarrayLen <(r - l + 1)){
                        maxsubarrayLen=(r-l+1);
                        //we can reomve below two line if subarray is not needed.
                        leftans = l;
                        rightans = r;

                    }
                    r = r + 1;

                }
            }
            System.out.println("maxsubarraylenght is:"+maxsubarrayLen);

            for(int i=leftans;i<=rightans;i++){
                System.out.print(arr[i]+" ");
            }

    }
}
