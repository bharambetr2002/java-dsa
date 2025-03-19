// Print Pattern the star pattern where no of stars = no. of lines

import java.util.Scanner;

public class PQ1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of stars you wanna print :- ");
        int a = scn.nextInt();
        int n = 0;
        while (n < a) {
            for (int b = 1; b <= a; b++) {
                System.err.print("*");
            }
            n++;
            System.out.println();
        }
        scn.close();
    }
}
