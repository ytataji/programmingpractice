package org.example;

import java.util.ArrayList;

public class permutataionsusingRecursion {

    public static void main(String [] args){
        permutataionsusingRecursion obj= new permutataionsusingRecursion();
        obj.permutations("","abc");
        System.out.println(obj.permutationsUsingList("","abc"));
    }

    public void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch =up.charAt(0);
int x=p.length()+1;
        for(int i=0;i<p.length()+1;i++){
            permutations(p.substring(0,i)+ch+p.substring(i,x-1),up.substring(1));
        }
    }
    public ArrayList<String> permutationsUsingList(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> al =new ArrayList<String>();
           al.add(p);
            return al;
        }

        char ch =up.charAt(0);
        int x=p.length()+1;
        ArrayList<String> ans= new ArrayList<String>();
        for(int i=0;i<p.length()+1;i++){
          ans.addAll(permutationsUsingList(p.substring(0,i)+ch+p.substring(i,x-1),up.substring(1)));
        }
        return ans;
    }
}
