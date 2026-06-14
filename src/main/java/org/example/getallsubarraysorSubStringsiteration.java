package org.example;

import java.util.ArrayList;

public class getallsubarraysorSubStringsiteration {
//subarray is nothing but elements should be contingous and should follow the order as original array or string.
    public static void main(String[]args){
        getallsubarraysorSubStringsiteration obj = new getallsubarraysorSubStringsiteration();
        int arr []={1,2,3,4};
        String s="abcd";
        obj.subarrays(arr);
        System.out.println();
        obj.subStrings(s);
    }

    void subarrays(int [] arr){
       int len= arr.length;

       //here idea is getting different array from some start index to some end index
        //we use i for start index , j to give end index, k will simplyt take start and end index will print all items in between start and end
        for(int i=0;i<len;i++){

            for(int j=i;j<len;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");

                }
                System.out.print("]");
            }


        }
    }
    void subStrings(String s){
        char [] arr=s.toCharArray();
        int len= arr.length;
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0;i<len;i++){

            for(int j=i;j<len;j++){
            String s1="";
                for(int k=i;k<=j;k++){
                   s1=s1+arr[k];

                }
                al.add(s1);
            }


        }
        System.out.println(al);
    }
}
