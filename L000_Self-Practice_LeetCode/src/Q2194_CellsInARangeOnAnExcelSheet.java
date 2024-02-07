import java.util.ArrayList;
import java.util.List;

public class Q2194_CellsInARangeOnAnExcelSheet {
    public static List<String> cellsInRange(String s) {
      List<String> list = new ArrayList<>();
      for (int i = (int) s.charAt(0); i < (int) s.charAt(3)+1; i++) {
        for (int j = (int) s.charAt(1); j < (int) s.charAt(4)+1; j++) {
          String in = String.valueOf((char) i).concat(String.valueOf((char) j));
          list.add(in);
        }
      }
      return list;
    }
    public static void main(String[] args) {
      String s1 = "K1:L2";
      System.out.println(cellsInRange(s1));
      String s2 = "A1:F1";
      System.out.println(cellsInRange(s2));
    }
}