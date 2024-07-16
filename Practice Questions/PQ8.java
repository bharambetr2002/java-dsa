//Write a Java program that takes a year from the user and print whether that year is a leap year or not.

import java.util.Scanner;

public class PQ8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the year you want to check : ");
        int a = scn.nextInt();
        if((a%4==0 && a%100 !=0 && a%400==0) || (a%4==0 && a%100 != 0)){
            System.out.println("Year you entered is a leap year");
        }
        else {
            System.out.println("Year you entered is a Not a leap year");
        }
        scn.close();
    }
}
