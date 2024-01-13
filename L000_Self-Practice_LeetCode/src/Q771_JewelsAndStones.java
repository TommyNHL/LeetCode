public class Q771_JewelsAndStones {
  public static int numJewelsInStones(String jewels, String stones) {
    int count = 0;
    for (int i = 0; i < jewels.length(); i++) {
      for (int j = 0; j < stones.length(); j++) {
        if (jewels.charAt(i) == stones.charAt(j)) {
          count++;
        }
      }
    }
    return count;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String in1 = "aA";
    String in2 = "aAAbbbb";
    System.out.println(numJewelsInStones(in1, in2));

    String in3 = "z";
    String in4 = "ZZ";
    System.out.println(numJewelsInStones(in3, in4));
  }
}