public class Q2006_CountNumberOfPairsWithAbsolutrDifferenceK {
  public static int countKDifference(int[] nums, int k) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j && (Math.abs(nums[i]-nums[j])==k)) {
          count++;
        }
      }
    }
    return count/2;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {1,2,2,1};
    int k1 = 1;
    int[] nums2 = new int[] {1,3};
    int k2 = 3;
    int[] nums3 = new int[] {3,2,1,5,4};
    int k3 = 2;
    int[] nums4 = new int[] {7,7,8,3,1,2,7,2,9,5};
    int k4 = 6;
    System.out.println(countKDifference(nums1, k1));
    System.out.println(countKDifference(nums2, k2));
    System.out.println(countKDifference(nums3, k3));
    System.out.println(countKDifference(nums4, k4));
  }
}