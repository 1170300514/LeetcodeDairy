package top.xyzhang.offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution48 {
    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
//        System.out.println(solution48.lengthOfLongestSubstring("ab"));
        System.out.println(solution48.lengthOfLongestSubstring2(""));
    }

    /**
     * 半暴力On2
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int ans = 1, len = s.length();
        if (len == 0) return 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                ans = ans > (j-i+1) ? ans : (j-i+1);
                set.add(s.charAt(j));
            }
            set.clear();
        }
        return ans;
    }

    /**
     * 动态规划
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0) return 0;
        // 存储字符最后一次出现的位置
        Map<Character, Integer> map = new HashMap<>();
        int ans = 1, len = s.length();
        int[] dp = new int[len];
        dp[0] = 1;
        map.put(s.charAt(0), 0);
        for (int i = 1; i < len; i++) {
            int lastindex = map.getOrDefault(s.charAt(i), -1);
            if (lastindex != -1 && dp[i-1] >= i-lastindex) {
                dp[i] = i-lastindex;
            } else {
                dp[i] = dp[i-1]+1;
            }
            map.put(s.charAt(i), i);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
