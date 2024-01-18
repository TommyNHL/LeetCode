public class Q2894_DivisibleAndNondivisibleSumsDifference {
  public static int differenceOfSums(int n, int m) {
    int can = 0;
    int cannot = 0;
    for (int i = 1; i < n + 1; i++) {
      if (i % m == 0) {
        can += i;
      } else {
        cannot += i;
      }
    }
    int out = cannot - can;
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int n1 = 10;
    int m1 = 3;
    System.out.println(differenceOfSums(n1, m1));
    int n2 = 5;
    int m2 = 6;
    System.out.println(differenceOfSums(n2, m2));
    int n3 = 5;
    int m3 = 1;
    System.out.println(differenceOfSums(n3, m3));
  }
}
