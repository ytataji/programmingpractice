package org.example;

import java.util.HashMap;

public class FirstNonRepeatingCharacter{

    //swiss

    //analysis -- s repeated 3 times w repeated 1 time i repeated 1 time..so choose w as first non repeating character

    //approach
    //count each character and put it in hashmap
    //now loop through string each and every character that count matches to 1 or not...so we will get proper non repeating character

    //program
    public static void main(String[] args){
        FirstNonRepeatingCharacter obj1= new FirstNonRepeatingCharacter();
        System.out.println(obj1.nonrepeatcharacter("siwss"));
        System.out.println(obj1.nthnonrepeatcharacter("siwss",1));
    }

    char nonrepeatcharacter(String s1){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char ch []= s1.toCharArray();
        for(char c:ch){
            if(hm.get(c)!=null){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        for(char c:ch){
            if(hm.get(c)==1){
                return c;
            }
        }
        return ' ';
    }
    char nthnonrepeatcharacter(String s1,int n){
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char ch []= s1.toCharArray();
        int count=0;
        for(char c:ch){
            if(hm.get(c)!=null){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        for(char c:ch){
            if(hm.get(c)==1){
                count=count+1;
                if(count==n){
                    return c;
                }
            }
        }
        return ' ';
    }
}
