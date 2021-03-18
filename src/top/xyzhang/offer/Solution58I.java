package top.xyzhang.offer;

import java.util.ArrayList;
import java.util.List;

public class Solution58I {
    public static void main(String[] args) {
        Solution58I solution58I = new Solution58I();
        System.out.println(solution58I.reverseWords3("a good   example"));
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
    // 2. 分割倒叙法 也可以使用正则表达式但是效率较低
    public String reverseWords2(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] s1 = s.trim().split(" ");
        for (int i = s1.length-1; i >= 0; i--) {
            if (!s1[i].equals(" ")) {
                stringBuffer.append(s1[i] + " ");
            }
        }
        return stringBuffer.toString().trim();
    }
    // 3. 双指针
    public String reverseWords3(String s) {
        s = s.trim(); // 删除首尾空格
        int j = s.length() - 1, i = j;
        StringBuilder res = new StringBuilder();
        while(i >= 0) {
            while(i >= 0 && s.charAt(i) != ' ') i--; // 搜索首个空格
            res.append(s.substring(i + 1, j + 1) + " "); // 添加单词
            while(i >= 0 && s.charAt(i) == ' ') i--; // 跳过单词间空格
            j = i; // j 指向下个单词的尾字符
        }
        return res.toString().trim(); // 转化为字符串并返回
    }
}
