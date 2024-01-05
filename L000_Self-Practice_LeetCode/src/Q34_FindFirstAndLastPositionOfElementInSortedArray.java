import java.util.Arrays;

public class Q34_FindFirstAndLastPositionOfElementInSortedArray {
  public static int[] searchRange(int[] nums, int target) {
    int[] output = new int[] {-1, -1};
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        output[0] = i;
        output[1] = i;
        break;
      }
    }
    for (int i = nums.length - 1; i > 0; i--) {
      if (nums[i] == target) {
        output[1] = i;
        break;
      }
    }
    return output;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {5, 7, 7, 8, 8, 10};
    int target = 8;
    int[] output = Q34_FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target);
    System.out.println(Arrays.toString(output));
    int[] nums2 = new int[] {5, 7, 7, 8, 8, 10};
    int target2 = 6;
    int[] output2 = Q34_FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums2, target2);
    System.out.println(Arrays.toString(output2));
    int[] nums3 = new int[] {};
    int target3 = 0;
    int[] output3 = Q34_FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums3, target3);
    System.out.println(Arrays.toString(output3));
    int[] nums4 = new int[] {8};
    int target4 = 8;
    int[] output4 = Q34_FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums4, target4);
    System.out.println(Arrays.toString(output4));
  }
}