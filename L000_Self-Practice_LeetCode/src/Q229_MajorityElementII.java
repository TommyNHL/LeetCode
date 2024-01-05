import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q229_MajorityElementII {
  public static List<Integer> majorityElement(int[] nums) {
    List<Integer> out_list = new ArrayList<Integer>();
    int maj = 0;
    int cit = Math.round(nums.length / 3);
    System.out.println(cit);
    if (nums.length == 1) {
      out_list.add(nums[0]);
      return out_list;
    } else if ((nums.length == 2) && (nums[0] == nums[1])) {
      out_list.add(nums[0]);
      return out_list;
    } else if ((nums.length == 2) && (nums[0] != nums[1])) {
      out_list.add(nums[0]);
      out_list.add(nums[1]);
      return out_list;
    }

    int one = nums[0];
    int two = nums[1];
    int three = nums[2];
    int four;
    int five;
    int six;
    int seven;
    int eight;
    int nine;
    int oneCount = 0;
    int twoCount = 0;
    int threeCount = 0;
    int fourCount = 0;
    int fiveCount = 0;
    int sixCount = 0;
    int sevenCount = 0;
    int eightCount = 0;
    int nineCount = 0;
    int lastone = nums[nums.length - 1];
    int lasttwo = nums[nums.length - 2];
    int lastthree = nums[nums.length - 3];
    int lastfour;
    int lastfive;
    int lastsix;
    int lastseven;
    int lasteight;
    int lastnine;
    int lastoneCount = 0;
    int lasttwoCount = 0;
    int lastthreeCount = 0;
    int lastfourCount = 0;
    int lastfiveCount = 0;
    int lastsixCount = 0;
    int lastsevenCount = 0;
    int lasteightCount = 0;
    int lastnineCount = 0;

    if (nums.length == 3) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      return out_list;
    } if (nums.length == 4) {
      four = nums[3];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      return out_list;
    } if (nums.length == 5) {
      four = nums[3];
      five = nums[4];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == five) {
          fiveCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      if (fiveCount > cit) {
        out_list.add(nums[4]);
      }
      return out_list;
    } if (nums.length == 6) {
      four = nums[3];
      five = nums[4];
      six = nums[5];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == five) {
          fiveCount += 1;
        } else if (nums[i] == six) {
          sixCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      if (fiveCount > cit) {
        out_list.add(nums[4]);
      }
      if (sixCount > cit) {
        out_list.add(nums[5]);
      }
      return out_list;
    } if (nums.length == 7) {
      four = nums[3];
      five = nums[4];
      six = nums[5];
      seven = nums[6];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == five) {
          fiveCount += 1;
        } else if (nums[i] == six) {
          sixCount += 1;
        } else if (nums[i] == seven) {
          sevenCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      if (fiveCount > cit) {
        out_list.add(nums[4]);
      }
      if (sixCount > cit) {
        out_list.add(nums[5]);
      }
      if (sevenCount > cit) {
        out_list.add(nums[6]);
      }
      return out_list;
    } if (nums.length == 8) {
      four = nums[3];
      five = nums[4];
      six = nums[5];
      seven = nums[6];
      eight = nums[7];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == five) {
          fiveCount += 1;
        } else if (nums[i] == six) {
          sixCount += 1;
        } else if (nums[i] == seven) {
          sevenCount += 1;
        } else if (nums[i] == eight) {
          eightCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      if (fiveCount > cit) {
        out_list.add(nums[4]);
      }
      if (sixCount > cit) {
        out_list.add(nums[5]);
      }
      if (sevenCount > cit) {
        out_list.add(nums[6]);
      }
      if (eightCount > cit) {
        out_list.add(nums[7]);
      }
      return out_list;
    } if (nums.length == 9) {
      four = nums[3];
      five = nums[4];
      six = nums[5];
      seven = nums[6];
      eight = nums[7];
      nine = nums[8];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == five) {
          fiveCount += 1;
        } else if (nums[i] == six) {
          sixCount += 1;
        } else if (nums[i] == seven) {
          sevenCount += 1;
        } else if (nums[i] == eight) {
          eightCount += 1;
        } else if (nums[i] == nine) {
          nineCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      if (fiveCount > cit) {
        out_list.add(nums[4]);
      }
      if (sixCount > cit) {
        out_list.add(nums[5]);
      }
      if (sevenCount > cit) {
        out_list.add(nums[6]);
      }
      if (eightCount > cit) {
        out_list.add(nums[7]);
      }
      if (nineCount > cit) {
        out_list.add(nums[8]);
      }
      return out_list;
    } if (nums.length >= 18) {
      four = nums[3];
      five = nums[4];
      six = nums[5];
      seven = nums[6];
      eight = nums[7];
      nine = nums[8];
      lastfour = nums[nums.length - 4];
      lastfive = nums[nums.length - 5];
      lastsix = nums[nums.length - 6];
      lastseven = nums[nums.length - 7];
      lasteight = nums[nums.length - 8];
      lastnine = nums[nums.length - 9];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == five) {
          fiveCount += 1;
        } else if (nums[i] == six) {
          sixCount += 1;
        } else if (nums[i] == seven) {
          sevenCount += 1;
        } else if (nums[i] == eight) {
          eightCount += 1;
        } else if (nums[i] == nine) {
          nineCount += 1;
        } else if (nums[i] == lastnine) {
          lastnineCount += 1;
        } else if (nums[i] == lasteight) {
          lasteightCount += 1;
        } else if (nums[i] == lastseven) {
          lastsevenCount += 1;
        } else if (nums[i] == lastsix) {
          lastsixCount += 1;
        } else if (nums[i] == lastfive) {
          lastfiveCount += 1;
        } else if (nums[i] == lastfour) {
          lastfourCount += 1;
        } else if (nums[i] == lastthree) {
          lastthreeCount += 1;
        } else if (nums[i] == lasttwo) {
          lasttwoCount += 1;
        } else if (nums[i] == lastone) {
          lastoneCount += 1;
        } 
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      if (fiveCount > cit) {
        out_list.add(nums[4]);
      }
      if (sixCount > cit) {
        out_list.add(nums[5]);
      }
      if (sevenCount > cit) {
        out_list.add(nums[6]);
      }
      if (eightCount > cit) {
        out_list.add(nums[7]);
      }
      if (nineCount > cit) {
        out_list.add(nums[8]);
      }
      if (lastnineCount > cit) {
        out_list.add(nums[nums.length - 9]);
      }
      if (lasteightCount > cit) {
        out_list.add(nums[nums.length - 8]);
      }
      if (lastsevenCount > cit) {
        out_list.add(nums[nums.length - 7]);
      }
      if (lastsixCount > cit) {
        out_list.add(nums[nums.length - 6]);
      }
      if (lastfiveCount > cit) {
        out_list.add(nums[nums.length - 5]);
      }
      if (lastfourCount > cit) {
        out_list.add(nums[nums.length - 4]);
      }
      if (lastthreeCount > cit) {
        out_list.add(nums[nums.length - 3]);
      }
      if (lasttwoCount > cit) {
        out_list.add(nums[nums.length - 2]);
      }
      if (lastoneCount > cit) {
        out_list.add(nums[nums.length - 1]);
      }
      return out_list;
    } if ((nums.length >= 10) && (nums.length < 18)) {
      four = nums[3];
      five = nums[4];
      lastfour = nums[nums.length - 4];
      lastfive = nums[nums.length - 5];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == five) {
          fiveCount += 1;
        } else if (nums[i] == lastfive) {
          lastfiveCount += 1;
        } else if (nums[i] == lastfour) {
          lastfourCount += 1;
        } else if (nums[i] == lastthree) {
          lastthreeCount += 1;
        } else if (nums[i] == lasttwo) {
          lasttwoCount += 1;
        } else if (nums[i] == lastone) {
          lastoneCount += 1;
        }
      }
      if (oneCount > cit) {
        out_list.add(nums[0]);
      }
      if (twoCount > cit) {
        out_list.add(nums[1]);
      }
      if (threeCount > cit) {
        out_list.add(nums[2]);
      }
      if (fourCount > cit) {
        out_list.add(nums[3]);
      }
      if (fiveCount > cit) {
        out_list.add(nums[4]);
      }
      if (lastfiveCount > cit) {
        out_list.add(nums[nums.length - 5]);
      }
      if (lastfourCount > cit) {
        out_list.add(nums[nums.length - 4]);
      }
      if (lastthreeCount > cit) {
        out_list.add(nums[nums.length - 3]);
      }
      if (lasttwoCount > cit) {
        out_list.add(nums[nums.length - 2]);
      }
      if (lastoneCount > cit) {
        out_list.add(nums[nums.length - 1]);
      }
      return out_list;
    }
    return out_list;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums = new int[] {3, 2, 3};
    int[] nums2 = new int[] {1};
    int[] nums3 = new int[] {1, 2};
    int[] nums4 = new int[] {3, 2, 2, 2, 3};
    int[] nums5 = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,4,5,6,7,8,9};
    List<Integer> output = Q229_MajorityElementII.majorityElement(nums);
    List<Integer> output2 = Q229_MajorityElementII.majorityElement(nums2);
    List<Integer> output3 = Q229_MajorityElementII.majorityElement(nums3);
    List<Integer> output4 = Q229_MajorityElementII.majorityElement(nums4);
    List<Integer> output5 = Q229_MajorityElementII.majorityElement(nums5);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
    System.out.println(output5);
  }
}