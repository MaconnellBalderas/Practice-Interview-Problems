package com.interview.Interview;

public class Chpt3ReverseString {

    public String reverseStringAuto(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String reverseStringMan(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i =  str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }


}
