public class Q2235_AddTwoIntegers {
  public static int sum(int num1, int num2) {
    int out = num1 + num2;
    return out;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int in1 = 12;
    int in2 = 5;
    System.out.println(sum(in1, in2));
    int in3 = -10;
    int in4 = 4;
    System.out.println(sum(in3, in4));
  }
}