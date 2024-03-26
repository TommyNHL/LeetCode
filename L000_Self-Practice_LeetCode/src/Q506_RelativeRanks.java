import java.util.Arrays;

public class Q506_RelativeRanks {
  public static String[] findRelativeRanks(int[] score) {
    int[] rank = new int[score.length];
    rank = Arrays.copyOf(score, score.length);
    Arrays.sort(rank);
    //System.out.println(Arrays.toString(rank));
    //System.out.println(Arrays.toString(score));
    String[] arr = new String[score.length];
    for (int i = 0; i < rank.length; i++) {
      for (int j = 0; j < score.length; j++) {
        if (rank[i] == score[j]) {
          arr[j] = String.valueOf(rank.length - i);
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (String.valueOf(arr[i]).equals("1")) {
        arr[i] = "Gold Medal";
      } else if (String.valueOf(arr[i]).equals("2")) {
        arr[i] = "Silver Medal";
      } else if (String.valueOf(arr[i]).equals("3")) {
        arr[i] = "Bronze Medal";
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] s1 = new int[] {5,4,3,2,1};
    int[] s2 = new int[] {10,3,8,9,4};
    System.out.println(Arrays.toString(findRelativeRanks(s1)));
    System.out.println(Arrays.toString(findRelativeRanks(s2)));
  }
}
