//Write a program to find the sum of the given series 1+2+3+ . . . . . . (n terms) 

package GeeksForGeeks;

import java.util.Scanner;

public class PQ1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long a = scn.nextInt();
        long sum = 0;
        long b = 0;
        while (b <= a) {
            sum = sum + b;
            b++;
        }
        System.out.println(sum);
        scn.close();
    }
}
