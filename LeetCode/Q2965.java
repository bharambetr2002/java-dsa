package LeetCode;

public class Q2965 {
    public static void main(String[] args) {
        int[][] arr = {
                { 9, 1, 7 },
                { 8, 9, 2 },
                { 3, 4, 6 }
        };

        int a = -1, b;
        int[] array = new int[9];
        int sum = 0;
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean isDuplicate = false;
                sum += arr[i][j];

                for (int m = 0; m < k; m++) {
                    if (array[m] == arr[i][j]) {
                        isDuplicate = true;
                        a = arr[i][j];
                        break;
                    }
                }

                if (isDuplicate) {
                    array[k] = 0;
                } else {
                    array[k] = arr[i][j];
                }
                k++;
            }
        }
        int expectedSum = (9 * 10) / 2;
        b = expectedSum - sum + a;

        System.out.println("Duplicate Number: " + a);
        System.out.println("Missing Number: " + b);
    }
}

// Better aproach

// class Solution {
// public int[] findMissingAndRepeatedValues(int[][] grid) {
// int n = grid.length;
// int size = n * n;
// int[] freq = new int[size + 1];

// int repeated = -1, sum = 0;

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// int num = grid[i][j];
// sum += num;

// if (freq[num] == 1) {
// repeated = num;
// }
// freq[num]++;
// }
// }

// int expectedSum = (size * (size + 1)) / 2;
// int missing = expectedSum - (sum - repeated);

// return new int[] { repeated, missing };
// }
// }
