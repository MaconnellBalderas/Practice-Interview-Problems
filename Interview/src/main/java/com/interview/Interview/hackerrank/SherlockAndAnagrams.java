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
        // abba
        for(int x = 1; x <= s.length() - x; x++) {
            for(int i = 0; i < s.length() - x; i++) {
                for(int j = i + x; j < s.length() - x; j++) {
                    // Issue Here
                    System.out.println("I: " + i);
                    System.out.println("First: " + s.substring(i, i+x));
                    System.out.println("J: " + j);
                    System.out.println("Seconds: " + s.substring(j, j+x));

                    if(isAnagram(s.substring(i, i+x), s.substring(j, j+x))) {
                        System.out.println("----------Counter-----------------------");
                        counter++;
                    }

                }
            }
        }

        return counter;
    }

    private static boolean isAnagram(String str1, String str2) {
        // mma -> mam
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < str1.length() - 1; i++) {
            String subStr = str1.substring(i, i + 1);

            if(map.containsKey(subStr)) {
               int updateCount = map.get(subStr) + 1;

               map.put(subStr, updateCount);
            } else {
                map.put(subStr, 1);
            }
        }

        for(int i = 0; i < str2.length() - 1; i++) {
            String subStr = str2.substring(i, i + 1);

            if(map.containsKey(subStr)) {
                if(map.get(subStr) == 0) {
                    return false;
                } else {
                    int updatedCount = map.get(subStr) - 1;
                    map.put(subStr, updatedCount);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }
}
