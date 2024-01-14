import java.util.Arrays;

public class Q1637_WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
  public static int maxWidthOfVerticalArea(int[][] points) {
    int[] x_arr = new int[points.length];
    int x1 = -1;
    int x2 = -1;
    for (int i = 0; i < points.length; i++) {
      x_arr[i] = points[i][0];
    }
    Arrays.sort(x_arr);
    int output = 0;
    for (int i = 0; i < points.length - 1; i++) {
      if (x_arr[i + 1] - x_arr[i] > output) {
        output = x_arr[i + 1] - x_arr[i];
      }
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[][] input1 = new int[][] {{8,7},{9,9},{7,4},{9,7}};
    System.out.println(maxWidthOfVerticalArea(input1));

    int[][] input2 = new int[][] {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};
    System.out.println(maxWidthOfVerticalArea(input2));

    int[][] input3 = new int[][] {{1,5},{1,70},{3,1000},{55,700},{999876789,53},{987853567,12}};
    System.out.println(maxWidthOfVerticalArea(input3));
  }
}