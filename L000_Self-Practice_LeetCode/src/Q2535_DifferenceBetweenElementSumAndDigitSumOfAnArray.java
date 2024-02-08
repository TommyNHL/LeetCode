public class Q2535_DifferenceBetweenElementSumAndDigitSumOfAnArray {
  public static int differenceOfSum(int[] nums) {
    int out = 0;
    for (int i = 0; i < nums.length; i++) {
      out += nums[i];
      for (int j = 0; j < String.valueOf(nums[i]).length(); j++) {
        out -= (int) String.valueOf(nums[i]).charAt(j) - 48;
      }
    }
    return Math.abs(out);
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {1,15,6,3};
    System.out.println(differenceOfSum(nums1));
    int[] nums2 = new int[] {1,2,3,4};
    System.out.println(differenceOfSum(nums2));
  }
}