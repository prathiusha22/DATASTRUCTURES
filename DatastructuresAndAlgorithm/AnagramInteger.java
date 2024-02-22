package DatastructuresAndAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class AnagramInteger {
	
    public static void main(String[] args) {
        int num1 = 4132;
        int num2 = 1234;

        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        if (areAnagrams(str1, str2)) {
            System.out.println(num1 + " and " + num2 + " are anagrams.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not anagrams.");
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