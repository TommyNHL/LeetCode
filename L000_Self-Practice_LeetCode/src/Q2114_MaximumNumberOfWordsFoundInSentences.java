public class Q2114_MaximumNumberOfWordsFoundInSentences {
  public static int mostWordsFound(String[] sentences) {
    int max = -1;
    for (int i = 0; i < sentences.length; i++) {
      int out = 1;
      for (int j = 0; j < sentences[i].length(); j++) {
        if (sentences[i].charAt(j) == ' ') {
          out++;
        }
      }
      max = Math.max(max, out);
    }
    return max;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String[] arr1 = new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
    System.out.println(mostWordsFound(arr1));
    String[] arr2 = new String[] {"please wait", "continue to fight", "continue to win"};
    System.out.println(mostWordsFound(arr2));
  }
}