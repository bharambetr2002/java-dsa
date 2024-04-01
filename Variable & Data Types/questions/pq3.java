//sum of 2 numbers using dynamic input

import java.util.Scanner;

public class pq3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number a :");
        int a = scn.nextInt();
        System.out.println("Enter number b :");
        int b = scn.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
        scn.close();
    }
}
