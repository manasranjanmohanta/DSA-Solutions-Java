package LeetCodeSolutions;

import java.util.Arrays;

public class Solution1706 {
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        System.out.println(Arrays.toString(findBall(grid)));
    }
    public static int[] findBall(int[][] grid) {
        // row represented as m and column represented as n
        int m = grid.length, n = grid[0].length, res[] = new int[n];

        // here outer loop is for column means to track the no. of ball
        // represented by i
        for (int i = 0; i < n; i++) {
            int i1 = i, i2;// taking two temporary variable for checking column
            // here inner loop is for rows
            for (int j = 0; j < m; j++) {
                i2 = i1 + grid[j][i1];
                if (i2 < 0 || i2 >= n || grid[j][i2] != grid[j][i1]) {
                    i1 = -1;
                    break;
                }
                i1 = i2;
            }
            res[i] = i1;
        }
        return res;
    }
}
