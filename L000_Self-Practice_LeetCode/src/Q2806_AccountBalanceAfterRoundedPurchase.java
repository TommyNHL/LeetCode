public class Q2806_AccountBalanceAfterRoundedPurchase {
  public static int accountBalanceAfterPurchase(int purchaseAmount) {
    double spending = Math.round((double) purchaseAmount/10);
    int output = 100 - ((int) spending)*10;
    return output;
  }
  // ---------------------------------------------------------------------------
  public static int accountBalanceAfterPurchase2(int purchaseAmount) {
    return 100 - roundedAmount(purchaseAmount);
  }
  public static int roundedAmount(int amount) {
    return amount % 10 < 5 ? amount / 10 * 10 : (amount / 10 + 1) * 10;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int purchaseAmount1 = 9;
    int purchaseAmount2 = 15;
    int purchaseAmount3 = 11;
    System.out.println(Q2806_AccountBalanceAfterRoundedPurchase.accountBalanceAfterPurchase(purchaseAmount1));
    System.out.println(Q2806_AccountBalanceAfterRoundedPurchase.accountBalanceAfterPurchase(purchaseAmount2));
    System.out.println(Q2806_AccountBalanceAfterRoundedPurchase.accountBalanceAfterPurchase2(purchaseAmount3));
  }
}