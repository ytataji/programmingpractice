package com.patternproblems;

public class pattern2 {
    public static void main(String [] args){
    for(int row=1;row<=7;row=row+1){
        for(int column=1;column<=row;column=column+1){
            System.out.print("* ");
        }
        System.out.println();
    }

    System.out.println("---------------------");

        for(int row=7;row>=1;row=row-1){
            for(int column=1;column<=row;column=column+1){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        for(int row=1;row<=7;row=row+1){
            for(int column=0;column<row;column=column+1){
                char ch=(char)('A'+column);
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        for(int row=7;row>=1;row=row-1){
            for(int column=0;column<row;column=column+1){
                char ch=(char)('A'+column);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
