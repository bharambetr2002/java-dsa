//In a program, input 3 numbers: A, B and C. You have to out put the average of these 3 numbers

import java.util.Scanner;

public class pq6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input Number 1 : ");
        int a = scn.nextInt();
        System.out.println("Input Number 2 : ");
        int b = scn.nextInt();
        System.out.println("Input Number 3 : ");
        int c = scn.nextInt();
        double avg = (a + b + c) / 3;
        System.out.println("Average of 3 numbers is : " + avg);
        scn.close();
    }
}
