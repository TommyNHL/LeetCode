public class Q2652_SumMultiples {
  public static int sumOfMultiples(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
        sum += i;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    int n1 = 7;
    System.out.println(sumOfMultiples(n1));
    int n2 = 10;
    System.out.println(sumOfMultiples(n2));
    int n3 = 9;
    System.out.println(sumOfMultiples(n3));
  }
}