import java.util.Arrays;

public class Q3065_MinimumOperationsToExceedThresholdValueI {
  public static int minOperations(int[] nums, int k) {
    int[] arr = nums;
    Arrays.sort(arr);
    for (int i = 0; i < nums.length; i++) {
      if (arr[i] >= k) {
        return i;
      }
    }
    return nums.length;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {2,11,10,1,3};
    int[] nums2 = new int[] {1,1,2,4,9};
    int[] nums3 = new int[] {1,1,2,4,9};
    int[] nums4 = new int[] {760340387,289254123,628299234,204198715,565672759,684967229,303459334,302262994,770720781,383343826,148523784,750183433,778902176,930418501,520286131,441750197,402643198,547480026,799770607,303114486,481644752,320289220,792197603,44751343,828179295,804048578,468569446,555743704,416141129,865011209,56010709,133835994,200083188,740956911,842527451,728469270,370323078,880010797,977376598,598070033,866374140,110775975,609860085};
    int k1 = 10;
    int k2 = 1;
    int k3 = 9;
    int k4 = 377260496;
    System.out.println(minOperations(nums1, k1));
    System.out.println(minOperations(nums2, k2));
    System.out.println(minOperations(nums3, k3));
    System.out.println(minOperations(nums4, k4));

  }
}
