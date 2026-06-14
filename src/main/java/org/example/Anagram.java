package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
public static void main(String[] args){

    Anagram obj1= new Anagram();
    System.out.println(obj1.isAnagramUsingSorting("listen","silent"));
    System.out.println(obj1.isAnagramUsingHashMap("listen","silent"));
}


//we can do this in two ways using sorting arrays or using hashmap
    boolean isAnagramUsingSorting(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
       char [] ch1= s1.toCharArray();
        char [] ch2= s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);

    }
    boolean isAnagramUsingHashMap(String s1,String s2){

    if(s1.length()!=s2.length()){
        return false;
    }
    HashMap<Character,Integer>   hm = new HashMap<Character,Integer>();
        char ch1 []=s1.toCharArray();
    for(char ch:ch1){

        if(hm.get(ch)!=null){
            hm.put(ch,hm.get(ch)+1);

        }
        else{      hm.put(ch,1);;
        }
    }

        char ch2[]=s2.toCharArray();
    for(char ch:ch2){
        if(hm.get(ch)!=null){
            if(hm.get(ch)==1){
                hm.remove(ch);
            }
            else{
            hm.put(ch,hm.get(ch)-1);}
        }
        else{
            return false;
        }
    }
    return hm.isEmpty();
    }


}

