public class Q896_MonotonicArray {
  public static boolean isMonotonic(int[] nums) {
    int counter_up = 0;
    int counter_down = 0;
    int length = nums.length - 1;
    boolean check = true;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > nums[i + 1]) {
        counter_up += 1;
      } else if (nums[i] < nums[i + 1]) {
        counter_down += 1;
      } else if (nums[i] == nums[i + 1]) {
        counter_up += 1;
        counter_down += 1;
      }
    }
    if (length == counter_up || length == counter_down) {
      return check;
    } else if (length != counter_up && length != counter_down) {
      return !check;
    }
    return check;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums = new int[] {1, 2, 2, 3};
    int[] nums2 = new int[] {6, 5, 4, 4};
    int[] nums3 = new int[] {1, 3, 2};
    boolean output = Q896_MonotonicArray.isMonotonic(nums);
    boolean output2 = Q896_MonotonicArray.isMonotonic(nums2);
    boolean output3 = Q896_MonotonicArray.isMonotonic(nums3);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
  }
}