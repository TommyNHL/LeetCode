import java.util.ArrayList;
import java.util.List;

public class Q1678_GoalParserInterpretation {
  public static String interpret(String command) {
    char[] arr = command.toCharArray();
    List<Character> list = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != '(' && arr[i] != ')') {
        list.add(arr[i]);
      } else if (arr[i] == '(' && arr[i+1] == ')') {
        list.add('o');
      }
    }
    String out = "";
    for (Character c : list) {
      out = out.concat(String.valueOf(c));
    }
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String str1 = "G()(al)";
    System.out.println(interpret(str1));
    String str2 = "G()()()()(al)";
    System.out.println(interpret(str2));
    String str3 = "(al)G(al)()()G";
    System.out.println(interpret(str3));
  }
}