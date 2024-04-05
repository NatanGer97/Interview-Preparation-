package org.example;

public class BestTimeBuyAndSellStock {

  public static int maxProfit(int[] prices) {
    int minPriceBuy = prices[0];
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
      int currentDayPrice = prices[i];
      if (currentDayPrice < minPriceBuy) {
        minPriceBuy = currentDayPrice;
      } else {
        maxProfit = Math.max(maxProfit, currentDayPrice - minPriceBuy);
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
//    int[] prices = new int[] {7,1,5,3,6,4};
    int[] prices = new int[] {7,6,4,3,1};
    int maxProfit = BestTimeBuyAndSellStock.maxProfit(prices);
    System.out.println(maxProfit);

  }
}
