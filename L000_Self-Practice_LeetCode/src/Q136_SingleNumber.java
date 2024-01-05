public class Q136_SingleNumber {
  public static int singleNumber(int[] nums) {
    int single = 0;
    if (nums.length == 1) {
      single = nums[0];
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if ((i != j) && (nums[i] != 0) && (nums[j] != 0) && (nums[i]) == (nums[j])) {
          nums[i] = 0;
          nums[j] = 0;
        }
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        single = nums[i];
        return single;
      }
    }
    return single;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums = new int[] {2, 2, 1};
    int[] nums2 = new int[] {4, 1, 2, 1, 2};
    int[] nums3 = new int[] {1};
    int output = Q136_SingleNumber.singleNumber(nums);
    int output2 = Q136_SingleNumber.singleNumber(nums2);
    int output3 = Q136_SingleNumber.singleNumber(nums3);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
  }
}