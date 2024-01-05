public class Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
  public static String poolStr(String s) {
    String str = s;
    String a = "A";
    String b = "B";
    String pool = "";
    char[] char_arr = str.toCharArray();
    if (char_arr.length > 1) {
      for (int i = 1; i < char_arr.length - 1; i++) {
        if ((char_arr[i - 1] == 'A') && (char_arr[i] == 'A') && (char_arr[i + 1] == 'A')) {
          pool = pool.concat(a);
        } else if ((char_arr[i - 1] == 'B') && (char_arr[i] == 'B') && (char_arr[i + 1] == 'B')) {
          pool = pool.concat(b);
          //System.out.println(str);
        }
      }
    }
    return pool;
  }
  public static int countA(String pool) {
    String str = pool;
    int counter = 0;
    char[] char_arr = str.toCharArray();
    for (int i = 0; i < char_arr.length; i++) {
      if (char_arr[i] == 'A') {
        counter += 1;
      }
    }
    return counter;
  }
  public static int countB(String pool) {
    String str = pool;
    int counter = 0;
    char[] char_arr = str.toCharArray();
    for (int i = 0; i < char_arr.length; i++) {
      if (char_arr[i] == 'B') {
        counter += 1;
      }
    }
    return counter;
  }
  public static boolean winnerOfGame(String colors) {
    String pool = Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.poolStr(colors);
    boolean output = false;
    int noOfA = Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.countA(pool);
    int noOfB = Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.countB(pool);
    if (noOfA > noOfB) {
      output = true;
      return output;
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String colors = "AAABABB";  // true
    String colors2 = "AA";  // false
    String colors3 = "ABBBBBBBAAA";  // false
    String colors4 = "AAAABBBB";  // test
    boolean output = Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors);
    boolean output2 = Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors2);
    boolean output3 = Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors3);
    boolean output4 = Q2038_RemoveColoredPiecesIfBothNeighborsAreTheSameColor.winnerOfGame(colors4);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
  }
}