package top.xyzhang.offer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution56I {
    public static void main(String[] args) {
        int[] nums = {1,2,10,4,1,4,3,3};
        System.out.println(singleNumbers(nums));
    }
    public static int[] singleNumbers(int[] nums) {
//        int[] ans = new int[2];
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (list.contains(nums[i])) {
//                list.remove((Integer) nums[i]);
//            } else {
//                list.add(nums[i]);
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            ans[i] = list.get(i);
//        }
//        return ans;
        // 方法二使用异或求解
        // 1. 全员异或 相当于两个不同的数异或
        int allinone = 0;
        for (int i = 0; i < nums.length; i++) {
            allinone = allinone ^ nums[i];
        }
        // 2. 依据异或得到的结果进行分组 使得两个不同的数字分别分入两组中
        int mask = 1;

        while ((allinone & mask) == 0) {// !!!只能用0来进行区分
            mask <<= 1;
        }
        // 3. 此时mask为两个集合的区分位 用该mask区分集合
        int a=0,b=0;
        for (int i = 0; i < nums.length; i++) {
            if ((mask & nums[i]) == 0) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }
        return new int[]{a, b};
    }
}
