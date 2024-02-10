import java.util.ArrayList;
import java.util.List;

public class Q2325_DecodeTheMessage {
  public static String decodeMessage(String key, String message) {
    String out = "";
    char[] arr = key.toCharArray();
    List list = new ArrayList<>();
    for (char c : arr) {
      if (c == ' ') {
        continue;
      } else if (list.contains(c)) {
        continue;
      } else {
        list.add(c);
      }
    }
    for (int i = 0; i < message.length(); i++) {
      if (message.charAt(i) == ' ') {
        out = out.concat(" ");
      } else {
        char c = (char) (list.indexOf(message.charAt(i)) + 97);
        out = out.concat(String.valueOf(c));
      }
    }
    //System.out.println(list);
    return out;
  }
  public static void main(String[] args) {
    String key1 = "the quick brown fox jumps over the lazy dog";
    String msg1 = "vkbs bs t suepuv";
    String key2 = "eljuxhpwnyrdgtqkviszcfmabo";
    String msg2 = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
    System.out.println(decodeMessage(key1, msg1));
    System.out.println(decodeMessage(key2, msg2));
  }
}