class Q121_BestTimeToBuyAndSellStock {
  public static int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int output = 0;
    int temp = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i];
      }
      temp = prices[i] - min;
      if (output < temp) {
        output = temp;
      }
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] prices = new int[] {7, 1, 5, 3, 6, 4};
    int[] prices2 = new int[] {7, 6, 4, 3, 1};
    int[] test = new int[] {5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 5000, 
      1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 
      100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 
      10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000};
    int[] prices4 = new int[] {2, 4, 1};  // 154/212
    int output = Q121_BestTimeToBuyAndSellStock.maxProfit(prices);
    int output2 = Q121_BestTimeToBuyAndSellStock.maxProfit(prices2);
    int output3 = Q121_BestTimeToBuyAndSellStock.maxProfit(test);
    int output4 = Q121_BestTimeToBuyAndSellStock.maxProfit(prices4);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
  }
}