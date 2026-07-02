package com.slidingWindow;

import java.util.ArrayList;

public class LongestCommonSubSequencesWithBruteForceIteration {
    public static void main(String[]args){
        LongestCommonSubSequencesWithBruteForceIteration lcs = new LongestCommonSubSequencesWithBruteForceIteration();
        String text1="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String text2="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(lcs.longestCommonSubsequence(text1,text2));
        //we will face same stackoverflow error although we use recursion to get all subsequences
        //Here we should not generate all the subsequnces  i think..we should think about which subsequences are needed first...
    }
    public int longestCommonSubsequence(String text1, String text2) {
        ArrayList<String> al1 = getAllSubSequences(text1);
        ArrayList<String> al2 = getAllSubSequences(text2);
        int maxlen=0;
        if(al2.size()>=al1.size()){
            for(int i=0;i<al1.size();i++){
                if(al2.contains(al1.get(i))){
                    if(al1.get(i).length()>maxlen){
                        maxlen=al1.get(i).length();
                    }
                }
            }
        }
        else{
            for(int i=0;i<al2.size();i++){
                if(al1.contains(al2.get(i))){
                    if(al2.get(i).length()>maxlen){
                        maxlen=al2.get(i).length();
                    }
                }
            }
        }
        return maxlen;
    }
    public static ArrayList<String> getAllSubSequences(String text1){
        ArrayList al1 = new ArrayList();
        for(int i=0;i<text1.length();i++){
            int size=al1.size();
            String ch =text1.charAt(i)+"";
            al1.add(ch);
            for(int j=0;j<size;j++){
                al1.add(al1.get(j)+ch);
            }

        }
        return al1;
    }

    public static ArrayList<String> getAllSubSequencesUsingRecursion(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> al= new ArrayList<String>();
            al.add(p);

            return al;
        }
        char ch =up.charAt(0);
        ArrayList<String> ansleft= getAllSubSequencesUsingRecursion(p+ch,up.substring(1));
        ArrayList<String> ansright=getAllSubSequencesUsingRecursion(p,up.substring(1));
        ansleft.addAll(ansright);
        return ansleft;


    }
}
