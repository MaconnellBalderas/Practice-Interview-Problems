package com.interview.Interview;

public class Chpt2TwoSums {

    public int[] returnTwoSums(int[] nums, Integer target) {
        int[] arr = new int[]{};
        boolean checkNumsLength = nums.length == 2;

        if(nums.length < 2) {
            return arr;
        } else if( (checkNumsLength) && (nums[0] + nums[1] == target) ) {
            return new int[] {0, 1};
        } else if( (checkNumsLength) && (nums[0] + nums[1] != target) ) {
            return arr;
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                int a = nums[j];
                int b = nums[i];

                if(a == b) {
                    continue;
                }

                if(a + b == target) {
                    return new int[]{i, j};
                }

            }
        }

        return arr;
    }

}
