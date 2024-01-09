import java.util.Arrays;

public class Q1920_BuildArrayFromPermutation {
  public static int[] buildArray(int[] nums) {
    int[] output_arr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      output_arr[i] = nums[nums[i]];
    }
    return output_arr;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] output1 = new int[] {0,2,1,5,3,4};
    System.out.println(Arrays.toString(buildArray(output1)));

    int[] output2 = new int[] {5,0,1,2,3,4};
    System.out.println(Arrays.toString(buildArray(output2)));
  }
}