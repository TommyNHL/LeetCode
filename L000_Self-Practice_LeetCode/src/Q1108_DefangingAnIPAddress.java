import java.util.Arrays;

public class Q1108_DefangingAnIPAddress {
  public static String defangIPaddr(String address) {
    char[] arr = new char[address.length() + 6];
    int count = 0;
    for (int i = 0; i < address.length(); i++) {
      if (address.charAt(i) != '.') {
        arr[count] = address.charAt(i);
        count += 1;
      } else {
        arr[count] = '[';
        arr[count+1] = '.';
        arr[count+2] = ']';
        count += 3;
      }
    }
    String output_str = String.valueOf(arr);
    return output_str;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String intput1 = "1.1.1.1";
    System.out.println(defangIPaddr(intput1));

    String input2 = "255.100.50.0";
    System.out.println(defangIPaddr(input2));
  }
}