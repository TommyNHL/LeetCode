public class Q1486_XOROperationInAnArray {
  public static int xorOperation(int n, int start) {
    int out = start;
    int temp = start;
    if (n > 1) {
      for (int i = 1; i < n; i++) {
        temp += 2;
        out ^= temp;
      }
    } else if (n == 1) {
      return out;
    }
    return out;
  }
  public static void main(String[] args) {
    int n1 = 5;
    int start1 = 0;
    System.out.println(xorOperation(n1, start1));
    int n2 = 4;
    int start2 = 3;
    System.out.println(xorOperation(n2, start2));
  }
}