package top.xyzhang.offer;

public class Solution58II {
    public static void main(String[] args) {
        String s = "zhanghaoyu";
        Solution58II solution58II = new Solution58II();
        System.out.println(solution58II.reverseLeftWords(s, 2));
    }
    public String reverseLeftWords(String s, int n) {
        if (s.length() < n) return s;
        StringBuffer ans = new StringBuffer();
        ans.append(s.substring(n));
        ans.append(s.substring(0, n));
        return ans.toString();
    }
}
