import java.util.Arrays;

public class Q1816_TruncateSentence {
  public static String truncateSentence(String s, int k) {
    String[] arr = s.split(" ");
    //System.out.println(Arrays.toString(arr));
    String str = "";
    String space = " ";
    for (int i = 0; i < k; i++) {
      if (i < k-1) {
        str = str.concat(arr[i]).concat(space);
      } else {
        str = str.concat(arr[i]);
      }
    }
    return str;
  }
  public static void main(String[] args) {
    String s1 = "Hello how are you Contestant";
    int k1 = 4;
    System.out.println(truncateSentence(s1, k1));
    String s2 = "What is the solution to this problem";
    int k2 = 4;
    System.out.println(truncateSentence(s2, k2));
    String s3 = "chopper is not a tanuki";
    int k3 = 5;
    System.out.println(truncateSentence(s3, k3));
  }
}