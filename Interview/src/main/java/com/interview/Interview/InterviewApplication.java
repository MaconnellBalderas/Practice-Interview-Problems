package com.interview.Interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class InterviewApplication {

	public static void main(String[] args) {
		Chpt1FizzBuzz fizzBuzz = new Chpt1FizzBuzz();
		fizzBuzz.runFizzBuzz(15, "Fizz", "Buzz");
        System.out.println("--------------------------------------------------");

        Chpt2TwoSums twoSums = new Chpt2TwoSums();
		int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSums.returnTwoSums(nums, target)));
        System.out.println("--------------------------------------------------");

        Chpt3ReverseString reverse = new Chpt3ReverseString();
        String str = "Hello World";
        System.out.println(reverse.reverseStringAuto(str));
        System.out.println(reverse.reverseStringMan(str));
        System.out.println("--------------------------------------------------");

        Chpt5ReverseInteger reverseInteger = new Chpt5ReverseInteger();
        Integer num = 54321;
        System.out.println(reverseInteger.reverseInteger(num));
        System.out.println("--------------------------------------------------");
    }

}
