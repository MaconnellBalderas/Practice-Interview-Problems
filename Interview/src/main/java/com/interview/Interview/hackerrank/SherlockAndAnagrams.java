package com.interview.Interview.hackerrank;

import java.util.HashMap;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(sherlockAndAnagrams(s));
    }

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        int counter = 0;

        for(int x = 1; x <= s.length() - 1; x++) {
            for(int i = 0; i <= s.length() - x; i++) {
                for(int j = i + 1; j <= s.length() - x; j++) {
                    String a = s.substring(i, i+x);
                    String b = s.substring(j, j+x);

                    if(isAnagram(a, b)) {
                        counter++;
                    }

                }
            }
        }

        return counter;
    }

    private static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str1.length(); i++) {
            Character subStr = str1.charAt(i);

            if(map.containsKey(subStr)) {
               int updateCount = map.get(subStr) + 1;

               map.replace(subStr, updateCount);
            } else {
                map.put(subStr, 1);
            }
        }

        for(int i = 0; i < str2.length(); i++) {
            Character ch = str2.charAt(i);

            if(map.containsKey(ch)) {
                int updatedCount = map.get(ch) - 1;
                if(updatedCount == 0) {
                    map.remove(ch);
                } else {
                    map.replace(ch, updatedCount);
                }
            }
        }

        return map.isEmpty();
    }
}
