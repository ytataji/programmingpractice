package org.example;

public class skipsomepartoftheStringfromgivenString

{
public static void main(String [] args){
    skipsomepartoftheStringfromgivenString obj = new skipsomepartoftheStringfromgivenString();
    String ans = obj.skipAppleusingIteration("tatajiapplemounika");
    System.out.println(ans);
    String ans1=obj.skipAppleUsingRecursion("","tatajiMounikaapple");
    System.out.println(ans1);
}
    //example...skip apple from given string tatajiappleMounika

String skipAppleUsingRecursion(String processed,String unprocessed){
    if(unprocessed.isEmpty()){
        return processed;
    }
    char ch= unprocessed.charAt(0);
    if(unprocessed.startsWith("apple")){
      return  skipAppleUsingRecursion(processed,unprocessed.substring("apple".length()));
    }
    else{
       return skipAppleUsingRecursion(processed+ch,unprocessed.substring(1));
    }
}

    String skipAppleusingIteration(String actual){
      if(actual.contains("apple")){
          int index=actual.indexOf("apple");
          return actual.substring(0,index)+actual.substring(index+5);
      }
      return actual;
    }
}
