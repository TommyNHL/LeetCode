import java.util.Arrays;

public class Q1389_CreateTargetArrayInTheGivenOrder {
  public static int[] createTargetArray(int[] nums, int[] index) {
    int[] out = new int[nums.length];
    for (int i = 0; i < out.length; i++) {
      out[i] = -1;
    }
    for (int i = 0; i < nums.length; i++) {
      if (out[index[i]] == -1) {
        out[index[i]] = nums[i];
      } else {
        int temp = out[index[i]];
        out[index[i]] = nums[i];
        for (int j = index[i]+1; j < out.length; j++) {
          int temp2 = out[j];
          out[j] = temp;
          temp = temp2;
        }
      }
    }
    return out;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {0,1,2,3,4};
    int[] index1 = new int[] {0,1,2,2,1};
    System.out.println(Arrays.toString(createTargetArray(nums1, index1)));
    int[] nums2 = new int[] {1,2,3,4,0};
    int[] index2 = new int[] {0,1,2,3,0};
    System.out.println(Arrays.toString(createTargetArray(nums2, index2)));
    int[] nums3 = new int[] {1};
    int[] index3 = new int[] {0};
    System.out.println(Arrays.toString(createTargetArray(nums3, index3)));
  }
}