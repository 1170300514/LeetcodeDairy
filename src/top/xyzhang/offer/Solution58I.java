package top.xyzhang.offer;

import java.util.ArrayList;
import java.util.List;

public class Solution58I {
    public static void main(String[] args) {
        Solution58I solution58I = new Solution58I();
        System.out.println(solution58I.reverseWords("a good   example"));
    }
    // 1. 转为字符数组遍历
    public String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        char[] characters = s.toCharArray();
        int start = 0, end = 0;
        String target = "";
        for (int i = 0; i < characters.length; i++) {
            if (!Character.isWhitespace(characters[i])) {
                target += characters[i];
            } else {
                if (target != "") list.add(target);
                target = "";
            }
        }
        if (target != "") list.add(target);

        String ans = "";
        for (int i = list.size()-1; i >= 0; i--) {
            ans += list.get(i);
            if (i != 0) ans += " ";
        }
        return ans;
    }
    // 2. 正则表达式
    public String reverseWords2(String s) {
        String ans = "";
        String pattern = "\\s+";

        return ans;
    }
}
