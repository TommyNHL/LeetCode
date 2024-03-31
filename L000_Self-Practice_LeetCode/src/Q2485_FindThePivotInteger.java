public class Q2485_FindThePivotInteger {
  public static int pivotInteger(int n) {
    if (n == 1) {
      return 1;
    } else {
      int tot = 0;
      for (int i = 0; i <= n; i++) {
        tot += i;
      }

      int head = 0;
      for (int i = 1; i < n; i++) {
        head += i;
        tot -= i-1;
        if (head == tot) {
          return i;
        }
      }
      return -1; 
    }
  }
  public static void main(String[] args) {
    int n1 = 8;
    int n2 = 1;
    int n3 = 4;
    System.out.println(pivotInteger(n1));
    System.out.println(pivotInteger(n2));
    System.out.println(pivotInteger(n3));
  }
}