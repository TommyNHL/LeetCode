import java.util.Arrays;

public class Q2160_MinimumSumOfFourDigitNumberAfterSplittingDigits {
  public static int minimumSum(int num) {
    int place = 0;
    int[] arr = new int[4];
    while (num > 0) {
      arr[place] = num % 10;
      num /= 10;
      place++;
    }
    Arrays.sort(arr);
    int n1 = arr[0] * 10 + arr[2];
    int n2 = arr[1] * 10 + arr[3];
    return n1 + n2;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int sum1 = 2932;
    System.out.println(minimumSum(sum1));
    int sum2 = 4009;
    System.out.println(minimumSum(sum2));
  }
}