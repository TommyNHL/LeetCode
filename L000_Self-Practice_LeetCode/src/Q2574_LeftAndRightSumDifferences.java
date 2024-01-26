import java.util.Arrays;

public class Q2574_LeftAndRightSumDifferences {
  public static int[] leftRightDifference(int[] nums) {
    int[] left = new int[nums.length];
    int[] right = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        left[i] = 0;
        right[nums.length-1-i] = 0;
      } else if (i > 0) {
        left[i] = nums[i-1] + left[i-1];
        right[nums.length-1-i] = nums[nums.length-i] + right[nums.length-i];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      left[i] = Math.abs(left[i] - right[i]);
    }
    return left;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {10,4,8,3};
    System.out.println(Arrays.toString(leftRightDifference(nums1)));
    int[] nums2 = new int[] {1};
    System.out.println(Arrays.toString(leftRightDifference(nums2)));
  }
}
