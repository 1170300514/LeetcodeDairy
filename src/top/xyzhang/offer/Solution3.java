package top.xyzhang.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * 找到重复数字
 */
public class Solution3 {
    public static void main(String[] args) {

    }
    // 常规方法 set存储
    public int findRepeatNumber(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashset.contains(nums[i])) {
                return nums[i];
            }
            hashset.add(nums[i]);
        }
        return -1;
    }
    // 原地置换 将数字与索引建立联系
    public int findRepeatNumber2(int[] nums) {
        int i = 0, len = nums.length;
        while (i < len) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            int tmp = nums[i];
            nums[i] = nums[nums[i]];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
