// In a program, input 3 numbers :A,B,C. You have to outut the average of these 3 numbers.

import java.util.Scanner;

public class pq1{
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.print("Number 1:");
        int a = scn.nextInt();
        System.out.print("Number 2:");
        int b = scn.nextInt();
        System.out.print("Number 3:");
        int c = scn.nextInt();

        int avg = (a + b + c )/3;

        System.out.print("Average:");
        System.out.println( avg );

        scn.close();
    }
}