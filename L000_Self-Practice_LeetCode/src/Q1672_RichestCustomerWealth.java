import java.util.ArrayList;
import java.util.List;

public class Q1672_RichestCustomerWealth {
  public static int maximumWealth(int[][] accounts) {
    int[] all = new int[accounts.length];
    for (int i = 0; i < accounts.length; i++) {
      int sum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        sum += accounts[i][j];
      }
      all[i] = sum;
    }
    int out = -1;
    for (int i = 0; i < all.length; i++) {
      out = Math.max(out, all[i]);
    }
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[][] in1 = new int[][] {{1,2,3}, {3,2,1}};
    System.out.println(maximumWealth(in1));

    int[][] in2 = new int[][] {{1,5}, {7,3}, {3,5}};
    System.out.println(maximumWealth(in2));

    int[][] in3 = new int[][] {{2,8,7}, {7,1,3}, {1,9,5}};
    System.out.println(maximumWealth(in3));
  }
}
