public class Q2833_FurthestPointFromOrigin {
  public static int furthestDistanceFromOrigin(String moves) {
    int output = -1;
    // tochar
    // L > R or R> L
    // count
    char[] arr = moves.toCharArray();
    int L = 0;
    int R = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 'L') {
        L += 1;
      } else if (arr[i] == 'R') {
        R += 1;
      } else if (arr[i] == '_') {
        L += 1;
        R += 1;
      }
    }
    if (L > R) {
      for (int i = 0; i < arr.length; i++) {
        if ((arr[i] == 'L') || (arr[i] == '_')) {
          count += 1;
        } else if (arr[i] == 'R') {
          count -= 1;
        }
      }
    } else if (R >= L) {
      for (int i = 0; i < arr.length; i++) {
        if ((arr[i] == 'R') || (arr[i] == '_')) {
          count += 1;
        } else if (arr[i] == 'L') {
          count -= 1;
        }
      }
    }
    return output = count;
  }
  // ---------------------------------------------------------------------------
  public static int furthestDistanceFromOrigin2(String moves) {
    int lCount = 0;
    int rCount = 0;
    int _Count = 0;
    for (int i = 0; i < moves.length(); i++) {
      if (moves.charAt(i) == 'L')
        lCount++;
      else if (moves.charAt(i) == 'R')
        rCount++;
      else
        _Count++;
    }
    return rCount < lCount ? lCount - rCount + _Count : rCount - lCount + _Count;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String moves = "L_RL__R";
    int output = Q2833_FurthestPointFromOrigin.furthestDistanceFromOrigin(moves);
    System.out.println(output);

    String moves2 = "_R__LL_";
    int output2 = Q2833_FurthestPointFromOrigin.furthestDistanceFromOrigin(moves2);
    System.out.println(output2);

    String moves3 = "_______";
    int output3 = Q2833_FurthestPointFromOrigin.furthestDistanceFromOrigin(moves3);
    System.out.println(output3);

    output = Q2833_FurthestPointFromOrigin.furthestDistanceFromOrigin2(moves);
    System.out.println(output);
    output2 = Q2833_FurthestPointFromOrigin.furthestDistanceFromOrigin2(moves2);
    System.out.println(output2);
    output3 = Q2833_FurthestPointFromOrigin.furthestDistanceFromOrigin2(moves3);
    System.out.println(output3);
  }
}