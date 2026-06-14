package org.example;

import java.util.ArrayList;

public class subsequenceusingrecursion {
   public static void main(String[] args){

       subsequenceusingrecursion obj = new subsequenceusingrecursion();
       obj.subsequence("","abc");
      ArrayList<String> subse= obj.returnlistofsubsequences("","abc");
      System.out.println(subse);
   }

   void subsequence(String p, String up){
       if(up.isEmpty()){
           System.out.print(p+" ");
           return;
       }
       char ch=up.charAt(0);
       subsequence(p+ch,up.substring(1));
       subsequence(p,up.substring(1));

   }
   ArrayList<String> returnlistofsubsequences(String p, String up){
       if(up.isEmpty()){
           ArrayList<String> al = new ArrayList<String>();
           al.add(p);
           return al;
       }
       char ch =up.charAt(0);
     ArrayList<String> left=  returnlistofsubsequences(p,up.substring(1));
       ArrayList<String> right=returnlistofsubsequences(p+ch,up.substring(1));
       left.addAll(right);
return left;
   }
}
