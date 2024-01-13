import java.util.Arrays;

public class Q1470_ShuffleTheArray {
  public static int[] shuffle(int[] nums, int n) {
    int[] arr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        arr[i] = nums[i/2];
      } else if (i % 2 == 1) {
        arr[i] = nums[n + i/2];
      }
    }
    return arr;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] in1 = new int[] {2,5,1,3,4,7};
    int n1 = 3;
    System.out.println(Arrays.toString(shuffle(in1, n1)));

    int[] in2 = new int[] {1,2,3,4,4,3,2,1};
    int n2 = 4;
    System.out.println(Arrays.toString(shuffle(in2, n2)));

    int[] in3 = new int[] {1,1,2,2};
    int n3 = 2;
    System.out.println(Arrays.toString(shuffle(in3, n3)));
  }
}