public class Array_BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) { // left
                end = mid - 1;
            } else { // right
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        int key = 88;
        System.err.println("Index key =" + binarySearch(numbers, key));
    }
}
