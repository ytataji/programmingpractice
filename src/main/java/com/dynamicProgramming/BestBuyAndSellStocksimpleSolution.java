package com.dynamicProgramming;

public class BestBuyAndSellStocksimpleSolution {
    //here approach is min is always in the array left to current selling day
    public static void main(String[]args){
        BestBuyAndSellStocksimpleSolution bss = new BestBuyAndSellStocksimpleSolution();
        int [] prices = {7,1,5,3,6,4};
        System.out.println(bss.getMaxProfit(prices));
    }
    public static int getMaxProfit(int [] prices){
        int max=0;
        int min = prices[0];
        for(int i=1;i<prices.length;i++){
            int profitorLoss= prices[i]-min;
            max=Math.max(max,profitorLoss);
            min=Math.min(min,prices[i]);

        }
        return max;
    }
}
