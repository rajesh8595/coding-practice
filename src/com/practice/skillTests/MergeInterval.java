package com.practice.skillTests;

import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        mergeIntervals(intervals);
    }

    public static void mergeIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] merged = new int[intervals.length][2];
        int index = 0;
        merged[index] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (merged[index][1] >= intervals[i][0]) {
                merged[index][1] = Math.max(merged[index][1], intervals[i][1]);
            } else {
                index++;
                merged[index] = intervals[i];
            }
        }
        for (int i = 0; i <= index; i++) {
            System.out.println("[" + merged[i][0] + ", " + merged[i][1] + "]");
        }
    }
}
