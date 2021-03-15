package top.xyzhang.offer;

import java.util.HashMap;
import java.util.Map;

public class Solution56II {
    public static void main(String[] args) {
        int[] nums = new int[]{9,1,7,9,7,9,7};
        singleNumber(nums);
    }
    // 方法1: 普通方法直接使用map
    public static int singleNumber(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
            }
        }
        return ans;
    }

    // 方法2
    public static int singleNumber2(int[] nums) {

    }
}
