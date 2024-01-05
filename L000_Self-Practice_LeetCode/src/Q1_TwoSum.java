import java.util.Arrays;

public class Q1_TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    int[] output = new int[2];
    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j < nums.length - 1; j++) {
        if ((i != j) && ((nums[i] + nums[j]) == target)) {
          output[0] = j;
          output[1] = i;
          break;
        }
      }
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums = new int[] {2, 2, 7, 15};
    int target = 9;
    int[] output = Q1_TwoSum.twoSum(nums, target);
    System.out.println(Arrays.toString(output));
  }
}