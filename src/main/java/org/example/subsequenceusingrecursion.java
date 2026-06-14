package org.example;

public class subsequenceusingrecursion {
   public static void main(String[] args){

       subsequenceusingrecursion obj = new subsequenceusingrecursion();
       obj.subsequence("","abc");
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
}
