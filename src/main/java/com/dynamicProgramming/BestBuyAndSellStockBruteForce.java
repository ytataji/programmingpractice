package com.dynamicProgramming;

public class BestBuyAndSellStockBruteForce {
    public static void main(String[]args)
    {
        BestBuyAndSellStockBruteForce bf = new BestBuyAndSellStockBruteForce();
        int [] prices = {7,1,5,3,6,4};
        System.out.println(bf.getMaxProfit(prices));
        //we will get Timelimitexceede for this..if we give large array
    }
    public static int getMaxProfit(int [] prices){
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(j>i && (prices[j]-prices[i])>=max){
                    max=prices[j]-prices[i];
                }
            }
        }
        return max;
    }

}
