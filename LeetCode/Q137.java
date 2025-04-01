package LeetCode;

import java.util.Arrays;

public class Q137 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ret = nums[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) {
                ret = nums[i];
                break;
            }
        }

        return ret;
    }
}
// leetcode solution brute force solution