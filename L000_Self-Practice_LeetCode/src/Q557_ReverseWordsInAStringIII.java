import java.util.Arrays;

public class Q557_ReverseWordsInAStringIII {

  public static String reverseWords(String s) {
    String str = s;
    String[] str_arr = s.split(" ");
    String sent = "";
    for (int i = 0; i < str_arr.length; i++) {
      String word = str_arr[i];
      char[] word_arr = word.toCharArray();
      int word_length = word_arr.length;
      char[] word_arr2 = new char[word_length];
      char temp = ' ';
      for (int w = 0; w < word_length; w++) {
        word_arr2[w] = word_arr[word_length - w - 1];
      }
      //System.out.println(String.valueOf(word_arr2));
      str_arr[i] = String.valueOf(word_arr2);
      String blk = " ";
      if (i < str_arr.length - 1) {
        word = str_arr[i].concat(blk);
        sent = sent.concat(word);
      //System.out.println(str);
      } else {
        sent = sent.concat(str_arr[i]);
      }
    }
    return sent;
  }
  public static void main(String[] args) {
    String s = "Let's take LeetCode contest";
    String str = Q557_ReverseWordsInAStringIII.reverseWords(s);
    System.out.println(str);
  }
}