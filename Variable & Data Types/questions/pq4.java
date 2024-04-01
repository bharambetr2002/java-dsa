// Create a program for product of 2 numbers

import java.util.Scanner;

public class pq4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int a = scn.nextInt();
        System.out.println("Enter Number 2 : ");
        int b = scn.nextInt();
        int product = a * b;
        System.out.println("Product of Two numbes = " + product);
        scn.close();
    }
}
