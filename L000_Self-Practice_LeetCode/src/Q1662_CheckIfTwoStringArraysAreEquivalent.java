public class Q1662_CheckIfTwoStringArraysAreEquivalent {
  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String a = "";
    for (int i = 0; i < word1.length; i++) {
      a = a.concat(word1[i]);
    }
    String b = "";
    for (int i = 0; i < word2.length; i++) {
      b = b.concat(word2[i]);
    }
    if (String.valueOf(a).equals(String.valueOf(b))) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    String[] w1 = new String[] {"ab", "c"};
    String[] w2 = new String[] {"a", "bc"};
    System.out.println(arrayStringsAreEqual(w1, w2));
    String[] w3 = new String[] {"a", "cb"};
    String[] w4 = new String[] {"ab", "c"};
    System.out.println(arrayStringsAreEqual(w3, w4));
    String[] w5 = new String[] {"abc", "d", "defg"};
    String[] w6 = new String[] {"abcddefg"};
    System.out.println(arrayStringsAreEqual(w5, w6));

  }
}
