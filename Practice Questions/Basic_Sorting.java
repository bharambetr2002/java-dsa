public class Basic_Sorting {

    public static void bubbleSort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) {
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = array[minPos];
            array[minPos] = array[turn];
            array[turn] = temp;
        }
    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int curr = array[i];
            int prev = i - 1;
            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = { 5, 4, 1, 3, 2 };

        System.out.println("Before Sorting:");
        printArray(array); // Call to print the unsorted array

        // bubbleSort(array); // Call to sort the array using Bubble Sort
        // selectionSort(array);

        insertionSort(array);

        System.out.println("After Sorting:");
        printArray(array); // Call to print the sorted array

    }
}
