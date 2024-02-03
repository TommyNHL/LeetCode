public class Q1342_NumberOfStepsToReduceANumberToZero {
  public static int numberOfSteps(int num) {
    if (num == 0) {
      return 0;
    }
    int out = 0;
    int temp = num;
    while (temp > 0) {
      if (temp % 2 == 0) {
        temp /= 2;
        out += 1;
      } else if (temp % 2 == 1) {
        temp -= 1;
        out += 1;
      }
    }
    return out;
  }
  public static void main(String[] args) {
    int num1 = 14;
    System.out.println(numberOfSteps(num1));
    int num2 = 8;
    System.out.println(numberOfSteps(num2));
    int num3 = 123;
    System.out.println(numberOfSteps(num3));
  }
}
