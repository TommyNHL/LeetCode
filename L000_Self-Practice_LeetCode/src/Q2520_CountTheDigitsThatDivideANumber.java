public class Q2520_CountTheDigitsThatDivideANumber {
  public static int countDigits(int num) {
    int out = 0;
    for (int i = 0; i < String.valueOf(num).length(); i++) {
      if (num % (int) (String.valueOf(num).charAt(i) - 48)  == 0) {
        out++;
      }
    }
    return out;
  }
  public static void main(String[] args) {
    int n1 = 7;
    int n2 = 121;
    int n3 = 1248;
    System.out.println(countDigits(n1));
    System.out.println(countDigits(n2));
    System.out.println(countDigits(n3));
  }
}