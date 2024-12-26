//Use the following sorting algorithms to sort an array in DESCENDING order :a.Bubble Sort b.Selection Sort c.Insertion Sort. You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]

public class PO15 {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        // we select the smallest elemet and pop it in the begeninng
        for (int i = 0; i < arr.length - 1; i++) {
            int largest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[largest] < arr[j]) {
                    largest = j;
                }
            }
            // swap
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            // focus on swaping (made a clutter in swaping)
        }
    }

    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubbleSort(arr);
        System.out.print("Bubble Sort : ");
        printArray(arr);
        selectionSort(arr);
        System.out.print("Selection Sort : ");
        printArray(arr);
        InsertionSort(arr);
        System.out.print("Insertion Sort : ");
        printArray(arr);

    }
}
