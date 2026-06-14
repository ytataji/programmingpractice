package org.example;

import java.util.ArrayList;

public class getsubsequenceofanyarrayorString {
    //here elements may or maynot contigous but order should be preserved.
public static void main(String[]args){
    getsubsequenceofanyarrayorString obj= new getsubsequenceofanyarrayorString();
    obj.getSubSequenceofString("abcd");
}

    void getSubSequenceofString(String s){
     //idea is to add a single character to list and add that character to all the element in that existing list
        // example: suppose string is abcd...a is already in list as a first iteration.then we will add b and then add that b to existing list it will become a,b,ab
        //in next iteration we will add c and add c to existing list also ....it will become a,b,ab,c,ac,bc,abc
        //in next iteration we will add d and add d to existing list also...it will become a,b,ab,c,ac,bc,abc,d,ad,bd,abd,cd,acd,bcd,abcd...no of subsequences are 2^n -1 =15 here
        ArrayList<String> al= new ArrayList<String>();


        for(int charindex=0;charindex<s.length();charindex++){
          int listlen= al.size();
        String  ch =s.substring(charindex,charindex+1);//to get individual each character each time..first iteration we will get a next b next c and next d
            al.add(ch);
            for(int i=0;i<listlen;i++){
                al.add(al.get(i)+ch);
            }
        }

    System.out.println(al);

    }
}
