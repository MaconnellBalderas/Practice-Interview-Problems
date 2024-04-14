package com.interview.Interview.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    // psvm
    public static void main(String[] args) {
        int n = 10;
        List<List<Integer>> queries = new ArrayList<>();
//        queries.add(List.of(1, 5, 3));
//        queries.add(List.of(4, 8, 7));
//        queries.add(List.of(6, 9, 1));
        queries.add(List.of(1, 2, 100));
        queries.add(List.of(2, 5, 100));
        queries.add(List.of(3, 4, 100));

        System.out.println(arrayManipulation(n, queries));
        System.out.println(arrayManipulationTrick(n, queries));
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n];

        long max = 0;

        for(int i = 0; i < queries.size(); i++) {
            List<Integer> triplet = queries.get(i);
            int a = triplet.get(0) - 1;
            int b = triplet.get(1) - 1;
            int k = triplet.get(2);

            for(int j = a; j <= b; j++) {
                arr[j] += k;
                if(max < arr[j]) {
                    max = arr[j];
                }
            }
        }

        return max;
    }

    public static long arrayManipulationTrick(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 1];

        for(int i = 0; i < queries.size(); i++) {
            List<Integer> triplet = queries.get(i);
            int a = triplet.get(0) - 1;
            int b = triplet.get(1) - 1;
            int k = triplet.get(2);

            arr[a] += k;
            arr[b+1] -= k;
        }

        long max = 0;
        long sum = 0;

        for(int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if(max < sum) {
                max = sum;
            }
        }

        return max;
    }

}
