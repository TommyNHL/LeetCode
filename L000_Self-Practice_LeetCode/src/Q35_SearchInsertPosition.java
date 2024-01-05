public class Q35_SearchInsertPosition {
  public static int searchInsert(int[] nums, int target) {
    int out_idx = 0;
    if (nums.length == 0) {
      return out_idx = 0;
    }
    if (target > nums[nums.length - 1]) {
      return out_idx = nums.length;
    }
    for (int i = 1; i < nums.length; i++) {
      if ((target > nums[i - 1]) && (target <= nums[i])) {
        return out_idx = i;
      }
    }
    return out_idx;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {1,3,5,5,6};
    int target = 5;
    int output = Q35_SearchInsertPosition.searchInsert(nums, target);
    System.out.println(output);
    int target2 = 2;
    int output2 = Q35_SearchInsertPosition.searchInsert(nums, target2);
    System.out.println(output2);
    int target3 = 7;
    int output3 = Q35_SearchInsertPosition.searchInsert(nums, target3);
    System.out.println(output3);
  }
}