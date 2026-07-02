package com.slidingWindow;

public class MaximumPointsObtainFromCards {

    public static void main(String[]args){
        //Problem
        //
        //You are given an array cardPoints and an integer k.
        //
        //You must pick exactly k cards from either the beginning or the end of the array.
        //
        //Return the maximum score you can obtain.
      //  cardPoints = [1,2,3,4,5,6,1]
      //  k = 3

        //approach
        //first take 3 points from start and 0 points from last
        //1+2+3 --> 6
        // 2 points from start 1 point from last
        // 1+2 +1-->5
        //repeat till 0 points from frist and 3 points from last

        //first we find the sum from left with size k

        int [] arr={6,2,3,4,7,2,1,7,1};
        int k=4;
        int leftsum=0;
        int rightsum=0;
        int leftFromLast=0;
        int finalsum=0;
        int maxsum=0;
        int rightFromFirst=k-1;
        int arrlen=arr.length;
        for(int i=0;i<=k-1;i++){
            leftsum=leftsum+arr[i];

        }
        int count=0;
       while(rightFromFirst>=0 || count<=k) {
           System.out.println("leftsum is:"+leftsum);
           System.out.println("rightsum is:"+rightsum);
           finalsum=leftsum+rightsum;
           System.out.println("final sum is:"+finalsum);
           maxsum=Math.max(finalsum,maxsum);
           if(count==k){
               break;
           }
           leftsum=leftsum-arr[rightFromFirst];
           rightFromFirst=rightFromFirst-1;
           rightsum=rightsum+arr[(arr.length-1)-count];
           count=count+1;
       }
        System.out.println("count is:"+count);
       System.out.println("maxsum is:"+maxsum);

    }
}
