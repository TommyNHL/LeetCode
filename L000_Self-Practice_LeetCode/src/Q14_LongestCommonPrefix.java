public class Q14_LongestCommonPrefix {
  public static String longestCommonPrefix(String[] strs) {
    String output = "";
    int noOfWords = strs.length;
    if (noOfWords == 1) {
      output = strs[0];
      return output;
    }
    int stop = 0;
    int counter = 0;
    int length = strs[0].length();
    String str = strs[0];
    for (int i = 1; i < strs.length; i++) {
      if (strs[i].length() < length) {
        length = strs[i].length();
        str = strs[i];
      }
    }
    OuterLoop: for (int i = 0; i < length; i++) {
      for (int j = 0; j < noOfWords - 1; j++) {
        char a = strs[j].charAt(i);
        if (a != strs[j + 1].charAt(i)) {
          stop = i;
          break OuterLoop;
        } else {
          stop = i + 1;
        }
      }
    }
    if (stop >= 0) {
      output = str.substring(0, stop);
      return output;
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String[] strs = new String[] {"flower","flow","flight"};
    String[] strs2 = new String[] {"dog","racecar","car"};
    String[] strs3 = new String[] {"a"};
    String[] strs4 = new String[] {"a", "a"};
    String output = Q14_LongestCommonPrefix.longestCommonPrefix(strs);
    String output2 = Q14_LongestCommonPrefix.longestCommonPrefix(strs2);
    String output3 = Q14_LongestCommonPrefix.longestCommonPrefix(strs3);
    String output4 = Q14_LongestCommonPrefix.longestCommonPrefix(strs4);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
  }
}