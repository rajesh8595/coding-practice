package com.practice.leetcode;

/*Given an array height[] where height[i] is the height of a vertical line at index i, find the maximum amount of water a container can store. The container is formed by choosing two lines i and j (with i < j).
Area = min(height[i], height[j]) * (j - i)*/

public class ContainerWithMostWater {

    // Returns the maximum area (LeetCode standard answer)
    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) return 0;

        int left = 0, right = height.length - 1;
        int max = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int area = h * (right - left);
            if (area > max) {
                max = area;
            }

            // Move the pointer at the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    // Variant: also returns the pair of indices that form the max area
    public static int[] maxAreaWithIndices(int[] height) {
        if (height == null || height.length < 2) return new int[]{-1, -1};

        int left = 0, right = height.length - 1;
        int max = 0, bestL = 0, bestR = height.length - 1;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int area = h * (right - left);

            if (area > max) {
                max = area;
                bestL = left;
                bestR = right;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{bestL, bestR}; // indices of the optimal container
    }

    // Quick test
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max area: " + maxArea(heights)); // 49
        int[] pair = maxAreaWithIndices(heights);
        System.out.println("Indices: [" + pair[0] + ", " + pair[1] + "]"); // [1, 8]
    }
}
