import java.util.Arrays;

public class Q1480_RunningSumOf1dArray {
  public static int[] runningSum(int[] nums) {
    int[] arr = new int[nums.length];
    int acc = 0;
    for (int i = 0; i < nums.length; i++) {
      arr[i] = acc += nums[i];
    }
    return arr;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums1 = new int[] {1,2,3,4};
    System.out.println(Arrays.toString(runningSum(nums1)));
    int[] nums2 = new int[] {1,1,1,1,1};
    System.out.println(Arrays.toString(runningSum(nums2)));
    int[] nums3 = new int[] {3,1,2,10,1};
    System.out.println(Arrays.toString(runningSum(nums3)));
  }
}