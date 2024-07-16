//Write a Java program to input week number (1-7) and print day of week name using switch case.

import java.util.Scanner;

public class PQ7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = scn.nextInt();
        switch (a) {
            case 1:
                // case 8 : adding multiple cases for one print
                System.out.println("Its A Monday");
                break;
            case 2:
                System.out.println("Its A Tuesday");
                break;
            case 3:
                System.out.println("Its A Wednesday");
                break;
            case 4:
                System.out.println("Its A Thrusday");
                break;
            case 5:
                System.out.println("Its A Friday");
                break;
            case 6:
                System.out.println("Its A Saturday");
                break;
            case 7:
                System.out.println("Its A Sunday");
                break;
            default:
                System.out.println("Please enter number between 1-7");
        }
        scn.close();
    }
}
