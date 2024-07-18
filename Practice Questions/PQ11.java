//print sum of first n natural numbers using while loop

import java.util.Scanner;

public class PQ11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number you want addition up too : ");
        int a = scn.nextInt();
        int b = 0;
        int sum = 0;
        while (b <= a) {
            sum += b;
            b++;
        }
        System.out.println("The sums is " + sum);
        scn.close();
    }
}
