package com.interview.Interview;

public class Chpt5ReverseInteger {

    public Integer reverseInteger(Integer num) {
        String strNum = String.valueOf(num);
        String reversedStr = new StringBuilder(strNum).reverse().toString();

        num = Integer.parseInt(reversedStr);
        return num;
    }
}
