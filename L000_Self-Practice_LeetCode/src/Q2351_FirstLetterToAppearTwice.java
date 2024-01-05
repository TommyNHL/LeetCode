public class Q2351_FirstLetterToAppearTwice {
  public static char repeatedCharacter(String s) {
    char output = ' ';
    char[] arr = s.toCharArray();
    int one = 101;
    OuterLoop: for (int i = 0; i < arr.length; i++) {
      arr[i] = ' ';
      String test = String.valueOf(arr);
      String letter = String.valueOf(arr[i]);
      if (test.contains(letter)) {
        arr = s.toCharArray();
        for (int j = 0; j < arr.length; j++) {
          if (i >= one) {
            output = arr[i];
            break OuterLoop;
          } else if ((i != j) && (arr[i] == arr[j])) {
            one = j;
          } else if ((i < one) && (i != j) && (arr[i] == arr[j])) {
            one = j;
          }
        }
      }
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String s = "abccbaacz";
    String s2 = "abcdd";
    char output = Q2351_FirstLetterToAppearTwice.repeatedCharacter(s);
    char output2 = Q2351_FirstLetterToAppearTwice.repeatedCharacter(s2);
    System.out.println(output);  // 'c'
    System.out.println(output2);  // 'd'
  }
}