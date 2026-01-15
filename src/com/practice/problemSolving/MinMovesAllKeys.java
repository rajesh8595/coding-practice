package com.practice.problemSolving;

import java.util.LinkedList;
import java.util.Queue;

public class MinMovesAllKeys {
    static  class State{
        int r,c,keys, steps;
        public State(int r, int c, int keys, int steps) {
            this.r = r;
            this.c = c;
            this.keys = keys;
            this.steps = steps;
        }
    }
    public static int shrotestPathAllKeys(String[] grid) {
        int m = grid.length;
        int n = grid[0].length();
        int totalKeys = 0, startRow = 0, startCol = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i].charAt(j) == '@') {
                    startRow = i;
                    startCol = j;
                } else if (grid[i].charAt(j) == '#') {
                    totalKeys++;
                }
            }
        }
        int finalMask=(1<<totalKeys)-1;
        boolean[][][] visited = new boolean[m][n][1 << totalKeys];
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(startRow, startCol, 0, 0));
        visited[startRow][startCol][0] = true;
        int[][] dr = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!queue.isEmpty()) {
            State state = queue.poll();
            if(state.keys==finalMask){
                return state.steps;
            }
            for (int[] d : dr) {
                int r = state.r + d[0];
                int c = state.c + d[1];
                int newKeys = state.keys;
                if(r<0 || c<0 || r>=m || c>=n || grid[r].charAt(c)=='#') continue;
                char ch = grid[r].charAt(c);
                if(ch=='#') continue;
                if (ch >= 'a' && ch <= 'f') {
                    newKeys |= 1 << (ch - 'a');
                } else if (ch >= 'A' && ch <= 'F') {
                    if ((newKeys & (1 << (ch - 'A'))) == 0) {
                        continue;
                    }
                }
                if (visited[r][c][newKeys]) {
                    continue;
                }
                visited[r][c][newKeys] = true;
                queue.offer(new State(r, c, newKeys, state.steps + 1));
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String[] grid = {"@..aA", "..B#.", "....b"};
        System.out.println(shrotestPathAllKeys(grid));
    }
}
