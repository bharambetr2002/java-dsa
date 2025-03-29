package LeetCode;

import java.util.Arrays;

//leetcode solution

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = m + n;
        int[] array = new int[c];

        for (int i = 0; i < m; i++) {
            array[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            array[m + i] = nums2[i];
        }

        Arrays.sort(array);

        for (int i = 0; i < c; i++) {
            nums1[i] = array[i];
        }
    }
}
