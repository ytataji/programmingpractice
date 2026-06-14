package org.example;

public class fibnaocciRecursion {
//fibnocci series 0,1,1,2,3,5
    //0th is 0
    //1st is 1
    //2nd is 1
    //3rd is 2
    public static void main(String[] args){
        fibnaocciRecursion obj = new fibnaocciRecursion();
      System.out.println(obj.fibnocci(3));
    }
    int fibnocci(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibnocci(n-2)+fibnocci(n-1);
    }


}
