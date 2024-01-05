public class Q2810_FaultyKeyboard {
  public static boolean checkLetter(char c) {
    return (c == 'i');
  }

  public static String finalString(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (checkLetter(s.charAt(i)) == false) {
        sb.append(s.charAt(i));
      } else {
        sb.reverse();
      }
    }
    return sb.toString();
  }  // avoid .toString() many times
  // ===========================================================================
  public static void main(String[] args) {
    String s1 = "string";
    String s2 = "poiinter";
    System.out.println(Q2810_FaultyKeyboard.finalString(s1));
    System.out.println(Q2810_FaultyKeyboard.finalString(s2));
  }
}