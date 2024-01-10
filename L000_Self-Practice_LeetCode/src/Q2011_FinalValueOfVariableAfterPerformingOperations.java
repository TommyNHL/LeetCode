public class Q2011_FinalValueOfVariableAfterPerformingOperations {
  public static int finalValueAfterOperations(String[] operations) {
    int output_int = 0;
    for (int i = 0; i < operations.length; i++) {
      if (operations[i].equals("++X") || operations[i].equals("X++")) {
        output_int += 1;
      } else if (operations[i].equals("--X") || operations[i].equals("X--")) {
        output_int -= 1;
      }
    }
    return output_int;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String[] input1 = new String[] {"--X", "X++", "X++"};
    System.out.println(finalValueAfterOperations(input1));
    String[] input2 = new String[] {"++X", "++X", "X++"};
    System.out.println(finalValueAfterOperations(input2));
    String[] input3 = new String[] {"X++", "++X", "--X", "X--"};
    System.out.println(finalValueAfterOperations(input3));
  }
}
