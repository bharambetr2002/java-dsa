//Print numbers from 1 to n

import java.util.Scanner;

public class PQ10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want to print up too : ");
        int a = scn.nextInt();
        int n = 0;
        while (n <= a) {
            System.out.print(n + " ");
            n++;
        }
        scn.close();
    }
}
