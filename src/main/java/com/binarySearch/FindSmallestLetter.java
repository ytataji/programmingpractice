package com.binarySearch;

public class FindSmallestLetter {
public static void main(String [] args){
    FindSmallestLetter fs = new FindSmallestLetter();
    char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char target='z';
    System.out.println(fs.nextGreatestLetter(letters,target));
}
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int r=letters.length-1;
        char result=letters[0];
        while(l<=r){
            int mid= l+((r-l)/2);

            if(letters[mid]<=target){
                l=l+1;
            }
            else{
                result=letters[mid];
                r=r-1;

            }


        }
        return result;
    }
}
