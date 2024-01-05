import java.util.Arrays;

public class Q2251_NumberOfFlowersInFullBloom {
  public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
    int[] output = new int[people.length];
    // a full period -> arr, based on people
    // interval boundaries in, arr[i]+
    // people in, return sum into output
    int sum = 0;
    for (int i = 0; i < people.length; i++) {
      sum = Q2251_NumberOfFlowersInFullBloom.count(flowers, people[i]);
      output[i] = sum;
    }
    return output;
  }
  public static int count(int[][] flower, int day) {
    int sum = 0;
    for (int[] arr : flower) {
      if ((day >= arr[0]) && (day <= arr[1])) {
        sum += 1;
      }
    }
    return sum;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[][] flowers = new int[][] {{1,6}, {3,7}, {9,12}, {4,13}};
    int[] people = new int[] {2, 3, 7, 11};
    int[] output = Q2251_NumberOfFlowersInFullBloom.fullBloomFlowers(flowers, people);
    System.out.println(Arrays.toString(output));
    int[][] flowers2 = new int[][] {{1,10}, {3,3}};
    int[] people2 = new int[] {3, 3, 2};
    int[] output2 = Q2251_NumberOfFlowersInFullBloom.fullBloomFlowers(flowers2, people2);
    System.out.println(Arrays.toString(output2));
  }
}