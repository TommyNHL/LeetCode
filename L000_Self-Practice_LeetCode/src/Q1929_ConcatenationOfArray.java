import java.util.Arrays;

public class Q1929_ConcatenationOfArray {
  public static int[] getConcatenation(int[] nums) {
    int[] output_arr = new int[nums.length * 2];
    for (int i = 0; i < output_arr.length; i++) {
      output_arr[i] = nums[i % nums.length];
    }
    return output_arr;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] input1 = new int[] {1,2,1};
    System.out.println(Arrays.toString(getConcatenation(input1)));

    int[] input2 = new int[] {1,3,2,1};
    System.out.println(Arrays.toString(getConcatenation(input2)));
  }
}