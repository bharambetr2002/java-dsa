//Write a program to find the factorial of any number entered by the user

import java.util.Scanner;

public class pq38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.println("Enter Number: ");
        num = scn.nextInt();

        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        System.out.println("Factorial "+ fact);
    }
}
