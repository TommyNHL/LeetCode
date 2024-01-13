public class Q1791_FindCenterOfStarGraph {
  public static int findCenter(int[][] edges) {
    int[] counts = new int[100000];
    for (int i = 0; i < edges.length; i++) {
      counts[edges[i][0] - 1]++;
      counts[edges[i][1] - 1]++;
    }
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] == edges.length) {
        return i + 1;
      }
    }
    return -1;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[][] input = new int[][] {{1,2},{2,3},{4,2}};
    System.out.println(findCenter(input));

    int[][] input2 = new int[][] {{1,2},{5,1},{1,3}, {1,4}};
    System.out.println(findCenter(input2));
  }
}