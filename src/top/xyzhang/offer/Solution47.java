package top.xyzhang.offer;

public class Solution47 {
    public static void main(String[] args) {

    }
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 第一个元素
                if (i == 0 && j == 0) continue;
                if (i == 0) dp[i][j] = dp[i][j-1] + grid[i][j]; // 第一行
                else if (j == 0) dp[i][j] = dp[i-1][j] + grid[i][j]; // 第一列
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
