import java.util.Arrays;

public class Q2220_MinimumBitFlipsToConvertNumber {
  public static int minBitFlips(int start, int goal) {
    int count = 0;
    String starting = Integer.toString(start, 2);
    String ending = Integer.toString(goal, 2);
    char[] arrStart = starting.toCharArray();
    char[] arrEnd = ending.toCharArray();
    if (starting.length() > ending.length()) {
      int diff = starting.length() - ending.length();
      int counter = 0;
      char[] arrEnd2 = new char[starting.length()];
      while (counter < diff) {
        arrEnd2[counter] = '0';
        counter++;
      }
      for (int i = 0; i < arrEnd.length; i++) {
        arrEnd2[diff+i] = arrEnd[i];
      }
      arrEnd = arrEnd2;
    } else if (ending.length() > starting.length()) {
      int diff = ending.length() - starting.length();
      int counter = 0;
      char[] arrStart2 = new char[ending.length()];
      while (counter < diff) {
        arrStart2[counter] = '0';
        counter++;
      }
      for (int i = 0; i < arrStart.length; i++) {
        arrStart2[diff+i] = arrStart[i];
      }
      arrStart = arrStart2;
    }
    //System.out.println(Arrays.toString(arrEnd));
    //System.out.println(Arrays.toString(arrStart));
    for (int i = 0; i < arrStart.length; i++) {
      if (!(Character.valueOf(arrStart[i]).equals(Character.valueOf(arrEnd[i])))) {
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int st1 = 10;
    int st2 = 3;
    int goal1 = 7;
    int goal2 = 4;
    System.out.println(minBitFlips(st1, goal1));
    System.out.println(minBitFlips(st2, goal2));
  }
}