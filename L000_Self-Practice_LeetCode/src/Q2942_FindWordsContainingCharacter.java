import java.util.ArrayList;
import java.util.List;

class Q2942_FindWordsContainingCharacter {
  public static List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> output = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      int index = -1;
      for (int letter = 0; letter < words[i].length(); letter++) {
        if (words[i].charAt(letter) == x) {
          index = i;
          break;
        }
      }
      if (index >= 0) {
        output.add(index);
      }
      index = -1;
    }
    return output;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String[] input_arr1 = new String[] {"leet", "code"};
    char x1 = 'e';
    System.out.println(findWordsContaining(input_arr1, x1));

    String[] input_arr2 = new String[] {"abc", "bcd", "aaaa", "cbc"};
    char x2 = 'a';
    System.out.println(findWordsContaining(input_arr2, x2));
  }
}