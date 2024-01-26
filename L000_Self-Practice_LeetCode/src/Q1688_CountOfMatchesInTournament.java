public class Q1688_CountOfMatchesInTournament {

  public static int countMatch(int in) {
    int out = in / 2;
    return out;
  }

  public static int thinkTemp(int in) {
    if (in % 2 == 0) {
      return in/2;
    } else if (in % 2 == 1) {
      return in/2 + 1;
    }
    return 0;
  }

  public static int numberOfMatches(int n) {
    if (n < 2) {
      return 0;
    }
    int counter = 1;
    int temp = n;
    while (temp > 2) {
      counter += countMatch(temp);
      temp = thinkTemp(temp);
    }
    return counter;
  }
  public static void main(String[] args) {
    int n1 = 7;
    System.out.println(numberOfMatches(n1));
    int n2 = 14;
    System.out.println(numberOfMatches(n2));
    int n3 = 1;
    System.out.println(numberOfMatches(n3));
    int n4 = 2;
    System.out.println(numberOfMatches(n4));
  }
}