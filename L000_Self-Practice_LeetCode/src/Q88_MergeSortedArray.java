import java.util.Arrays;

public class Q88_MergeSortedArray {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int count = 0;
    for (int i = nums1.length - n; i < nums1.length; i++) {
      if (count < n) {
        nums1[i] = nums2[count];
        count++;
      }
    }
    Arrays.sort(nums1);
    System.out.println(Arrays.toString(nums1));
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums1a = new int[] {1,2,3,0,0,0};
    int m1 = 3;
    int[] nums2a = new int[] {2,5,6};
    int n1 = 3;
    int[] nums1b = new int[] {1};
    int m2 = 1;
    int[] nums2b = new int[] {};
    int n2 = 0;
    int[] nums1c = new int[] {0};
    int m3 = 0;
    int[] nums2c = new int[] {1};
    int n3 = 1;
    Q88_MergeSortedArray.merge(nums1a, m1, nums2a, n1);
    Q88_MergeSortedArray.merge(nums1b, m2, nums2b, n2);
    Q88_MergeSortedArray.merge(nums1c, m3, nums2c, n3);
  }
}