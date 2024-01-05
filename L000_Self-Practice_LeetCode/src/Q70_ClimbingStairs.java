public class Q70_ClimbingStairs {
  public static int climbStairs(int n) {
    int sum = 1;
    int sum1 = 1;
    int sum2 = 2;
    if (n == 1) {
      return sum;
    } else if (n == 2) {
      return sum2;
    }
    int counter = 0;
    while (counter + 2 < n) {
      sum = sum1 + sum2;
      sum1 = sum2;
      sum2 = sum;
      counter += 1;
    }
    return sum;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int n1 = 1;  // (1)=1 -> (1)
    int n2 = 2;  // (2)=1 (11)=1 -> (2)
    int n3 = 3;  // (21)=2 (111)=1 -> (3)
    int n4 = 4;  // (22)=1 (211)=3 (1111)=1 -> (5)
    int n5 = 5;  // (221)=3 (2111)=4 (11111)=1 -> (8)
    int n6 = 6;  // (222)=1 (2211)=4C2=6 (21111)=5 (111111)=1 -> (13)
    int n7 = 7;  // (2221)=4 (22111)=5C2=10 (211111)=6 (1111111)=1 -> (21)
    // 1,2,3,5,8,13,21, -> 34,....
    int n8 = 8;  // (2222)=1 (22211)=5C2=10 (221111)=6C2=15 (2111111)=7 (11111111)=1 -> (34)
    int output = Q70_ClimbingStairs.climbStairs(n1);
    int output2 = Q70_ClimbingStairs.climbStairs(n2);
    int output3 = Q70_ClimbingStairs.climbStairs(n3);
    int output4 = Q70_ClimbingStairs.climbStairs(n4);
    int output5 = Q70_ClimbingStairs.climbStairs(n5);
    int output6 = Q70_ClimbingStairs.climbStairs(n6);
    int output7 = Q70_ClimbingStairs.climbStairs(n7);
    int output8 = Q70_ClimbingStairs.climbStairs(n8);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
    System.out.println(output5);
    System.out.println(output6);
    System.out.println(output7);
    System.out.println(output8);
  }
}