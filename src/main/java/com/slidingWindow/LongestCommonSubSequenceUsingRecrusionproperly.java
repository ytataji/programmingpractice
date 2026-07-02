package com.slidingWindow;

public class LongestCommonSubSequenceUsingRecrusionproperly {
    //logic
    //example string1 ="abcde" , String2="ace";
    //check string1.charAt(0) == string2.charAt(0)--then increase count to 1
    //then compare string1.substring(1) and string2.substring(1)..if they matches..continue increasing count

    //if 2nd character does not match in strin1 to string2
    //then make two iteration calls like recursion(string1.substring(1),string2
    // other call is string1,string2.substring(1))
    //return max of both calls
    //base condition is if string1 or string2 is empty then return 0
    public static void main(String []args){
        LongestCommonSubSequenceUsingRecrusionproperly lcs= new LongestCommonSubSequenceUsingRecrusionproperly();
        String s1="abcde";
        String s2="ace";
        System.out.println(lcs.LCSReucrsion(s1,s2));
        System.out.println(lcs.LCSReucrsionsubsequence(s1,s2));
    }
    public static int LCSReucrsion(String s1,String s2){
        if(s1.isEmpty() || s2.isEmpty()){
            return 0;
        }
        char ch1 =s1.charAt(0);
        char ch2 =s2.charAt(0);
        if(ch1==ch2){
            return 1+LCSReucrsion(s1.substring(1),s2.substring(1));
        }
        else{
            return Math.max(LCSReucrsion(s1.substring(1),s2),LCSReucrsion(s1,s2.substring(1)));
        }
    }
    public static String LCSReucrsionsubsequence(String s1,String s2){
        if(s1.isEmpty() || s2.isEmpty()){
            return "";
        }
        char ch1 =s1.charAt(0);
        char ch2 =s2.charAt(0);
        if(ch1==ch2){
            return ch1+LCSReucrsionsubsequence(s1.substring(1),s2.substring(1));
        }
        else{

           String ans1= LCSReucrsionsubsequence(s1.substring(1),s2);
           String ans2=LCSReucrsionsubsequence(s1,s2.substring(1));
           if(ans1.length()>ans2.length()){
               return ans1;
           }
      else{
          return ans2;
           }

        }
    }

}
