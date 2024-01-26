import java.util.Arrays;

public class Q2974_MinimumNumberGame {
  public static int[] numberGame(int[] nums) {
    int[] out = new int[nums.length];
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i+=2) {
      out[i] = nums[i+1];
      out[i+1] = nums[i];
    }
    return out;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {5,4,2,3};
    System.out.println(Arrays.toString(numberGame(nums1)));
    int[] nums2 = new int[] {2,5};
    System.out.println(Arrays.toString(numberGame(nums2)));
  }
}
