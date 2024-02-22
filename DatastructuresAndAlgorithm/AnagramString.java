package DatastructuresAndAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }

        public static boolean areAnagrams(String str1, String str2) {
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            if (str1.length() != str2.length()) {
                return false;
            }
            Map<Character, Integer> charCountMap = new HashMap<>();

            for (char c : str1.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            
            for (char c : str2.toCharArray()) {
                if (!charCountMap.containsKey(c)) {
                    return false; 
                }
                int count = charCountMap.get(c);
                if (count == 1) {
                    charCountMap.remove(c); 
                } else {
                    charCountMap.put(c, count - 1);
                }
            }
            return charCountMap.isEmpty();
        }
}

