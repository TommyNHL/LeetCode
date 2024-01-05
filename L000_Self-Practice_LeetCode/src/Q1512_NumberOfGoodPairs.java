public class Q1512_NumberOfGoodPairs {
  public static int numIdenticalPairs(int[] nums) {
    int counter = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if ((i < j) && (nums[i] == nums[j])) {
          counter += 1;
        }
      }
    }
    return counter;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums = new int[] {1, 2, 3, 1, 1, 3};
    int[] nums2 = new int[] {1, 1, 1, 1};
    int[] nums3 = new int[] {1, 2, 3};
    int[] test = new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 
      1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 
      1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 
      1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4};
    int output = Q1512_NumberOfGoodPairs.numIdenticalPairs(nums);
    int output2 = Q1512_NumberOfGoodPairs.numIdenticalPairs(nums2);
    int output3 = Q1512_NumberOfGoodPairs.numIdenticalPairs(nums3);
    int output4 = Q1512_NumberOfGoodPairs.numIdenticalPairs(test);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
  }
}