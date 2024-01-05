public class Q2000_ReversePrefixOfWord {
  public static String reversePrefix(String word, char ch) {
    String output = "";
    int idx = word.indexOf(ch);
    //System.out.println(idx);
    if (idx != -1) {
      String head = word.substring(0, idx + 1);
      //System.out.println(head);
      String tail = word.substring(idx + 1, word.length());
      //System.out.println(tail);
      char[] head_arr = head.toCharArray();
      char temp = ' ';
      for (int i = 0; i <= (head_arr.length - 1) /2; i++) {
        temp = head_arr[i];
        head_arr[i] = head_arr[head_arr.length - 1 - i];
        head_arr[head_arr.length - 1- i] = temp;
      }
      head = String.valueOf(head_arr);
      output = head.concat(tail);
    } else if (idx == -1) {
      return output = word;
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String word = "abcdefd";
    char ch = 'd';
    String word2 = "xyxzxe";
    char ch2 = 'z';
    String word3 = "abcd";
    char ch3 = 'z';
    String output = Q2000_ReversePrefixOfWord.reversePrefix(word, ch);
    String output2 = Q2000_ReversePrefixOfWord.reversePrefix(word2, ch2);
    String output3 = Q2000_ReversePrefixOfWord.reversePrefix(word3, ch3);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
  }
}