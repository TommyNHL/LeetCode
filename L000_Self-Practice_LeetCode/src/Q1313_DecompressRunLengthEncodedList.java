import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1313_DecompressRunLengthEncodedList {
  public static int[] decompressRLElist(int[] nums) {
    List<Integer> list = new ArrayList<>();
    int time = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 0) {
        time = nums[i];
      } else {
        for (int j = 0; j < nums[i-1]; j++) {
          list.add(nums[i]);
        }
      }
    }
    int[] out = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      out[i] = list.get(i);
    }
    return out;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {1,2,3,4};
    System.out.println(Arrays.toString(decompressRLElist(nums1)));
    int[] nums2 = new int[] {1,1,2,3};
    System.out.println(Arrays.toString(decompressRLElist(nums2)));
  }
}