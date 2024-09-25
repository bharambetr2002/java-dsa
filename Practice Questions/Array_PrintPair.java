public class Array_PrintPair {
    public static void printPair(int array[]) {
        int totalpair = 0;
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + current + "," + array[j] + ") ");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("Total Pais : " +  totalpair);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        printPair(array);

    }
}
