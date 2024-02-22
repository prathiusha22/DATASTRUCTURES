package DatastructuresAndAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class AnagramArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 2, 3, 1 };

        if (areAnagrams(arr1, arr2)) {
            System.out.println("Arrays are anagrams.");
        } else {
            System.out.println("Arrays are not anagrams.");
        }
    }

    public static boolean areAnagrams(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            if (!countMap.containsKey(num)) {
                return false;
            }
            int count = countMap.get(num);
            if (count == 1) {
                countMap.remove(num);
            } else {
                countMap.put(num, count - 1);
            }
        }

        return countMap.isEmpty();
    }
}


