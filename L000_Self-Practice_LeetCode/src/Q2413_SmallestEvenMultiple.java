public class Q2413_SmallestEvenMultiple {
  public static int smallestEvenMultiple(int n) {
    if (n % 2 == 0) {
      return n;
    } else {
      int out = n*2;
      return out;
    }
  }
  // ===========================================================================
  public static void main(String[] args) {
    int n1 = 5;
    System.out.println(smallestEvenMultiple(n1));
    int n2 = 6;
    System.out.println(smallestEvenMultiple(n2));
  }
}