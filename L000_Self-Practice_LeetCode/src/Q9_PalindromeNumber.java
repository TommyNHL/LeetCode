public class Q9_PalindromeNumber {
  public static boolean isPalindrome(int x) {
    boolean out = false;
    String one = String.valueOf(x);
    StringBuilder sb = new StringBuilder(one);
    char first = one.charAt(0);
    if (Character.valueOf(first) == '-') {
      return out;
    } else if (sb.toString().equals(sb.reverse().toString())) {
      return out = true;
    }
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int x1 = 121;
    int x2 = -121;
    int x3 = 10;
    System.out.println(isPalindrome(x1));
    System.out.println(isPalindrome(x2));
    System.out.println(isPalindrome(x3));
  }
}