package com.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String [] args){
        String str="abcdeabcbbabcdef";
        int l=0;
        int r=0;
        int strlen=str.length();
                String subStr="";
                String longestSubString="";
                int maxLen=0;
                int SubStringlen=0;
                int leftans=0;
                int rightans=0;
HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        while(r<strlen){
            char ch=str.charAt(r);
            //why we are adding l<=hm.get(ch) because if l>hm.get(ch) the it won't come under that windows..so you don't need to consider as duplicate and update l value
            if(hm.containsKey(ch) && l<=hm.get(ch)){
                int index=hm.get(ch);
                l=index+1;


            }

            hm.put(ch,r);
            SubStringlen=r-l+1;



            //maxLen=Math.max(SubStringlen,maxLen);
    if(SubStringlen>maxLen){
        maxLen=SubStringlen;
        leftans=l;
        rightans=r;
    }

            r=r+1;


        }

    System.out.println("longestSubString is"+str.substring(leftans,rightans+1));
    }

    public static boolean isContainDuplicate(String s){
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(!hs.add(s.charAt(i))){
                return true;

            }
        }
return false;
    }
}
