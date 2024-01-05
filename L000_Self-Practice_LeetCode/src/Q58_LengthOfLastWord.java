public class Q58_LengthOfLastWord {
  public static int lengthOfLastWord(String s) {
    String[] arr = s.split(" ");
    String last = arr[arr.length - 1];
    int out = last.length();
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String s1 = "Hello World";
    String s2 = "   fly me   to   the moon  ";
    String s3 = "luffy is still joyboy";
    System.out.println(lengthOfLastWord(s1));
    System.out.println(lengthOfLastWord(s2));
    System.out.println(lengthOfLastWord(s3));
  }
}