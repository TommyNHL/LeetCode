import java.util.Arrays;

public class Q3079_FindTheSumOfEncryptedIntegers {
  public static int encrypt(int in) {
    String num = String.valueOf(in);
    if (num.length() == 1) {
      return in;
    } else {
      char[] arr = num.toCharArray();
      Arrays.sort(arr);
      String imd = String.valueOf(arr[num.length()-1]);
      //System.out.println("imd is "+ imd);
      for (int i = 0; i < num.length()-1; i++) {
        imd = imd.concat(String.valueOf(arr[num.length()-1]));
      }
      return Integer.valueOf(imd);
    }
  }

  public static int sumOfEncryptedInt(int[] nums) {
    int out = 0;
    for (int i = 0; i < nums.length; i++) {
      int num = encrypt(nums[i]);
      out += num;
    }
    return out;
  }
  public static void main(String[] args) {
    int[] nums1 = new int[] {1,2,3};
    int[] nums2 = new int[] {10,21,31};
    System.out.println(sumOfEncryptedInt(nums1));
    System.out.println(sumOfEncryptedInt(nums2));

  }
}
