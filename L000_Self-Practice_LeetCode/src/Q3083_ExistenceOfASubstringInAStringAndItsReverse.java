public class Q3083_ExistenceOfASubstringInAStringAndItsReverse {
  public static boolean isSubstringPresent(String s) {
    StringBuilder str = new StringBuilder(s);
    String rev = str.reverse().toString();
    //System.out.println(rev);
    for (int i = 0; i < s.length()-1; i++) {
      for (int j = 0; j < s.length()-1; j++) {
        if (s.charAt(i) == rev.charAt(j) && s.charAt(i+1) == rev.charAt(j+1)) {
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
    String s1 = "leetcode";
    String s2 = "abcba";
    String s3 = "abcd";
    System.out.println(isSubstringPresent(s1));
    System.out.println(isSubstringPresent(s2));
    System.out.println(isSubstringPresent(s3));

  }
}
