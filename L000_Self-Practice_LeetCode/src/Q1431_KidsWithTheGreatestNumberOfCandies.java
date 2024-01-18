import java.util.ArrayList;
import java.util.List;

public class Q1431_KidsWithTheGreatestNumberOfCandies {
  public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> out = new ArrayList<>();
    int max = candies[0];
    for (int i = 1; i < candies.length; i++) {
      max = Math.max(max, candies[i]);
    }
    for (int i = 0; i < candies.length; i++) {
      candies[i] = candies[i] + extraCandies;
      if (candies[i] >= max) {
        out.add(true);
      } else {
        out.add(false);
      }
    }
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] in_arr1 = new int[] {2,3,5,1,3};
    int ex1 = 3;
    System.out.println(kidsWithCandies(in_arr1, ex1));
    int[] in_arr2 = new int[] {4,2,1,1,2};
    int ex2 = 1;
    System.out.println(kidsWithCandies(in_arr2, ex2));
    int[] in_arr3 = new int[] {12,1,12};
    int ex3 = 10;
    System.out.println(kidsWithCandies(in_arr3, ex3));
    int[] in_arr4 = new int[] {2,8,7};
    int ex4 = 1;
    System.out.println(kidsWithCandies(in_arr4, ex4));
  }
}