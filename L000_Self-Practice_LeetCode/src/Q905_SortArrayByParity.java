import java.util.Arrays;
public class Q905_SortArrayByParity {
  // Question #905. Sort Array By Parity
  public static int[] sortArrayByParity(int[] nums) {
    if (nums.length == 1) {
      return nums;
    } else if (nums.length > 1) {
      int counter = 0;
      int odd = 0;
      int temp = -1;
      while (counter + odd < nums.length - 1) {
        if (nums[counter] % 2 == 0) {
          counter += 1;
          // System.out.println(Arrays.toString(nums));
          continue;
        } else if (nums[counter] == 0) {
          counter += 1;
          // System.out.println(Arrays.toString(nums));
          continue;
        } else if (nums[counter] % 2 == 1) {
          temp = nums[nums.length - 1];
          // System.out.println(temp);
          nums[nums.length - 1] = nums[counter];
          // System.out.println(Arrays.toString(nums));
          for (int i = counter; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
          }
          nums[nums.length - 2] = temp;
          // System.out.println(Arrays.toString(nums));
          odd += 1;
        }
      }
    }
    return nums;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums = new int[] {0,1,2};
    int[] output = Q905_SortArrayByParity.sortArrayByParity(nums);
    System.out.println(Arrays.toString(output));
  }
}