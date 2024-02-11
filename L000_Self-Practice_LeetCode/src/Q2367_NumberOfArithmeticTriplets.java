public class Q2367_NumberOfArithmeticTriplets {
  public static int arithmeticTriplets(int[] nums, int diff) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        for (int k = 0; k < nums.length; k++) {
          if (i != j && j != k && nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
            count++;
          }
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {0,1,4,6,7,10};
    int dif1 = 3;
    int[] nums2 = new int[] {4,5,6,7,8,9};
    int dif2 = 2;
    System.out.println(arithmeticTriplets(nums1, dif1));
    System.out.println(arithmeticTriplets(nums2, dif2));
  }
}