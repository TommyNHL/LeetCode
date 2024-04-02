import java.util.Arrays;

public class Q2643_RowWithMaximumOnes {
  public static int[] rowAndMaximumOnes(int[][] mat) {
    int max = 0;
    int answer = 0;
    for (int i = 0; i < mat.length; i++) {
        int count = 0;
        for (int j = 0 ; j < mat[0].length ; j++) {
            if (mat[i][j] == 1)
            count++;
        }
        if (count > max) {
            max = count;
            answer = i;
        }
    }
    return new int[]{answer , max};
  }
  public static void main(String[] args) {
    int[][] m1 = new int[][] {{0,1}, {1,0}};
    int[][] m2 = new int[][] {{0,0,0}, {0,1,1}};
    int[][] m3 = new int[][] {{0,0}, {1,1}, {0,0}};
    System.out.println(Arrays.toString(rowAndMaximumOnes(m1)));
    System.out.println(Arrays.toString(rowAndMaximumOnes(m2)));
    System.out.println(Arrays.toString(rowAndMaximumOnes(m3)));
  }
}