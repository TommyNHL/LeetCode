public class Q0 {
  public static void main(String[] args) {
    char c1 = 'a';
    System.out.println(c1 == 'a');  // true
    char c2 = new Character('a');
    System.out.println(c2 == 'a');  // true
    System.out.println(c1 == c2);  // true?
    Integer i1 = 1;
    System.out.println(i1 == 1);  // true
    Integer i2 = new Integer(1);
    System.out.println(i2 == 1);  // true
    System.out.println(i1 == i2);  // true? -> false, why?
    System.out.println((i1).equals(i2));  // true
    String s1 = "1";
    System.out.println(s1 == "1");  // true
    String s2 = new String("1");
    System.out.println(s2 == "1");  // true? -> false, why?
    System.out.println((s2).equals("1"));  // true
    System.out.println(s1 == s2);  // true? -> false, why?
    System.out.println((s1).equals(s2));  // true
  }
}