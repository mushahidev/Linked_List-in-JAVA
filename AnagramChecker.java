package Tasks81224;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean finalResult = checkAnagram(str1, str2);

        if (finalResult) {
            System.out.println(str1 + " & " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " & " + str2 + " are not anagrams.");
        }
    }


    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> alphabetCountMap = new HashMap<>();

        for (
                char i : str1.toCharArray()) {
            alphabetCountMap.put(i, alphabetCountMap.getOrDefault(i, 0) + 1);
        }
        for (
                char i : str2.toCharArray()) {
            if (!alphabetCountMap.containsKey(i)) {
                return false;
            }
            alphabetCountMap.put(i, alphabetCountMap.get(i) - 1);
            if (alphabetCountMap.get(i) == 0) {
                alphabetCountMap.remove(i);
            }
        }
        return alphabetCountMap.isEmpty();
    }


}
