package top.xyzhang.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution57II {
    public static void main(String[] args) {
        Solution57II solution57II = new Solution57II();
        solution57II.findContinuousSequence(15);
    }
    public int[][] findContinuousSequence(int target) {

        List<int[]> ansList = new ArrayList<>();
        for (int i = 1; i < target; i++) {
            int sum = 0;
            for (int j = i; j < target; j++) {
                sum += j;
                if (sum == target) {
                    ansList.add(getArray(i,j));
                    break;
                }
                if (sum > target) break;
            }
        }
        return ansList.toArray(new int[ansList.size()][]);
    }

    public int[] getArray(int a , int b) {
        int[] arr = new int[b-a+1];
        for (int i = 0; i < b-a+1; i++) {
            arr[i] = a + i;
        }
        return arr;
    }
}
