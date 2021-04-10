package top.xyzhang.offer;

public class Solution49 {
    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        System.out.println(solution49.nthUglyNumber(5));
    }
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a]*2;
            int n3 = dp[b]*3;
            int n5 = dp[c]*5;
            int min = Math.min(n2, Math.min(n3, n5));
            if (min == n2) a++;
            if (min == n3) b++;
            if (min == n5) c++;
            dp[i] = min;
        }
        return dp[n-1];
    }
}
