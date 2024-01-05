public class Q169_MajorityElement {
  public static int majorityElement(int[] nums) {
    int maj = 0;
    if (nums.length <= 2) {
      maj = nums[0];
      return maj;
    }
    int one = nums[0];
    int two = nums[1];
    int three = nums[2];
    int four;
    int oneCount = 0;
    int twoCount = 0;
    int threeCount = 0;
    int fourCount = 0;
    int lastone = nums[nums.length - 1];
    int lasttwo = nums[nums.length - 2];
    int lastthree = nums[nums.length - 3];
    int lastfour;
    int lastoneCount = 0;
    int lasttwoCount = 0;
    int lastthreeCount = 0;
    int lastfourCount = 0;

    if (nums.length == 3) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == lastone) {
          lastoneCount += 1;
        } else if (nums[i] == lasttwo) {
          lasttwoCount += 1;
        } else if (nums[i] == lastthree) {
          lastthreeCount += 1;
        }
      }
      if ((oneCount > twoCount) && (oneCount > threeCount) && (oneCount > lastoneCount) && (oneCount > lasttwoCount) && (oneCount > lastthreeCount)) {
        maj = nums[0];
        return maj;
      } else if ((twoCount > oneCount) && (twoCount > threeCount) && (twoCount > lastoneCount) && (twoCount > lasttwoCount) && (twoCount > lastthreeCount)) {
        maj = nums[1];
        return maj;
      } else if ((threeCount > oneCount) && (threeCount > twoCount) && (threeCount > lastoneCount) && (threeCount > lasttwoCount) && (threeCount > lastthreeCount)) {
        maj = nums[2];
        return maj;
      } else if ((lastoneCount > oneCount) && (lastoneCount > twoCount) && (lastoneCount > threeCount) && (lastoneCount > lasttwoCount) && (lastoneCount > lastthreeCount)) {
        maj = nums[nums.length - 1];
        return maj;
      } else if ((lasttwoCount > oneCount) && (lasttwoCount > twoCount) && (lasttwoCount > threeCount) && (lasttwoCount > lastoneCount) && (lasttwoCount > lastthreeCount)) {
        maj = nums[nums.length - 2];
        return maj;
      } else if ((lastthreeCount > oneCount) && (lastthreeCount > twoCount) && (lastthreeCount > threeCount) && (lastthreeCount > lastoneCount) && (lastthreeCount > lasttwoCount)) {
        maj = nums[nums.length - 3];
        return maj;
      }
    } if (nums.length > 3) {
      four = nums[3];
      lastfour = nums[nums.length - 4];
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == one) {
          oneCount += 1;
        } else if (nums[i] == two) {
          twoCount += 1;
        } else if (nums[i] == three) {
          threeCount += 1;
        } else if (nums[i] == four) {
          fourCount += 1;
        } else if (nums[i] == lastone) {
          lastoneCount += 1;
        } else if (nums[i] == lasttwo) {
          lasttwoCount += 1;
        } else if (nums[i] == lastthree) {
          lastthreeCount += 1;
        } else if (nums[i] == lastfour) {
          lastfourCount += 1;
        }
      }
      if ((oneCount > twoCount) && (oneCount > threeCount) && (oneCount > fourCount) && (oneCount > lastoneCount) && (oneCount > lasttwoCount) && (oneCount > lastthreeCount) && (oneCount > lastfourCount)) {
        maj = nums[0];
        return maj;
      } else if ((twoCount > oneCount) && (twoCount > threeCount) && (twoCount > fourCount) && (twoCount > lastoneCount) && (twoCount > lasttwoCount) && (twoCount > lastthreeCount) && (twoCount > lastfourCount)) {
        maj = nums[1];
        return maj;
      } else if ((threeCount > oneCount) && (threeCount > twoCount) && (threeCount > fourCount) && (threeCount > lastoneCount) && (threeCount > lasttwoCount) && (threeCount > lastthreeCount) && (threeCount > lastfourCount)) {
        maj = nums[2];
        return maj;
      } else if ((fourCount > oneCount) && (fourCount > twoCount) && (fourCount > threeCount) && (fourCount > lastoneCount) && (fourCount > lasttwoCount) && (fourCount > lastthreeCount) && (fourCount > lastfourCount)) {
        maj = nums[3];
        return maj;
      } else if ((lastoneCount > oneCount) && (lastoneCount > twoCount) && (lastoneCount > threeCount) && (lastoneCount > fourCount) && (lastoneCount > lasttwoCount) && (lastoneCount > lastthreeCount) && (lastoneCount > lastfourCount)) {
        maj = nums[nums.length - 1];
        return maj;
      } else if ((lasttwoCount > oneCount) && (lasttwoCount > twoCount) && (lasttwoCount > threeCount) && (lasttwoCount > fourCount) && (lasttwoCount > lastoneCount) && (lasttwoCount > lastthreeCount) && (lasttwoCount > lastfourCount)) {
        maj = nums[nums.length - 2];
        return maj;
      } else if ((lastthreeCount > oneCount) && (lastthreeCount > twoCount) && (lastthreeCount > threeCount) && (lastthreeCount > fourCount) && (lastthreeCount > lastoneCount) && (lastthreeCount > lasttwoCount) && (lastthreeCount > lastfourCount)) {
        maj = nums[nums.length - 3];
        return maj;
      } else if ((lastfourCount > oneCount) && (lastfourCount > twoCount) && (lastfourCount > threeCount) && (lastfourCount > fourCount) && (lastfourCount > lastoneCount) && (lastfourCount > lasttwoCount) && (lastfourCount > lastthreeCount)) {
        maj = nums[nums.length - 4];
        return maj;
      }
    }
    return maj;
  }
  // ===========================================================================
  public static void main(String[] args) {
    int[] nums = new int[] {3, 2, 3};
    int[] nums2 = new int[] {2, 2, 1, 1, 1, 2, 2};
    int[] nums3 = new int[] {1, 1, 1, 1, 1, 1, 8};
    int[] nums4 = new int[] {1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2};
    int[] nums5 = new int[] {-1, 100, 2, 100, 100, 4, 100};
    int[] nums6 = new int[] {12,52,12,70,12,61,12,12,50,72,82,12,11,25,28,43,40,12,12,53,12,12,98,12,12,92,81,2,12,15,40,12,12,9,12,31,12,12,12,12,77,12,12,50,12,12,12,93,41,92,12,12,12,12,12,12,12,12,12,37,48,14,12,70,82,12,80,12,12,12,12,56,30,12,8,12,50,12,20,12,21,97,12,42,12,10,12,38,73,15,9,11,79,12,12,28,51,12,15,12};
    int[] nums7 = new int[] {32,41,21,29,7,53,97,76,71,53,53,53,72,53,53,14,22,53,67,53,53,53,54,98,53,46,53,53,62,53,76,20,60,53,31,53,53,53,95,27,53,53,53,53,36,59,40,53,53,64,53,53,53,21,53,51,53,53,2,53,53,53,53,53,50,53,53,53,23,88,3,53,61,19,53,68,53,35,42,53,53,48,34,54,53,75,53,53,50,44,92,41,71,53,53,82,53,53,14,53};
    int output = Q169_MajorityElement.majorityElement(nums);
    int output2 = Q169_MajorityElement.majorityElement(nums2);
    int output3 = Q169_MajorityElement.majorityElement(nums3);
    int output4 = Q169_MajorityElement.majorityElement(nums4);
    int output5 = Q169_MajorityElement.majorityElement(nums5);
    int output6 = Q169_MajorityElement.majorityElement(nums6);
    System.out.println(output);
    System.out.println(output2);
    System.out.println(output3);
    System.out.println(output4);
    System.out.println(output5);
    System.out.println(output6);
  }
}