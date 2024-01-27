public class Q1221_SplitAStringInBalancedStrings {
  public static int balancedStringSplit(String s) {
    int count = 0;
    int accuR = 0;
    int accuL = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'R') {
        accuR += 1;
      } else if (s.charAt(i) == 'L') {
        accuL += 1;
      }
      if (Integer.valueOf(accuR).equals(Integer.valueOf(accuL))) {
        count += 1;
        accuR = 0;
        accuL = 0;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    String s1 = "RLRRLLRLRL";
    System.out.println(balancedStringSplit(s1));
    String s2 = "RLRRRLLRLL";
    System.out.println(balancedStringSplit(s2));
    String s3 = "LLLLRRRR";
    System.out.println(balancedStringSplit(s3));
  }
}
