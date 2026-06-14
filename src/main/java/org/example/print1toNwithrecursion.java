package org.example;

public class print1toNwithrecursion {

public static void main(String[]args){
    print1toNwithrecursion obj= new print1toNwithrecursion();
    obj.print1toNNumbers(1,5);
}

 void print1toNNumbers(int start,int end){
    if(start>end)
        return;
    System.out.println(start);
     print1toNNumbers(start+1,end);
}
}
