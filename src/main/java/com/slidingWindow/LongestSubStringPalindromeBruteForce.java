package com.slidingWindow;

public class LongestSubStringPalindromeBruteForce {
public static void main(String[] args){
    LongestSubStringPalindromeBruteForce l=new LongestSubStringPalindromeBruteForce();
    String s="civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
    System.out.println(l.longestPalindromeWithBruteForce(s));
}


    public String longestPalindromeWithBruteForce(String s) {
        //problem: b,ba,bab,baba,babad,ab,aba,abad,ba,bad,ad,babad
        //bruteforce approach ..find all the substrings and find palindrome or not
        //finding all substrings and check each substring is palindrome or not..if it is palindrome then finding the palindrome with maxlength;
        //it will faile because due to limited time for exeuction
        //so"

        String longestSubString="";

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                // System.out.println(s.substring(i,j+1));
                String substr=s.substring(i,j+1);
                if(isPalindrome(substr)){
                    if(substr.length()>longestSubString.length()){
                        longestSubString=substr;
                    }
                }
            }
        }
        return longestSubString;
    }
    public static boolean isPalindrome(String s){
        if(s.equals(revesedString(s))){
            return true;
        }
        else{
            return false;
        }
    }
    public static String revesedString(String s){
        String reverseString="";
        for(int i=s.length()-1;i>=0;i--){
            reverseString=reverseString+s.charAt(i);
        }
        return reverseString;
    }
}
