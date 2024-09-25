public class Array_PrintSubArray {
    public static void subArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        subArray(array);
    }
}
