public class Q1420_BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {
  public static int numOfArrays2(int n, int m, int k) {
    // n, length of array
    // m, max value of each element
    // k, seacrh exactly k times
    int output = 0;
    int max_val = m;
    int max_idx = -1;
    int counter = 0;
    int[] arr = new int[n];
    if (counter < k) {
      for (int i = 0; i < arr.length; i++) {
        if (max_val < arr[i]) {
          max_val = arr[i];
          max_idx = i;
          counter += 1;
        }
      }
    }
    return output;
  }
  public static int numOfArrays(int n, int m, int k) {
    final int mod = 1000000007;

    int[][] dp = new int[m+1][k+1];
    int[][] prefix = new int[m+1][k+1];
    int[][] prevDp = new int[m+1][k+1];
    int[][] prevPrefix = new int[m+1][k+1];

    for (int j = 1; j <= m; j++) {
      prevDp[j][1] = 1;
      prevPrefix[j][1] = j;
    }

    for (int i = 2; i <= n; i++) {
      for (int maxNum = 1; maxNum <= m; maxNum++) {
        for (int cost = 1; cost <= k; cost++) {
          dp[maxNum][cost] = (int)(((long)maxNum * prevDp[maxNum][cost]) % mod);
          if (maxNum > 1 && cost > 1) {
            dp[maxNum][cost] = (dp[maxNum][cost] + prevPrefix[maxNum - 1][cost - 1]) % mod;
          }
          prefix[maxNum][cost] = (prefix[maxNum - 1][cost] + dp[maxNum][cost]) % mod;
          }
        }
      for (int j = 1; j <= m; j++) {
        System.arraycopy(dp[j], 0, prevDp[j], 0, k+1);
        System.arraycopy(prefix[j], 0, prevPrefix[j], 0, k+1);
      }
    }
    return prefix[m][k];
  }
  // ===========================================================================
  public static void main(String[] args) {
    int n = 2;
    int m = 3;
    int k = 1;
    int output = Q1420_BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n, m, k);
    System.out.println(output);  // 6
    int n2 = 5;
    int m2 = 2;
    int k2 = 3;
    int output2 = Q1420_BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n2, m2, k2);
    System.out.println(output2);  // 0
    int n3 = 9;
    int m3 = 1;
    int k3 = 1;
    int output3 = Q1420_BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n3, m3, k3);
    System.out.println(output3);  // 1
    int output11 = Q1420_BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n, m, k);
    System.out.println(output11);  // 6
    int output22 = Q1420_BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n2, m2, k2);
    System.out.println(output22);  // 0
    int output33 = Q1420_BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons.numOfArrays(n3, m3, k3);
    System.out.println(output33);  // 1
  }
}