package LeetCode;

public class Q169 {
    public static int main() {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        int majority = nums[0];
        int votes = 1;
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else
                votes--;
        }
        return majority;
    }
}

// Bruite Force
//
// public class Q169 {
// public static int count() {
// int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
// int[] visitedArr = new int[nums.length];
// int visited = -1;

// for (int i = 0; i < nums.length; i++) {
// // Skip
// if (visitedArr[i] == visited) {
// continue;
// }

// int count = 1;
// for (int j = i + 1; j < nums.length; j++) {
// if (nums[i] == nums[j]) {
// count++;
// visitedArr[j] = visited; // Mark element as visited
// }
// }

// // Check if the current element is the majority element
// if (count > nums.length / 2) {
// return nums[i];
// }
// }

// return -1; // Default return in case no majority element is found
// }

// public static void main(String[] args) {
// System.out.println("Majority Element: " + count());
// }
// }
