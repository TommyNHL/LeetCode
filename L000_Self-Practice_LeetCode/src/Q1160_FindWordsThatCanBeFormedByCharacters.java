import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1160_FindWordsThatCanBeFormedByCharacters {
  public static int countCharacters2(String[] words, String chars) {
    int out = 0;
    int[] count = new int[words.length];
    char[] aim = chars.toCharArray();
    List<Character> list = new ArrayList<>();
    for (char c : aim) {
      list.add(c);
    }
    list.sort(null);
    
    for (int i = 0; i < words.length; i++) {
      char[] letter = words[i].toCharArray();
      for (int j = 0; j < letter.length; j++) {
        if (list.contains(letter[j])) {
          count[i] += 1;
        } else if (!list.contains(letter[j])) {
          count[i] -= 10000;
        }
      }
    }
    System.out.println(Arrays.toString(count));

    //
    List<Character> check = new ArrayList<>();
    for (int i = 0; i < count.length; i++) {
      if (count[i] > 0) {
        char[] letters = words[i].toCharArray();
        for (int j = 0; j < letters.length; j++) {
          check.add(letters[j]);
        }
        check.sort(null);
        //System.out.println(check);
        int countNum = 0;
        for (int k = 0; k < list.size(); k++) {
          if (check.contains(list.get(k))) {
            countNum += 1;
          }
        }
        System.out.println(countNum);
        if (Integer.valueOf(countNum) >= words[i].length()) {
          out += count[i];
        }
      }
    }
    //
    for (int i : count) {
      if (i > 0) {
        out += count[i];
      }
    }

    return out;
  }

  public static int countCharacters(String[] words, String chars) {
    int length = 0;
    int[] charsArr = new int[26];
    for (int i = 0; i < chars.length(); i++) {
        charsArr[chars.charAt(i) - 'a']++;
    }
    for (int i = 0; i < words.length; i++) {
        if (isFormed(words[i], charsArr))
            length += words[i].length();
    }
    return length;
  }

  public static boolean isFormed(String word, int[] charsArr) {
      int[] wordCount = new int[26];
      boolean isFormed = true;
      for (int i = 0; i < word.length(); i++) {
          wordCount[word.charAt(i) - 'a']++;
      }
      for (int i = 0; i < wordCount.length; i++) {
          if (wordCount[i] != 0 && wordCount[i] > charsArr[i]) {
              isFormed = false;
              break;
          }
      }
      return isFormed;
  }
  // ===========================================================================
  public static void main(String[] args) {
    String[] words1 = new String[] {"cat","bt","hat","tree"};
    String chars1 = "atach";
    System.out.println(countCharacters(words1, chars1));

    String[] words2 = new String[] {"hello","world","leetcode"};
    String chars2 = "welldonehoneyr";
    System.out.println(countCharacters(words2, chars2));

    String[] words3 = new String[] {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
    String chars3 = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
    System.out.println(countCharacters(words3, chars3));
  }
}