import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Q2009_MinimumNumberOfOperationsToMakeArrayContinuous {
  // sort
  // find the longest arr
  // determine differences (boundary range)
  public static int minOperations(int[] nums) {
    Arrays.sort(nums);
    int count = Integer.MAX_VALUE, j = 1, dup = 0;
    int[] dupArr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      while (j < nums.length && nums[j] <= nums[i] + nums.length - 1) {
        if (nums[j] == nums[j - 1]) ++dup;
          dupArr[j] = dup;
          j++;
      }
      count = Math.min(count, i + (nums.length - j) + dup - dupArr[i]);
    }
    return count;
  }
  // ===========================================================================
  public static void main(String[] args) {
/*     int[] nums = {4, 2, 5, 3};  // 0
    int output = Q2009_MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums);
    System.out.println(output);
    int[] nums2 = {1, 2, 3, 5, 6};  // 1 (6 -> 4)
    int output2 = Q2009_MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums2);
    System.out.println(output2);
    int[] nums3 = {1, 10, 100, 1000};  // 3 (either 3)
    int output3 = Q2009_MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums3);
    System.out.println(output3);
    int[] nums4 = {41,33,29,33,35,26,47,24,18,28};  // 5
    int output4 = Q2009_MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums4);
    System.out.println(output4);
    int[] nums5 = {8,10,16,18,10,10,16,13,13,16};  // 6
    int output5 = Q2009_MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums5);
    System.out.println(output5); */
    int[] nums6 = {29,32,46,30,11,32,49,26,18,33,34,16,48,42,23,33};  // 9
    int output6 = Q2009_MinimumNumberOfOperationsToMakeArrayContinuous.minOperations(nums6);
    System.out.println(output6);
  }
}