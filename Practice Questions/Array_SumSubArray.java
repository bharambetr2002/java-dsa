//by bruteforce

public class Array_SumSubArray {
    public static void subArray(int array[]) {
        int currentsum;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                currentsum = 0;

                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    currentsum += array[k];
                }

                System.out.println();
                System.out.println("Current sum: " + currentsum);

                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
            System.out.println();
        }

        System.out.println("Max sum: " + maxsum);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        subArray(array);
    }
}
