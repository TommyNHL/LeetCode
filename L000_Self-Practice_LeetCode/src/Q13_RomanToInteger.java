public class Q13_RomanToInteger {
  public static int charToInt(char c) {
    int out = 0;
    switch(c) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
    }
    return out;
  }
  public static int romanToInt(String s) {
    char[] char_arr = s.toCharArray();
    int out = 0;
    int sum = 0;
    if (char_arr.length == 1) {
      sum = Q13_RomanToInteger.charToInt(char_arr[0]);
      return sum;
    }
    for (int i = 0; i < char_arr.length - 1; i++) {
      if (Q13_RomanToInteger.charToInt(char_arr[i]) < Q13_RomanToInteger.charToInt(char_arr[i + 1])) {
        out = Q13_RomanToInteger.charToInt(char_arr[i + 1]) - Q13_RomanToInteger.charToInt(char_arr[i]);
        sum = sum + out;
        i++;
        if (i == char_arr.length - 2) {
          out = Q13_RomanToInteger.charToInt(char_arr[i + 1]);
          sum = sum + out;
        }
      } else if (Q13_RomanToInteger.charToInt(char_arr[i]) >= Q13_RomanToInteger.charToInt(char_arr[i + 1])) {
        out = Q13_RomanToInteger.charToInt(char_arr[i]);
        sum = sum + out;
        if (i == char_arr.length - 2) {
          out = Q13_RomanToInteger.charToInt(char_arr[i + 1]);
          sum = sum + out;
        }
      }
    }
    return sum;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String s = "III";  // 3
    String s2 = "LVIII"; // 58
    String s3 = "MCMXCIV";  // 1994
    String s4 = "MDCXCV";  // 1695
    String s5 = "D";  // 500
    int output = Q13_RomanToInteger.romanToInt(s);
    int output2 = Q13_RomanToInteger.romanToInt(s2);
    int output3 = Q13_RomanToInteger.romanToInt(s3);
    int output4 = Q13_RomanToInteger.romanToInt(s4);
    int output5 = Q13_RomanToInteger.romanToInt(s5);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
    System.out.println(output5);
  }
}