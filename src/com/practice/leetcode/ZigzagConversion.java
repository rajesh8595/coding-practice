package com.practice.leetcode;


public class ZigzagConversion {

    // Math-based index arithmetic (space-optimized)
    public String convertMathBased(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        int n = s.length();
        int cycle = 2 * numRows - 2;
        StringBuilder out = new StringBuilder(n);

        for (int row = 0; row < numRows; row++) {
            int i = row;

            if (row == 0 || row == numRows - 1) {
                // First & last rows: constant step = cycle
                while (i < n) {
                    out.append(s.charAt(i));
                    i += cycle;
                }
            } else {
                // Middle rows: alternate steps
                int step1 = 2 * (numRows - 1 - row); // down-to-diagonal
                int step2 = 2 * row;                 // diagonal-to-down
                boolean useStep1 = true;

                while (i < n) {
                    out.append(s.charAt(i));
                    i += useStep1 ? step1 : step2;
                    useStep1 = !useStep1;
                }
            }
        }

        return out.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = new ZigzagConversion().convertMathBased(s, numRows);
        System.out.println(result);
    }
}



