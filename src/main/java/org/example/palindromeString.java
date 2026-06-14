package org.example;

public class palindromeString {
   static palindromeString p1 ;
    public static void main(String [] args){
        p1=new palindromeString();
        System.out.println(p1.isPalindrome("amma"));
    }

    boolean isPalindrome(String s1){
        StringBuilder reversed=p1.stringReversememoryefficient(s1);

        if(reversed.toString().equals(s1)){
            return true;
        }
        else{
            return false;
        }

    }


    StringBuilder stringReversememoryefficient(String original){
        int strLen=original.length();
        StringBuilder sb= new StringBuilder(strLen);
        for(int i=strLen-1;i>=0;i--){
            sb.append(original.charAt(i));


        }

        return sb;

    }
}
