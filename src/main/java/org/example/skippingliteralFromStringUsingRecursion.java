package org.example;

public class skippingliteralFromStringUsingRecursion {

    //question given string is baccad and literal is a
    //answer should be bccd
    public static void main(String[] args){
        skippingliteralFromStringUsingRecursion obj = new skippingliteralFromStringUsingRecursion();
      String skipped=  obj.skipcharFromAString("","baccad");
      System.out.println(skipped);

    }

    String skipcharFromAString(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            return processed;
        }
        char ch=unprocessed.charAt(0);
        if(ch=='a'){
          return  skipcharFromAString(processed,unprocessed.substring(1));
        }
        else{
            return  skipcharFromAString(processed+ch,unprocessed.substring(1));
        }
    }

}
