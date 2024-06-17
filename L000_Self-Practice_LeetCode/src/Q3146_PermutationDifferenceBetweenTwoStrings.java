public class Q3146_PermutationDifferenceBetweenTwoStrings {
    public static int findPermutationDifference(String s, String t) {
      int sum = 0;
      char[] arr1 = s.toCharArray();
      char[] arr2 = t.toCharArray();
      for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
          if (i != j && arr1[i]==arr2[j]) {
            sum += Math.abs(i - j);
          }
        }
      }
      return sum;
    }
    public static void main(String[] args) {
      String s1 = "abc";
      String t1 = "bac";
      String s2 = "abcde";
      String t2 = "edbac";
      System.out.println(findPermutationDifference(s1, t1));
      System.out.println(findPermutationDifference(s2, t2));
    }
}
