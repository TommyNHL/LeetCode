import java.util.Arrays;

public class Q1528_ShuffleString {
  public static String restoreString(String s, int[] indices) {
    char[] arr = new char[indices.length];
    for (int i = 0; i < indices.length; i++) {
      arr[indices[i]] = s.charAt(i);
    }
    return String.valueOf(arr);
  }
  public static void main(String[] args) {
    String s1 = "codeleet";
    int[] arr1 = new int[] {4,5,6,7,0,2,1,3};
    System.out.println(restoreString(s1, arr1));
    String s2 = "abc";
    int[] arr2 = new int[] {0,1,2};
    System.out.println(restoreString(s2, arr2));
  }
}