package top.xyzhang.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中只出现一次的数
 */
public class Solution50 {
    public static void main(String[] args) {

    }
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        // 哈希表只用于存储字符是否出现超过一次
        Map<Character, Boolean> map = new HashMap<>();
        // 遍历记录出现字符次数
        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], Boolean.TRUE);
            } else {
                if (map.get(chars[i])) {
                    map.put(chars[i], false);
                }
            }
        }
        // 再次遍历字符串s 找出第一个只出现一次的字符
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i])) {
                return chars[i];
            }
        }
        return ' ';
    }
}
