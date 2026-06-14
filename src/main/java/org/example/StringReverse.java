package org.example;

import java.util.Arrays;

public class StringReverse {

    public static void main (String [] args){
   System.out.println("Amma");
        StringReverse obj1= new StringReverse();
       String reverse= obj1.stringReverse("tataji");
       System.out.println(reverse);
        System.out.println(obj1.stringReversememoryefficient("tataji"));
        System.out.println(Arrays.toString(obj1.stringReversechararray("tataji") ));
    }

//below space complexity is o(n2)--because everytime new object will be crated when new character added...so n*n characters o(n2)
    //so best way to use a new Stringbuilder and use it to store reversed string
    //we can do it in chararray approach also
    String stringReverse(String original){
        int strLen=original.length();
        for(int i=strLen-1;i>=0;i--){
          original=original+original.charAt(i);


        }

        return original.substring(strLen);

    }
    StringBuilder stringReversememoryefficient(String original){
        int strLen=original.length();
        StringBuilder sb= new StringBuilder(strLen);
        for(int i=strLen-1;i>=0;i--){
        sb.append(original.charAt(i));


        }

        return sb;

    }

    char[]  stringReversechararray(String original){
        char ch[] =original.toCharArray();
        int left= 0;
        int right=ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

        }
        return ch;
    }
}


