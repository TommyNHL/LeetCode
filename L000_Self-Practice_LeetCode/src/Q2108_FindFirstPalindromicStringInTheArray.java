public class Q2108_FindFirstPalindromicStringInTheArray {
  public static String firstPalindrome(String[] words) {
    for (int i = 0; i < words.length; i++) {
      StringBuilder sb = new StringBuilder(words[i]);
      StringBuilder sb2 = new StringBuilder(words[i]);
      sb2.reverse();
      if (String.valueOf(sb.toString()).equals(String.valueOf(sb2.toString()))) {
        return words[i];
      }
    }
    return "";
  }
  public static void main(String[] args) {
    String[] s1 = new String[] {"abc","car","ada","racecar","cool"};
    String[] s2 = new String[] {"notapalindrome","racecar"};
    String[] s3 = new String[] {"def","ghi"};
    System.out.println(firstPalindrome(s1));
    System.out.println(firstPalindrome(s2));
    System.out.println(firstPalindrome(s3));
  }
}