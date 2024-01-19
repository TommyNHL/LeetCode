import java.util.ArrayList;
import java.util.List;

public class Q2824_CountPairsWhoseSumIsLessThanTarget {
  public static int countPairs(List<Integer> nums, int target) {
    int out = 0;
    for (int i = 0; i < nums.size(); i++) {
      for (int j = 0; j < nums.size(); j++) {
        if ((i < j) && (j != i) && (nums.get(i) + nums.get(j) < target)) {
          out++;
        }
      }
    }
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    List<Integer> nums1 = new ArrayList<>(List.of(-1,1,2,3,1));
    int t1 = 2;
    System.out.println(countPairs(nums1, t1));
    List<Integer> nums2 = new ArrayList<>(List.of(-6,2,5,-2,-7,-1,3));
    int t2 = -2;
    System.out.println(countPairs(nums2, t2));
  }
}