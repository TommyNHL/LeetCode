public class Q2769_FindTheMaximumAchievableNumber {
  public static int theMaximumAchievableX(int num, int t) {
    int temp = num + 2*t;
    int output_int = temp;
    return output_int;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int input_num = 4;
    int input_t = 1;
    System.out.println(theMaximumAchievableX(input_num, input_t));

    int input_num2 = 3;
    int input_t2 = 2;
    System.out.println(theMaximumAchievableX(input_num2, input_t2));
  }
}
