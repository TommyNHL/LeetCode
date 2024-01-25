import java.util.Arrays;

public class Q1720_DecodeXORedArray {
  public static int[] decode(int[] encoded, int first) {
    int[] out = new int[encoded.length + 1];
    out[0] = first;
    for (int i = 0; i < encoded.length; i++) {
      int count = 0;
      while (true) {
        if ( (out[i]^count) == encoded[i] ) {
          out[i+1] = count;
          break;
        }
        count++;
      }
    }
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] en1 = new int[] {1,2,3};
    int f1 = 1;
    System.out.println(Arrays.toString(decode(en1, f1)));
    int[] en2 = new int[] {6,2,7,3};
    int f2 = 4;
    System.out.println(Arrays.toString(decode(en2, f2)));
  }
}
