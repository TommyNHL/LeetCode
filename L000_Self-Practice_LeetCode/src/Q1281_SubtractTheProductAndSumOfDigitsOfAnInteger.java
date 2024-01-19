public class Q1281_SubtractTheProductAndSumOfDigitsOfAnInteger {
  public static int subtractProductAndSum(int n) {
    String str = String.valueOf(n);
    char[] arr = str.toCharArray();
    int pro = 1;
    int sum = 0;
    for (char c : arr) {
      pro *= c - 48;
      sum += c - 48;
    }
    return pro - sum;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int n1 = 234;
    System.out.println(subtractProductAndSum(n1));
    int n2 = 4421;
    System.out.println(subtractProductAndSum(n2));
  }
}