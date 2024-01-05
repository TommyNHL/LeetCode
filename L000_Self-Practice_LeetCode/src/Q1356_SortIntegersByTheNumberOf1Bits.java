import java.util.Arrays;

public class Q1356_SortIntegersByTheNumberOf1Bits {
  public static int fact(int in) {
    int count = 0;
    int temp = in;
    while (temp > 2) {
      if (temp % 2 == 0) {
        temp /= 2;
      } else if (temp % 2 == 1) {
        count++;
        temp = (temp - 1)/2;
      }
    }
    if (in == 2 || temp == 2) {
      count++;
    }
    if (in == 1 || temp == 1) {
      count++;
    }
    return count;
  }
  public static int[][] whatBit(int[] arr) {
    int max = -1;
    int[] newArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = fact(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(newArr[i], max);
    }
    int[][] arr2d = new int[max][arr.length];
    for (int i = 0; i < max; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (newArr[j] == (i+1)) {
          arr2d[i][j] = arr[j];
        }
      }
      Arrays.sort(arr2d[i]);
    }
    return arr2d;
  }
  public static int[] sortByBits(int[] arr) {
    int count = 0;
    int[] output = arr;
    Arrays.sort(output);
    int[][] arr2d = whatBit(arr);
    for (int i = 0; i < arr.length; i++) {
      if (output[i] == 0) {
        count++;
        continue;
      }
    }
    if (output[count] != 0) {
      for (int j = 0; j < arr2d.length; j++) {
        //System.out.println(Arrays.toString(arr2d[j]));
        for (int k = 0; k < arr2d[j].length; k++) {
          if (arr2d[j][k] == 0) {
            continue;
          } else if (arr2d[j][k] != 0) {
            output[count] = arr2d[j][k];
            count++;
          }
        }
      }
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] arr1 = new int[] {0,1,2,3,4,5,6,7,8};
    int[] arr2 = new int[] {1024,512,256,128,64,32,16,8,4,2,1};
    int[] arr3 = new int[] {2,3,5,7,11,13,17,19};
    System.out.println(Arrays.toString(Q1356_SortIntegersByTheNumberOf1Bits.sortByBits(arr1)));
    System.out.println(Arrays.toString(Q1356_SortIntegersByTheNumberOf1Bits.sortByBits(arr2)));
    System.out.println(Arrays.toString(Q1356_SortIntegersByTheNumberOf1Bits.sortByBits(arr3)));
  }
}