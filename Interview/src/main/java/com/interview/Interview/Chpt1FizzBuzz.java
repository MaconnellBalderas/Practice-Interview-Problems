package com.interview.Interview;

public class Chpt1FizzBuzz {

    public void runFizzBuzz(Integer n, String str1, String str2) {
        for(int i = 1; i <= n; i++) {
            printStatements(i, str1, str2);
        }
    }

    private void printStatements(Integer i, String str1, String str2) {
        boolean isMod5 = i % 5 == 0;
        boolean isMod3 = i % 3 == 0;

        if((isMod5) && (isMod3)) {
            System.out.println(str1 + str2);
        } else if(isMod5) {
            System.out.println(str1);
        } else if(isMod3) {
            System.out.println(str2);
        } else {
            System.out.println(i);
        }
    }
}
