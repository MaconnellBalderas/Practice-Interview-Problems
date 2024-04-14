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
            for(int i = 0; i < s.length() - x; i++) {
                for(int j = i + x; j < s.length() - x; j++) {


                    if(s.substring(i, i+x).equals(s.substring(j, j+x))) {
                        counter++;
                    }

                }
            }
        }

        return counter;
    }

    private boolean isAnagram(String str1, String str2) {
        // mma -> mam
        HashMap map = new HashMap();

        for(int i = 0; i < str1.length(); i++) {
//            Character subStr = 
//            map.put(0, 0);
        }

        return false;
    }
}
